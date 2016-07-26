/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.JavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicJavaSwingHelloWorld {

}

class HelloWorld {

 public static void main(String[] args) {
  JFrame frame = new JFrame(); // Creating Frame / Crea el marco
  frame.setTitle("Hi"); // Setting title frame / Fija o Ajusta el titulo del marco
  frame.add(new JLabel("Hello World")); // Adding text to frame / Añade texto al marco
  frame.pack(); // Setting size to smallest / Ajusta tamaño a pequeño
  frame.setLocationRelativeTo(null); // Centering frame / Centra el marco
  frame.setVisible(true); // Showing frame / Muestra el marco
 }
}
