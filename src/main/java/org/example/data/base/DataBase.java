package org.example.data.base;
import org.example.model.StocBilete;
import org.example.model.User;

import java.io.Console;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataBase {
    private final String DB_URL = "jdbc:mysql://" + System.getenv("urlAdress");
    private final String USER = System.getenv("userDb");
    private final String PASS = System.getenv("passDb");
    private Connection connection;

    public DataBase() throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

     public boolean checkCnp(String cnp) throws SQLException{
        String sqlQuery = "SELECT cnp FROM evidenta_clienti";
        try (Statement st = connection.createStatement()){
            try (ResultSet resultSet = st.executeQuery(sqlQuery)){
                while (resultSet.next()){
                    String cnpData = resultSet.getString("cnp");
                    if (Objects.equals(cnpData, cnp)){
                        return false;
                    }
                }
                return true;
            }
            catch (Exception e){return false;}

        }
        catch (SQLException e){e.printStackTrace();}
        return false;
    }

    public void insertNewClient(User user)throws SQLException{
        String sql = "{Call AddUser (?, ?, ?, ?, ?, ? ,?, ?)}";
        try (CallableStatement stmt = connection.prepareCall(sql)){
            stmt.setString(1, user.get_nume());
            stmt.setString(2, user.get_prenume());
            stmt.setString(3, user.get_cnp());
            stmt.setString(4, user.get_email());
            stmt.setString(5, user.get_telefon());
            stmt.setString(6, user.get_tipTicket());
            stmt.setString(7, user.get_serieTicket());
            stmt.setInt(8, 0);
            stmt.execute();

        }

        catch (SQLException e ) {
            e.printStackTrace();
        }
    }
    public List<StocBilete> getStocBilete(){
        int cantitate = 0;
        String sqlQuery = "SELECT * FROM stoc_bilete WHERE cantitate > ?";
        List<StocBilete> stocuri = new ArrayList<>();
        try (PreparedStatement st = connection.prepareStatement(sqlQuery)){
            st.setInt(1, cantitate);
            try(ResultSet resultSet = st.executeQuery()){
                while (resultSet.next()){
                    StocBilete stoc = new StocBilete();
                    stoc.setTip_ticket(resultSet.getString("tip_ticket"));
                    stoc.setPret(resultSet.getString("pret"));
                    stoc.setCantitate(resultSet.getInt("cantitate"));
                    stocuri.add(stoc);
                }
            }
            catch (Exception e){e.printStackTrace();}
        }
        catch (Exception e){e.printStackTrace();}
        return stocuri;
    }
}
