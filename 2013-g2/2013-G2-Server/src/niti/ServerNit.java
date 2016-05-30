/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import model.TblModel;

/**
 *
 * @author vujke
 */
public class ServerNit extends Thread{
    
    ServerSocket s;
    BufferedReader in;
    PrintStream out;
    JLabel kada;
    JLabel sada;
    JLabel prvi;
    JLabel poslednji;
    Socket klijentSocket;
    List<KlijentNit> klijenti = new ArrayList<>();
    TblModel tbl;

    public ServerNit(JLabel kada, JLabel sada, JLabel prvi, JLabel poslednji, TblModel tbl ) {
        //this.s = s;
        //this.in = in;
       // this.out = out;
        this.kada = kada;
        this.sada = sada;
        this.prvi = prvi;
        this.poslednji = poslednji;
        this.tbl = tbl;
    }

    @Override
    public void run() {
        kada.setText(vreme());
        
        try {
            s = new ServerSocket(9000);
            
            while (true) {             
                System.out.println("server ceka");
                klijentSocket = s.accept();
                KlijentNit nit = new KlijentNit(klijentSocket, tbl);
                nit.start();
                klijenti.add(nit);
                System.out.println(klijenti.size());
                if(klijenti.size()==1){
                    System.out.println("trebalo bi PRVI");
                      prvi.setText(vreme());
                      prvi.setVisible(true);
                }
                System.out.println("trebalo bi Poslednji");
                poslednji.setText(vreme());
                poslednji.setVisible(true);
            }
            //  super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String vreme() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String vreme = sdf.format(new Date());
        return vreme;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
