package org.example.model;

public class StocBilete {
    private String tip_ticket, pret;
    private int cantitate;
//    public StocBilete(String tip_ticket, String pret, int cantitate){
//        this.tip_ticket = tip_ticket;
//        this.pret = pret;
//        this.cantitate = cantitate;
//    }


    public void setTip_ticket(String tip_ticket) {
        this.tip_ticket = tip_ticket;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public String getTip_ticket(){
        return tip_ticket;
    }
    public String getPret(){
        return pret;
    }
    public int getCantitate(){
        return cantitate;
    }

    @Override
    public String toString(){
        return "[tip_ticket: "+getTip_ticket()+" pret: "+getPret()+" cantitate: "+getCantitate()+"]";
    }
}
