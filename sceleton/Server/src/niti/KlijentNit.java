/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    
    Socket soket;
    BufferedReader in;
    PrintStream out;

    public KlijentNit(Socket soket) {
        this.soket = soket;
        //this.in = in;
        //this.out = out;
    }
    
    

    @Override
    public void run() {
        
        try {
            in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            out = new PrintStream(soket.getOutputStream());            
            System.out.println("klijentNit");
            
            while (true) {
               // String poruka = in.readLine();
               // System.out.println("KLIJENT KAZE: " + poruka);
               // break;
            }
            //out.println("ciao!");
            // super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (SocketException sex) {
            System.out.println("Otkaci se klijent");
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
