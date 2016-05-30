package niti;


import gui.KlijentLogin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vujke
 */
public class PrijemNit extends Thread{
    Socket soket;
    BufferedReader in;
    PrintStream out;
    JLabel rec;
    boolean kraj;

    public PrijemNit(Socket soket, BufferedReader in, PrintStream out, JLabel rec, boolean kraj) {
        this.soket = soket;
        this.in = in;
        this.out = out;
        this.rec = rec;
        this.kraj = kraj;
    }

    @Override
    public void run() {
        
        while (true) {            
            try {
               
                String poruka = in.readLine();
                 if(!poruka.startsWith("kra")){
                     rec.setText(poruka);
                 }else{
                     break;
                 }
                
                
            } catch (IOException ex) {
                Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showConfirmDialog(KlijentLogin, "nesto");
            }
        }
       // super.run(); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
}
