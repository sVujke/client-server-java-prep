/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author vujke
 */
public class KomNit extends Thread{
    Socket soket;
    BufferedReader in;
    PrintStream out;
    JTextField txt;
    
    public KomNit() {
    }

    public KomNit(Socket soket, BufferedReader ulaz, PrintStream izlaz, JTextField txt) {
        this.soket = soket;
        this.in = ulaz;
        this.out = izlaz;
        this.txt = txt;
    }

    @Override
    public void run() {
        while (true) {            
            try {
                String poruka = in.readLine();
                txt.setText(poruka);
            } catch (IOException ex) {
                Logger.getLogger(KomNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       // super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
