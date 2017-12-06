/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikotiinilaskuri;

/**
 *
 * @author Lauri
 */

import javax.swing.JOptionPane;


public class Laskin {
    double ml;
    double nctn;
    double tiivari;
    private double mlNctn;
    private double mlTiivari;
    private double mlMl;
    
    
    public Laskin(double ml, double nctn, double tiivari){ // constructor
        this.ml = ml;
        this.nctn = nctn;
        this.tiivari = tiivari;
    
            if  (this.ml < 0) 
                this.ml = 0; //minimi määrä 0ml
            if  (this.ml > 100)
                this.ml=100; //maximi määrä 100ml
            if  (this.nctn > 0.1) 
                this.nctn = 0.1; //nikotiinin maksimi 10% kokonais nesteestä (isompi määrä terveydelle haitallista)
            if  (this.nctn < 0)
                 this.nctn = 0; // minimi 0%
            if  (this.tiivari > 0.5)
                 this.tiivari = 0.5; //tiivisteen määrä maksimi 50% kokonais nesteestä
            if  (this.tiivari < 0)
                this.tiivari = 0; // minimi 0%
    
    
    }
    
    public void laske(){ //laske methodi
    mlNctn = nctn*ml; //prosentti osuus millilitroiksi
    mlTiivari = tiivari*ml; 
    mlMl = ml - mlTiivari - mlNctn;
    
    
    //laskimen tulos 
    String vastaus = mlMl + "ml" + " " + "PG/VG nestettä" + "\n" + mlNctn + "ml" + " " + "Nikotiinia" + "\n" + mlTiivari + "ml" + " " + "Tiivistettä";
   
    JOptionPane.showMessageDialog(null,vastaus); //tulostetaan käyttäjälle
    
    
    
    
    
    }
}
