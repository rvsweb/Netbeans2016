/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Portatil
 */
public class T2Pag43EntradaSalidaConsola {

    public static void main(String[] args) {

        char c = '0';
        try {
            c = (char) System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(c);

    }

}
