/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikotiinilaskuri;


import javax.swing.JOptionPane;
/**
 *
 * @author Lauri
 */
public class NikotiiniLaskuri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ohjelma kysyy E-nesteen halutun kokonaismäärän
        String maara = JOptionPane.showInputDialog("Syötä haluamasi määrä millilitroina");
        //ohjelma kysyy E-nesteen halutun nikotiini pitoisuuden prosentteina
        String nikotiini = JOptionPane.showInputDialog("Syötä haluamasi nikotiini pitoisuus prosentteina");
        // ohjelma kysyy tiivisteen  pakkauksesta löytyvän suositus sekoitus suhteen (esim. 20%)
        String tiiviste = JOptionPane.showInputDialog("Syötä tiivisteen määrä prosentteina");
        
        
        //muutetaan arvot stringeistä doubleiksi
        double ml = Double.parseDouble(maara);
        double nctn = Double.parseDouble(nikotiini)/100; //jaetaan sadalla jotta saadaan kerroin jolla kerrotaan kokonais määrä ja saadaan haluttu millilitra määrä
                                                           //esim. nikotiinipitoisuus 4% / 100 = 0.04... kerrotaan kokonais ml kertoimella... 50ml x 0.04 = 2ml nikotiinia
        double tiivari = Double.parseDouble(tiiviste)/100;
        
        Laskin laskin = new Laskin(ml,nctn,tiivari); //luodaan uusi laskin ja syötetään arvot constructoria varten
        laskin.laske(); //kutsutaan laskimen methodi
    }
    
}
