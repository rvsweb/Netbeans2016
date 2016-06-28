/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Portatil
 */
public class T2Pag44LeerTeclado {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader buff = new BufferedReader(isr);
            String ln = buff.readLine();
            System.out.println("cadena : " + ln);
        } catch (IOException ex) {
            Logger.getLogger(T2Pag44LeerTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            String temp = dataIn.readLine();
            System.out.println(temp);
        } catch (IOException ex) {
            Logger.getLogger(T2Pag44LeerTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }

        char c;
        try {
            c = (char) System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
