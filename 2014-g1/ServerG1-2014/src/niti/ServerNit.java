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
    
    ServerSocket s = null;
    List<Integer> listaBrojeva;
    static List<KlijentNit> klijenti = new ArrayList<>();
    
    public ServerNit(){
    }

    public ServerNit(List<Integer> listaBrojeva) {
        this.listaBrojeva = listaBrojeva;
    }

    @Override
    public void run() {
        
        try {
            s = new ServerSocket(9000);
            System.out.println("Server nit " + listaBrojeva.get(0));
            Socket klijentSocket;
            
            while(true){
                klijentSocket = s.accept();
                KlijentNit nit = new KlijentNit(klijentSocket, listaBrojeva, klijenti);
                klijenti.add(nit);
                nit.start();
            }
            // super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
