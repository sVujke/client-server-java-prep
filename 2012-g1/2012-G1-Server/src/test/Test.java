/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author vujke
 */
public class Test {
    public static void main(String[] args) {
        String s = "@a@a";
        String niz[] = s.split("@");
        for (int i = 1; i < niz.length; i++) {
            System.out.println(niz[i]+" "+i);
        }
        
    }
}
