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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class PrijemNit extends Thread {
    
    Socket soket;
    BufferedReader in;
    PrintStream out;
    
    @Override
    public void run() {
        System.out.println("PrijemNit");
        try {
           // soket = new Socket("localhost", 9000);
           // in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
           // out = new PrintStream(soket.getOutputStream());
           // out.println("hello!");
            
            while (true) {
                String s = in.readLine();
                System.out.println("SERVER KAZE: "+s);
            }
            // super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
