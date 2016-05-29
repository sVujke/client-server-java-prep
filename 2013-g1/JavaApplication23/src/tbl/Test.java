/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbl;

/**
 *
 * @author vujke
 */
public class Test {
    public static void main(String[] args) {
        long niz[] = new long[10];
        for (int i = 0; i < 10; i++) {
            niz[i] = (Math.round(Math.random() * 30));
            System.out.println(niz[i]);
        }
        
       
    }
}
