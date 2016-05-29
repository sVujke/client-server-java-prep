/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbl;

import javax.swing.table.AbstractTableModel;


/**
 *
 * @author vujke
 */
public class TblModel extends AbstractTableModel{

   long niz[] = new long[10];
   String kolone[] = {"1","2","3","4","5","6","7","8","9","10"};
    public void tblModelBrojevi(){
        for (int i = 0; i < 10; i++) {
            niz[i] = (Math.round(Math.random() * 30));
        }
    }
        
    @Override
    public int getRowCount() {
        return 1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 10; //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
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
        return kolone[column];//super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

    public long[] promeniElement(int pozicija) {
        int counter = 0;
        long min = -1;
        
        for (int i = 0; i < 10; i++) {
            if(niz[i] % 3 == 0){
                counter++;
                System.out.println(counter);
                if(counter == 1){
                    min = niz[i];
                }
                
                if(niz[i] < min){
                    min = niz[i];
                    System.out.println(min);
                }
            }
            
            
        }
        
        if(min != -1){
            niz[pozicija] = min;
        } else {
            niz[pozicija] = Math.round(Math.random());
        }
        
        return niz;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
