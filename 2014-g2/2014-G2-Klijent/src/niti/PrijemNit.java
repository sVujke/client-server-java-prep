/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author vujke
 */
public class PrijemNit extends Thread {
    BufferedReader in;
    PrintStream out;
    Socket soket;
    List<String> uneti = new ArrayList<>();
    String poruka = null;
    JLabel unetiKarakteri;
    JLabel brIzbrisanih;
    JLabel statusIgre;
    int counter = 0;
    JButton obrisi;

    public PrijemNit(JLabel unetiKarakteri, JLabel brIzbrisanih,
            JLabel statusIgre,BufferedReader in,
    PrintStream out,
    Socket soket,JButton obrisi) {
        
        this.unetiKarakteri = unetiKarakteri;
        this.brIzbrisanih = brIzbrisanih;
        this.statusIgre = statusIgre;
        this.in = in;
        this.out = out;
        this.soket = soket;
        this.obrisi = obrisi;
    }
    
    
    
    @Override
    public void run() {
            System.out.println("PRIJEM NIT");
        try {
            
            
            while (true) {   
                System.out.println("PRIJEM NIT CEKA");
                poruka = in.readLine();
                System.out.println("PORUKA: "+poruka);
                
                
                if(poruka.length() == 1){
                    unetiKarakteri.setText(unetiKarakteri.getText()+" "+poruka);
                    counter++;
                    brIzbrisanih.setVisible(true);
                    brIzbrisanih.setText(""+counter);
                } else if(poruka.equals("kraj")){
                    System.out.println("KRAJ: "+poruka);
                    statusIgre.setText("KRAJ IGRE");
                    obrisi.setEnabled(false);
                }
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
