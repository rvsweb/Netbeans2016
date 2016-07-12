/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forosdelweb.banderasFlag;

import com.sun.glass.events.KeyEvent;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * @see http://www.forosdelweb.com/f45/que-son-las-banderas-flags-java-956993/
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjUsoBanderasFlag {

// Declaracion de variable para UTILIZARLA de flag ( o "indicador de algo");
 private boolean presionoTeclaEnter = false;

// Evento que se dispara cada vez que se presiona una tecla en el JTextField
 public void unJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//   Hacer algo y ACTUALIZAR LA FLAG
   if (presionoTeclaEnter) {
    System.out.println("Hello Friend ");
   }

  }
 }

 public static void main(String[] args) {
  JFrame frame = new JFrame("Ventana");
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  JLabel label = new JLabel("Hello");
  JButton boton = new JButton();
  xEjUsoBanderasFlag xe = new xEjUsoBanderasFlag();
  java.awt.event.KeyEvent ke = new java.awt.event.KeyEvent(boton, 500, 500, 400, 400);
  xe.unJTextFieldKeyTyped(ke);

  frame.getContentPane().add(label);
  frame.pack();
  frame.setBounds(50, 50, 400, 100);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);

 }
}
