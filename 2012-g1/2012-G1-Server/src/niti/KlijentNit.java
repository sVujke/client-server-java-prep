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
import javax.swing.JComboBox;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    
    String ime;
    Socket klijentSoket;
    JComboBox<String> jCombo;
    List<String> imena;
    List<KlijentNit> klijenti;
    BufferedReader in;
    PrintStream out;
    List<Integer> brojevi = new ArrayList<>();
    String listaString;

    public KlijentNit(Socket klijentSoket, JComboBox<String> jCombo, List<String> imena, List<KlijentNit> klijenti) {
        //this.ime = ime;
        this.klijentSoket = klijentSoket;
        this.jCombo = jCombo;
        this.imena = imena;
        this.klijenti = klijenti;
    }
    
    
    
    @Override
    public void run() {
        System.out.println("KlijentNit");
        
        try {
            in = new BufferedReader(new InputStreamReader(klijentSoket.getInputStream()));
            out = new PrintStream(klijentSoket.getOutputStream());
            
            String ime = in.readLine();
            while(true){
               if(ime.equals("nina") || ime.equals("pera") || ime.equals("laza")){
                   if(!imena.contains(ime)){
                       imena.add(ime);
                       jCombo.removeAllItems();
                       for (int i = 0; i < imena.size(); i++) {
                           jCombo.addItem(imena.get(i));
                       }
                       out.println("da");
                       System.out.println("Vracam DA i BREAK");
                       break;
                   } else{
                       out.println("vec");
                       ime = in.readLine();
                   }
                  
               } else {
                       System.out.println("ne");
                       out.println("ne");
                       
                       ime = in.readLine();
                   }
            }
            System.out.println("ispred drugog vajla");
            while (true) {                
                String broj = in.readLine(); // glup naziv varijable
                if(broj.startsWith("@")){
                    System.out.println("PRVI IF");
                    listaString = "";
                    for (Integer str : brojevi) {
                        listaString = listaString+"@"+str;
                    }
                    out.println(listaString);
                }else{
                     System.out.println("ELSE");
                    System.out.println(broj);
                int br = Integer.parseInt(broj);
                if(brojevi.size() == 0){
                       System.out.println("DRUGI IF");
                    System.out.println("dodajem prvi "+br);
                    brojevi.add(br);
                    System.out.println("dodat prvi "+br);
                }else{
                    if(daLiJeManjiOdProsekaParnih(br)){
                        brojevi.add(br);
                        //listaString = "@"+br;
                        //System.out.println(listaString);
                        //out.println(listaString);
                    }else{
                        out.println("veci");
                    }
                }
                }
                
                
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return ime;//return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean daLiJeManjiOdProsekaParnih(int mojBr) {
        int counter = 0;
        int sum = 0;
        double avg = 0;
        for (Integer b : brojevi) {
            if(b%2 == 0){
                counter++;
                sum = sum+b;
            }
        }
        
        if(counter != 0){
          avg = ((double) sum)/counter;
        }else{
            return true;
        }
        
                
        if((double) mojBr > avg){
          
            return false;
        }
        
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String listToString(List<Integer> lista){
        for (Integer i : lista) {
            listaString += "@"+i;
        }
        
        return listaString;
    }
    
}
