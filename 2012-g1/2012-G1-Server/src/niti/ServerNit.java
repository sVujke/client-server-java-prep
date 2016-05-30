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
import javax.swing.JComboBox;

/**
 *
 * @author vujke
 */
public class ServerNit extends Thread {
    
    List<KlijentNit> klijenti = new ArrayList<KlijentNit>();
    ServerSocket s;
    Socket klijentSoket;
    JComboBox<String> jCombo;
    List<String> imena = new ArrayList<>();

    public ServerNit(JComboBox<String> jCombo) {
        this.jCombo = jCombo;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void run() {
        
        try {
            s = new ServerSocket(9000);
            
            while (true) {
                
                    
                    System.out.println("server ceka");
                    klijentSoket = s.accept();
                    System.out.println("pravi se nit");
                    KlijentNit nit = new KlijentNit(klijentSoket, jCombo, imena, klijenti);
                    klijenti.add(nit);
                    nit.start();
                    System.out.println("startovan klijent nit");
                    
               
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
