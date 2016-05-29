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
import javax.swing.JTable;
import tbl.TblModel;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread {
    JTable tabela;
    List<KlijentNit> klijenti;
    Socket soket;
    List<String> korisnickiNalozi;
    PrintStream out;
    BufferedReader in;
    String ime = null;

    public KlijentNit(JTable tabela, List<KlijentNit> klijenti, Socket soket, List<String> korisnickiNalozi) {
        this.tabela = tabela;
        this.klijenti = klijenti;
        this.soket = soket;
        this.korisnickiNalozi = korisnickiNalozi;
        //this.out = out;
        //this.in = in;
    }

    @Override
    public void run() {
        try {
            System.out.println("usao u klijent nit");
            in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            System.out.println("nesto");
            out = new PrintStream(soket.getOutputStream());
            
            String ki = in.readLine();
            
            while (true) {                
                if(ki.equals("admin1") || ki.equals("admin2") || ki.equals("user1") || ki.equals("user2")){
                    if(korisnickiNalozi.contains(ki)){
                        out.println("Korisnik vec postoji.");
                        continue;
                    } else {
                        out.println("da");
                        korisnickiNalozi.add(ki);
                        ime = ki;
                        for (String s : korisnickiNalozi) {
                            System.out.println(s);
                        }
                        System.out.println("---------------");
                        break;
                        
                    }
                    
                } else{
                    out.println("ne");
                    ki = in.readLine();
                }
            }
            
            while (true) {                
                int pozicija = Integer.parseInt(in.readLine());
                TblModel tbl = (TblModel) tabela.getModel();
                long[] rez = tbl.promeniElement(pozicija);
                for (KlijentNit klijent : klijenti) {
                    klijent.out.println("Korisnik " + ime + " je izbacio element sa pozicije " + pozicija + "("+rez[0]+")"+" i zamenio ga brojem "+rez[1]);
                }
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
