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
        double tiivari;
        double nctn;
        double ml;
        
        
         JOptionPane.showMessageDialog(null, "Nikotiinilaskuri" + "\n" + "Nesteen maximi määrä 100ml" + "\n" + "Nikotiinin maximi määrä 10%" + "\n" + "Tiivisteen maximi määrä 30%");
        
        //millilitran syöttö
        while (true) {
            try {
                ml = Double.parseDouble(JOptionPane.showInputDialog("Syötä haluamasi määrä millilitroina 10-100"));
                    break; // toistaa kysymyksen jos input on muu kuin numero
                    } 
                        catch (NumberFormatException ignore) {
                        }
                             catch (NullPointerException ignore){
                                }
        }
        //nikotiinin syöttö
        while (true) {
            try {
                nctn = Double.parseDouble(JOptionPane.showInputDialog("Syötä haluamasi nikotiini pitoisuus prosentteina"))/100;
                    break; // toistaa kysymyksen jos input on muu kuin numero
                    } 
                        catch (NumberFormatException ignore) {
                        }
                            catch (NullPointerException ignore){
                            }
        }
        //tiivisteen syöttö
        while (true) {
            try {
                tiivari = Double.parseDouble(JOptionPane.showInputDialog("Syötä tiivisteen määrä prosentteina"))/100;
                    break; // toistaa kysymyksen jos input on muu kuin numero
                    } 
                        catch (NumberFormatException ignore) {
                        }
                            catch (NullPointerException ignore){
                            }
        }
        
      
        
        Laskin laskin = new Laskin(ml,nctn,tiivari); //luodaan uusi laskin ja syötetään arvot constructoria varten
        laskin.laske(); //kutsutaan laskimen methodi
    }
    
}
