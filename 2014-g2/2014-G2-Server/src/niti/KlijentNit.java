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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    
    Socket soket;
    List<String> uneti;
    BufferedReader in;
    PrintStream out;
    List<KlijentNit> klijenti;

    KlijentNit(Socket klijentSoket, List<String> uneti, List<KlijentNit> klijenti) {
        this.soket = klijentSoket;
        this.klijenti = klijenti;
        this.uneti = uneti;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            out = new PrintStream(soket.getOutputStream());
            
            while (true) {                
                String klijentUnos = in.readLine();
                System.out.println("STIGLO SA KLIJENTA: "+klijentUnos);
                if(!uneti.isEmpty()){
                    String odgovor = uneti.get(0);
                    uneti.remove(uneti.get(0));
                    out.println(odgovor);
                    System.out.println("ODGOVARA SERVER: "+odgovor);
                } else {
                    out.println("kraj");
                    for (KlijentNit klijent : klijenti) {
                        klijent.out.println("kraj");
                    }
                }
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
