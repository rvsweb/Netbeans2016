/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ClaseScanner;

import java.util.Scanner;

/**
 *
 * @author Portatil
 */
public class ClaseScanner {

    public ClaseScanner() {
    }
    
    

    public static void main(String[] args) {

        ClaseScanner cls = new ClaseScanner();
        
        cls.toString();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Leer entero");
        int pieza = in.nextInt();
        System.out.println("Leer double");
        double volumne = in.nextDouble();
        System.out.println("Leer String");
        String mensaje = in.next();
        System.out.println("Leer String 2");
        String mensaje2 = in.next();

    }
}
