/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import niti.PrijemNit;

/**
 *
 * @author vujke
 */
public class Glavna {
    
     Socket soket;
    BufferedReader in;
    PrintStream out;
    
    public static void main(String[] args) {
         PrijemNit nit = new PrijemNit();
         nit.start();
         System.out.println("startovan klijent");
    }
}
