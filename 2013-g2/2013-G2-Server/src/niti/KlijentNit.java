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
import model.TblModel;

/**
 *
 * @author vujke
 */
public class KlijentNit extends Thread{
    
    Socket soket;
    BufferedReader in;
    PrintStream out;
    List<String> imena = new ArrayList<String>();
    TblModel tbl;
    //adminX, adminY, userAи userB

    public KlijentNit(Socket soket, TblModel tbl) {
        this.soket = soket;
        this.tbl = tbl;
        //this.in = in;
        //this.out = out;
    }
    
    
    
    @Override
    public void run() {
        try {
            System.out.println("Usli u klijent nit");
            
            in = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            out = new PrintStream(soket.getOutputStream());
            
            String ime = in.readLine();
            System.out.println("STIGLO "+ime);
            int counter = 0;
            while(true){
                if(ime.equals("adminX") || ime.equals("adminY") || ime.equals("userA") || ime.equals("userB")){
                    for (String i : imena) {
                        if(ime.equals(i)){
                            counter++;
                            System.out.println("COUNTER: "+counter);
                        }
                    }
                    
                    if(counter == 2){
                        System.out.println("COUNTER je 2: "+counter);
                        out.println("dokle");
                        ime = in.readLine();
                    }
                    
                    imena.add(ime);
                    System.out.println("Dodajem u imena");
                    out.println("da");
                    System.out.println("Poslato DA");
                    break;
                } else{
                    out.println("ne");
                    System.out.println("Poslato NE");
                    ime = in.readLine();
                }
            }
            System.out.println("van WHILE");
            
            while (true) {                
                
                String  poruka = in.readLine();
                System.out.println("PORUKA: "+poruka);
                //String  poruka = in.readLine();
                int pozicija = 0;
                try {
                    pozicija = Integer.parseInt(poruka);
                } catch (Exception e) {
                    out.println("nije broj");
                    poruka = in.readLine();
                }
                
                System.out.println("POZICIJA: "+pozicija);
                long element = tbl.vratiElement(pozicija);
                System.out.println("ELEMENT: "+element);
                tbl.izbaciIzNiza(pozicija);
                long novi = tbl.vratiElement(pozicija);
                System.out.println("NOVI: "+element);
                
                String porZaKlijenta = "@"+ime+" je izbacio el. sa pozicije "+pozicija+"("+element+")"+" sada je tu br "+novi+"";
                System.out.println("PORUKA: "+porZaKlijenta);
                
                out.println(porZaKlijenta);
                
                //int pozicija = Integer.parseInt(poruka);
            }
            //super.run(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(KlijentNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
