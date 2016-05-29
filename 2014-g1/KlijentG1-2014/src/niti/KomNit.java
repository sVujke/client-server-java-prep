/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author vujke
 */
public class KomNit extends Thread {
    
    Socket soketZaKomunikaciju;
    BufferedReader ulaz;
    JLabel brojevi;
    JLabel ukupno;
    JButton dugme;
    JLabel status;

    public KomNit(Socket soketZaKomunikaciju, JLabel brojevi, JLabel ukupno, JButton dugme, JLabel status) {
        this.soketZaKomunikaciju = soketZaKomunikaciju;
       // this.ulaz = ulaz;
        this.brojevi = brojevi;
        this.ukupno = ukupno;
        this.dugme = dugme;
        this.status = status;
    }

    @Override
    public void run() {
        
        try {
            ulaz = new BufferedReader(new InputStreamReader(soketZaKomunikaciju.getInputStream()));
            
            //String poruka = ulaz.readLine();
            //System.out.println("Klijent "+poruka);
            
            
            while(true){
                String poruka = ulaz.readLine();
                System.out.println("Klijent "+poruka);
                if (!poruka.startsWith("Igra")) {
                    String[] porukaOdServera = poruka.split("/");
                    if (!porukaOdServera[0].equals("-1")) {
                        brojevi.setText(brojevi.getText() + " " + porukaOdServera[0]);
                    }
                    ukupno.setText(porukaOdServera[1]);
                } else {
                    status.setText(poruka);
                    dugme.setEnabled(false);
                    status.setText("Igra je gotova!");
                    return;
                }
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            //Logger.getLogger(KomNit.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Otkacio se klijent");
        }
    }
    
    
}
