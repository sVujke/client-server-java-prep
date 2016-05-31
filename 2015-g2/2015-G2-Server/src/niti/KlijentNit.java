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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    
    Socket klijentSoket;
    List<KlijentNit> klijenti;
    BufferedReader in;
    PrintStream out;
    String poruka = null;
    String kategorija = null;
    String[] nizRandom;
    public KlijentNit(Socket klijentSoket, List<KlijentNit> klijenti) {
        this.klijentSoket = klijentSoket;
        this.klijenti = klijenti;
        
    }

    @Override
    public void run() {
        try {
            System.out.println("KLIJENT NIT CEKA");
            
            in = new BufferedReader(new InputStreamReader(klijentSoket.getInputStream()));
            out = new PrintStream(klijentSoket.getOutputStream());
            
            poruka = in.readLine();
            while (true) {                
                if(poruka.startsWith("#")){
                    String[] niz = poruka.split("/");
                   if(niz[0].equals("#j@j") && niz[1].equals("1s")){
                       out.println("da");
                       kategorija = niz[2];
                       nizRandom = vratiNiz(kategorija);
                       String nizString = nizUString(nizRandom);
                       break;
                   } else {
                       out.println("ne");
                       poruka = in.readLine();
                   }
                }
            }
            
            while (true) {             
                System.out.println("cekam PORUKU");
                poruka = in.readLine();
                System.out.println("STIGLO: "+poruka);
                int p = Integer.parseInt(poruka);
                String odgovor = poruka+":"+nizRandom[p];
                out.println(odgovor);
                System.out.println("Saljem klijentu: "+odgovor);
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch(SocketException sex){
                System.out.println("OTKACIO SE KLJENt");
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String[] vratiNiz(String kategorija) {
        switch(kategorija){
            case "3": return generisiNiz(3);
            case "4": return generisiNiz(4);
            case "5": return generisiNiz(5);
            default: return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String[] generisiNiz(int i) {
        String[] niz = new String[i*i];
        for (int j = 0; j < niz.length; j++) {
            niz[j] = "x";
        }
        
        int count = 0;
        while (count<3) {
            int x = Math.toIntExact(Math.round(Math.random()*(niz.length-1)));
            if(proveriDaLiJeZvezda(x, niz)){
                niz[x] = "*"; 
                count++;
            }
            
        }
        
        return niz;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean proveriDaLiJeZvezda(int x, String[] niz) {
        if(niz[x].equals("*")){
            return false;
        }
        
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nizUString(String[] nizRandom) {
        String str ="";
        for (int i = 0; i < nizRandom.length; i++) {
            str=str+"@"+nizRandom[i];
        }
        
        return str;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
