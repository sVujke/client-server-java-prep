/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sun.security.util.Length;
    
//int niz[] = new niz[10];
/**
 *
 * @author vujke
 */
public class TblModel extends AbstractTableModel{
    long[] niz = new long[10];
    
   
    
    String[] kolone = new String[]{"1","2","3","4","5","6","7","8","9","10"};
    @Override
    public int getRowCount() {
        return 1;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
       return niz.length;// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
            switch(columnIndex) {
            case 0: return niz[0];
            case 1: return niz[1];
                case 2: return niz[2];
            case 3: return niz[3];
                case 4: return niz[4];
            case 5: return niz[5];
                case 6: return niz[6];
            case 7: return niz[7];
                case 8: return niz[8];
            case 9: return niz[9];
                default: return "m/a";
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];//return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void napuniNiz(){
        for (int i = 0; i < niz.length; i++) {
            niz[i] = Math.round(Math.random()*10);
        }
    }
    
    public long[] vratiNiz(){
        return niz;
    }
    
    public long vratiElement(int index){
        return niz[index];
    }
    
    public void izbaciIzNiza(int index){
        niz[index] = ubaciBrojUmesto();
        fireTableDataChanged();
    }

    private long ubaciBrojUmesto() {
        if(!nemaParnih()){
            return Math.round(Math.random()*10);
        }else {
            return najmanjiParni();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean nemaParnih() {
        for (int i = 0; i < 10; i++) {
            if(niz[i] % 2 == 0){
                return true;
            }
        }
        
        return false;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private long najmanjiParni() {
        long min = 0; 
        for (int i = 0; i < niz.length; i++) {
            
            if(niz[i] % 2 == 0){
                min = niz[i];
                break;
            }
        }
        
        for (int i = 0; i < niz.length; i++) {
            if(niz[i] % 2 == 0 && min>niz[i]){
                min = niz[i];
            }
        }
        
        return min;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
