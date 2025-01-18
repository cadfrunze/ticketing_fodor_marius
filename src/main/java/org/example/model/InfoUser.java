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
    
//    public String getNume(){return nume;}
//    //public void setNume(String nume){this.nume = nume;}
//    public String getEmail(){return email;}
//    public String getTelefon(){return telefon;}
    
    @Override
    public String toString()
    {
        return "[nume: "+this.nume+" prenume: "+this.prenume+" email: "+email+" telefon: "+telefon+" validare: "+validare+" idEvClienti: "+idEvClienti;
    }
    
    
    
    
    
    
}
