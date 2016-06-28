/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Portatil
 */
public class ClaseJOption {

    public static void main(String[] args) {

        String name = "";
        name = JOptionPane.showInputDialog("Escribe tu nombre");
        String msg = " Hola " + name + "!";
        JOptionPane.showMessageDialog(null, msg);

    }
}
