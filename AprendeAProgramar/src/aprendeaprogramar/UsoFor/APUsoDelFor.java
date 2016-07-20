/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoFor;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APUsoDelFor {

 public static void main(String[] args) {
//                      0123456
  for (int i = 0; i < ("Gracias").length(); i++) { //Va devolviendo en cada iteración una letra más de la cadena
   System.out.println("Gracias".substring(0, i + 1));
  }
  System.out.println("Gracias".length());
 } //Cierre del main
} //Cierre de la clase
