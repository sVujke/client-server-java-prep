/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author vujke
 */
public class Timer extends Thread{
    
    JLabel sada;

    public Timer(JLabel sada) {
        this.sada = sada;
    }
    
    
    @Override
    public void run() {
        while (true) {            
            sada.setText(vreme());
        }
        //super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
     private String vreme() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String vreme = sdf.format(new Date());
        return vreme;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
