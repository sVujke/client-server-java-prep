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
public class PrijemNit extends Thread {
    
    BufferedReader in;
    PrintStream out;
    Socket soket;
    JTextField porukaServera;

    public PrijemNit(BufferedReader in, PrintStream out, Socket soket, JTextField porukaServera) {
        this.in = in;
        this.out = out;
        this.soket = soket;
        this.porukaServera = porukaServera;
    }
    
    
    
    @Override
    public void run() {
        
           while (true) {            
               try {
                   String serverPoruka = in.readLine();
                   System.out.println("STIGLA SERVER PORUKA:"+serverPoruka);
                   if(serverPoruka.startsWith("@")){
                       String p = serverPoruka.replace("@", "");
                       porukaServera.setText(p);
                   }
                   //porukaServera.setText(serverPoruka);
               } catch (IOException ex) {
                   Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
//super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
