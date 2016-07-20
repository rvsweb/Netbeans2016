/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Parametros;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEjParametros {
 
 public String resultado(String dimeUnString) {
  System.out.println("dimeUnString inicialmente vale : " + dimeUnString);
  dimeUnString = dimeUnString + " recibido ";
  System.out.println("dimeUnString ahora vale : " + dimeUnString);
  return "el metodo devuelve " + dimeUnString;
 }
 
 public static void main(String[] args) {
  
  xEjParametros xej1 = new xEjParametros();
  xej1.resultado("esperanza");
 }
}
