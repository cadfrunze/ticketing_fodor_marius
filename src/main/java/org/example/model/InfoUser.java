/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

/**
 *
 * @author cadfrunze
 */
public class InfoUser {
    
    private String nume, prenume, email, telefon, validare;
    private int idEvClienti;
  
    
    public InfoUser(String nume, String prenume, String email, String telefon, String validare, int idEvClienti)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.telefon = telefon;
        this.validare = validare;
        this.idEvClienti = idEvClienti;
        
    }
    
    public String getNume(){return this.nume;}
    
    public String getPrenume(){return this.prenume;}
    
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}
    
    public String getTelefon(){return this.telefon;}
    public void setTelefon(String telefon){this.telefon = telefon;}
    
    public String getValidare(){return this.validare;}
    public void setValidare(String validare){this.validare = validare;}
    
    public int getIdEvClienti(){return this.idEvClienti;}
    
    
//    @Override
//    public String toString()
//    {
//        return "[nume: "+this.nume+" prenume: "+this.prenume+" email: "+email+" telefon: "+telefon+" validare: "+validare+" idEvClienti: "+idEvClienti;
//    }
    
    
    
    
    
    
}
