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
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author vujke
 */
public class ServerNit extends Thread{
    static List<KlijentNit> klijenti = new ArrayList<KlijentNit>();
    static List<String> korisnicikiNalozi = new ArrayList<>();
    JTable tabela;
    //JLabel sada;

    public ServerNit(JTable tabela) {
        this.tabela = tabela;
        //this.sada = sada;
    }

    @Override
    public void run() {
        System.out.println("ceka server");
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket soket;
            soket = serverSocket.accept();
            //Socket soket = null; 
            System.out.println("evo ga");
            KlijentNit nit = new KlijentNit(tabela, klijenti, soket, korisnicikiNalozi);
            klijenti.add(nit);
            nit.start();
            
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(ServerNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
