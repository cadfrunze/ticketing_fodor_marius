package org.example.data.base;
import org.example.model.StocBilete;
import org.example.model.User;

import java.io.Console;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.example.model.InfoUser;

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
                        return true;
                    }
                }
                return false;
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
        int cantitate = 1;
        String sqlQuery = "SELECT * FROM stoc_bilete WHERE cantitate >= ?";
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
    
    public InfoUser getInfoUser(String serie_ticket, String cnp)
    {
        String sqlquery = "SELECT * from evidenta_clienti WHERE cnp = ?";
        String nume = null, prenume = null, email = null, telefon = null, validare = null;
        int idEvClienti = 0;
        try (PreparedStatement st = connection.prepareStatement(sqlquery))
        {
            st.setString(1, cnp);
            try (ResultSet rs = st.executeQuery())
            {
                while (rs.next())
                {
                    nume = rs.getString("nume");
                    prenume = rs.getString("prenume");
                    
                    email = rs.getString("email");
                    telefon = rs.getString("telefon");
                    idEvClienti = rs.getInt("idevidenta_clienti");
                }
            }
            catch (Exception e){e.printStackTrace();}
        }
        catch (Exception e){e.printStackTrace();}
        sqlquery = "SELECT validare from stoc_bilete_cumparate WHERE serie_ticket = ? AND fk_idevidenta_clienti = ?";
        try (PreparedStatement st = connection.prepareStatement(sqlquery))
        {
            st.setString(1, serie_ticket);
            st.setInt(2, idEvClienti);
            try (ResultSet rs = st.executeQuery())
            {
                while (rs.next())
                {
                    validare = rs.getString("validare");
                }
            }
            catch (Exception e){e.printStackTrace();}
        }
        catch (Exception e){e.printStackTrace();}
    return new InfoUser(nume, prenume, email, telefon, validare, idEvClienti);
    
        
    }
    public int updateTicket(int index)
    {
        String sqlValidare = "UPDATE stoc_bilete_cumparate SET validare = ? WHERE fk_idevidenta_clienti = ?";
        
        try (PreparedStatement ps = connection.prepareStatement(sqlValidare))
        {
            ps.setString(1, "1");
            ps.setInt(2, index);
            ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        return 0;
        
    }
    public int updateEmailtelefon(int index, String email, String telefon)
    {
        String sqlUpdate = "UPDATE evidenta_clienti SET email = ?, telefon = ? WHERE idevidenta_clienti = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlUpdate))
        {
            ps.setString(1, email);
            ps.setString(2, telefon);
            ps.setInt(3, index);
            ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }
    
    public void deleteData(int index)
    {
        String sql = "{CALL delete_user (?)}";
        try (CallableStatement stmt = connection.prepareCall(sql)){
            stmt.setInt(1, index);
            stmt.execute();

        }

        catch (SQLException e ) {
            e.printStackTrace();
        }
    }
}

