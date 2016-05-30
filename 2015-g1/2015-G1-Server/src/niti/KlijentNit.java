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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    List<String> email = new ArrayList<>();
    List<String> pass = new ArrayList<>();
    List<KlijentNit> klijenti;
    BufferedReader in;
    PrintStream out;
    Socket soket;
    List<String> gradovi = new ArrayList<>();
    List<String> predmeti = new ArrayList<>();
    List<String> klubovi = new ArrayList<>();
    String vrati=null;
    List<String> koriscenaSlova = new ArrayList<>();
    String vratiFormatirano;

    KlijentNit(List<String> email, List<String> pass, List<KlijentNit> klijenti, Socket soket) {
        
        this.pass = pass;
        this.email = email;
        this.klijenti = klijenti;
        this.soket = soket;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        gradovi.add("Lisabon");
        gradovi.add("Beograd");
        gradovi.add("Nica");
        klubovi.add("Spartak");
        klubovi.add("Partizan");
        klubovi.add("Zvezda");
        predmeti.add("Ekonomija");
        predmeti.add("oikt");
        predmeti.add("prosoft");
        
        System.out.println("Klijent nit");
        try {
            in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            out = new PrintStream(soket.getOutputStream());
            String kredencijali = in.readLine().replace("###", "");
            String niz[] = new String[2];
            niz = kredencijali.split("/");
            String pas = niz[1];
            System.out.println(pas);
            String mejl = niz[0];
            System.out.println(mejl);
            boolean b = false;
            while(true){
                for (int i = 0; i < pass.size(); i++) {
                    if(pass.get(i).equals(pas) && email.get(i).equals(mejl)){
                        out.println("ok");
                        b = true;
                    }
                    
                }
                
                if(b){
                    break;
                } else {
                    out.println("ne");
                    kredencijali = in.readLine().replace("###", "");
                }
            }
            
            while (true) {           
                String s = in.readLine();
                int kat = Integer.parseInt(s);
                int num = (int) Math.round(Math.random()*2);
                System.out.println(num);
                
                if(kat == 0){
                    vrati = gradovi.get(num);
                } else if(kat == 1){
                    vrati = predmeti.get(num);
                } else if(kat == 2){
                    vrati = klubovi.get(num);
                }
                System.out.println(vrati);
                String vf ="";
                for (int i = 0; i < vrati.length(); i++) {
                    vf = vf+"*";
                }
                out.println(vf);
                break;
            }
            int counter = 0;
            
            while (true) {           
                
                String slovo = in.readLine();
                System.out.println("Slovo "+slovo);
                koriscenaSlova.add(slovo);
                vratiFormatirano = "";
                boolean zvezdica = true;
                for (int i = 0; i < vrati.length(); i++) {
                    zvezdica = true;
                    for (int j = 0; j < koriscenaSlova.size(); j++) {
                        if(vrati.charAt(i) == koriscenaSlova.get(j).charAt(0)){
                            vratiFormatirano = vratiFormatirano+koriscenaSlova.get(j).charAt(0);
                            zvezdica = false;
                        }
                    }
                    if(zvezdica){
                        vratiFormatirano = vratiFormatirano+"*";
                    }
                }
                
                System.out.println("br pokusaja: "+koriscenaSlova);
                
                if(koriscenaSlova.size() == vratiFormatirano.length()+8 ||
                        !vratiFormatirano.contains("*")){
                    
                    out.println("kraj");
                    //Thread.
                    break;
                }
                
                
                
                out.println(vratiFormatirano);
                System.out.println("Ovo server vraca: "+ vratiFormatirano);
                
                //if(koriscenaSlova.size() == )
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
