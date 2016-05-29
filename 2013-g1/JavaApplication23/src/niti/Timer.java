/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author vujke
 */
public class Timer extends Thread {
    
    JLabel sada;

    public Timer(JLabel sada) {
        this.sada = sada;
    }

    @Override
    public void run() {
        while(true){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String s = sdf.format(new Date());
        sada.setText(s);
        }
        
        //super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
