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
import javax.swing.JOptionPane;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread {
    
    Socket klijentSoket;
    List<Integer> listaBrojeva;
    List<KlijentNit> klijenti;
    
    BufferedReader ulaz;
    PrintStream izlaz;

    public KlijentNit(Socket klijentSoket, List<Integer> listaBrojeva, List<KlijentNit> klijenti) {
        this.klijentSoket = klijentSoket;
        this.listaBrojeva = listaBrojeva;
        this.klijenti = klijenti;
    }
 
   /* ulaz = new BufferedReader(new InputStreamReader(klijentSoket.getInputStream()));
    izlaz = new PrintStream(klijentSoket.getOutputStream()); */

    @Override
    public void run() {
        
        try {
            ulaz = new BufferedReader(new InputStreamReader(klijentSoket.getInputStream()));
            izlaz = new PrintStream(klijentSoket.getOutputStream());
            
            while (true) {                
                String znak = ulaz.readLine();
                System.out.println("Klijent kliknuo obrisi");
                if(!listaBrojeva.isEmpty()){
                    int broj = listaBrojeva.get(0);
                    listaBrojeva.remove(0);
                    
                    for (KlijentNit k : klijenti) {
                        if(!k.klijentSoket.equals(klijentSoket)){
                            broj = -1;
                        }
                        
                        int obrisanih = 4 - listaBrojeva.size();
                        k.izlaz.println(broj + "/" + obrisanih);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Obrisani su svi brojevi!");
                    for (KlijentNit klijent : klijenti) {
                        klijent.izlaz.println("Igra je zavrsena!");
                    }
                }
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
