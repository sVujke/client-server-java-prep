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
import javax.swing.JTextField;

/**
 *
 * @author vujke
 */
public class PrijemNit extends Thread{
    BufferedReader in;
    PrintStream out;
    Socket soket;
    JTextField jtxtBrojevi;
    List<Integer> brojevi = new ArrayList<Integer>();
    String unetiBrojevi;

    public PrijemNit(BufferedReader in, PrintStream out, Socket soket, JTextField jtxtBrojevi) {
        this.in = in;
        this.out = out;
        this.soket = soket;
        this.jtxtBrojevi = jtxtBrojevi;
    }

    @Override
    public void run() {
        while(true){
            try {
                String poruka = in.readLine();
                if(poruka.startsWith("@")){
                    unetiBrojevi = poruka.replace("@", " ");
                    jtxtBrojevi.setText(unetiBrojevi);
                } else if (poruka == "veci"){
                    System.out.println("veci");
                } else if (poruka == "ok"){
                    System.out.println("ok");
                }   } catch (IOException ex) {
                Logger.getLogger(PrijemNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }  
       // super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
    
    
    
    
}
