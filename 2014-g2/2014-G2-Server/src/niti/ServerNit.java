/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

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
public class ServerNit extends Thread {
    ServerSocket s;
    Socket klijentSoket;
    List<String> uneti;
    List<KlijentNit> klijenti = new ArrayList<>();

    public ServerNit(List<String> uneti) {
        this.uneti = uneti;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        try {
            s = new ServerSocket(9000);            
            
            while (true) {
                
                System.out.println("Server ceka");
                klijentSoket =s.accept();
                KlijentNit nit = new KlijentNit(klijentSoket, uneti, klijenti);
                nit.start();
                klijenti.add(nit);
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
