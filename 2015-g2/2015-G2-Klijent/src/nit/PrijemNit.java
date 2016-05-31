/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author vujke
 */
public class PrijemNit extends Thread{
    
    Socket soket;
    int zvezda;
    BufferedReader in;
    PrintStream out;
    String kat;
    List<JButton> dugmici;
    String poruka;
    int brojac;

    public PrijemNit(Socket soket, BufferedReader in, PrintStream out, String kat, List<JButton> dugmici) {
        this.soket = soket;
        this.in = in;
        this.out = out;
        this.kat = kat;
        this.dugmici = dugmici;
    }
    
    
    @Override
    public void run() {
        
        while (true) {            
            try {
                if((kat.equals("3") && brojac == 5) || 
                         (kat.equals("5") && brojac == 13) ||
                        (kat.equals("4") && brojac == 9 || zvezda==3)){
                    for (JButton jButton : dugmici) {
                        jButton.setEnabled(false);
                        //System.out.println("Usao si u IF!");
                    }
       
                }
                poruka = in.readLine(); //"index:value"
                String[] iValue = poruka.split(":");
                int index = Integer.parseInt(iValue[0]);
                if(iValue[1].equals("*")){
                    zvezda++;
                }
                dugmici.get(index).setText(iValue[1]);
                brojac++;
                System.out.println("brojac: "+brojac);
            } catch (IOException ex) {
                Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        //   super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
