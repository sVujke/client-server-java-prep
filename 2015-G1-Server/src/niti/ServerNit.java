/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class ServerNit extends Thread{
    List<String> email = new ArrayList<>();
    List<String> pass = new ArrayList<>();
    List<KlijentNit> klijenti = new ArrayList<>();
    
    @Override
    public void run() {
        email.add("s@s");
        pass.add("a1");
        
        try {
            
            ServerSocket serverSoket = new ServerSocket(9000);
            Socket soket;
            while (true) {          
                System.out.println("Server ceka");
                soket = serverSoket.accept();
                // pravim instancu Klijent Nit 
                KlijentNit nit = new KlijentNit(email, pass, klijenti, soket);
                nit.start();
                 System.out.println("instanciran klijent");
            }
            
            
            // super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
