/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.UsoThis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoCorrectoThisDentroActionListener {

 public static void main(String[] args) {

  MyDialog md = new MyDialog();
  md.actionPerformed(new ActionEvent("Object", 1, "Cadena"));

 }
}

class MyDialog extends JDialog implements ActionListener {

 /**
  * Constructor : inicializa un objeto boton
  */
 public MyDialog() {
  JButton myButton = new JButton("Hello");
  myButton.addActionListener(this); // Referencia a la instancia actual 'Al objeto que se creara con el Constructor'
 }

 /**
  * action Performed = Accion a Realizar
  *
  * @param e
  */
 @Override
 public void actionPerformed(ActionEvent e) {
  System.out.println("Hurdy Gurdy!");
 }

}
