/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Return;

/**
 * @see 149
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeReturnPag149 {

 /**
  * Sirve para terminar un metodo , devolviendo el resultado , si el metodo lo
  * requiere
  *
  * Las sentencias 'return' provocan la terminacion del metodo en el que
  * aparecen incluso si estamos dentro de algun bucle
  *
  * @param s
  * @return
  */
 public static int buscaPunto(String s) {
  for (int p = 0; p < s.length(); p++) {
   char c = s.charAt(p);
   if (c == '.') {
    return p;
   }
  }
  return -1;
 }

 public static void main(String[] args) {

  int v = buscaPunto("Valores.");
  System.out.println(v);
  int v1 = buscaPunto("Valores");
  System.out.println(v1);
  int v2 = buscaPunto(".........");
  System.out.println(v2);

 }
}
