/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Ocultacion;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeOcultacionPag116 {

}

/**
 * Ambito de la clase 23 - 31
 *
 * @author remoto
 */
class C {

// la 'x' del ambito clase (declarada en la linea queda oculta por la 'x' del ambito del metodo 'declarada en la lina 29' 
 private int x;

// ambito metodo : lineas 28-31
 public void metodo(int x) {
  this.x = x;//el uso 'this' permite que la linea 30 el valor de la 'x' del metodo pase a la 'x' de la clase
 }

}

class C1 {

 private int x1;

 /**
  * Este bloque de codigo (11-17) hace exactamente lo mismo que el bloque
  * anterior pero sin problema de visibilidad
  *
  * @param x2
  */
 public void metodo(int x2) {
  this.x1 = x2;
 }

 public static void main(String[] args) {
  /**
   * La 'm' declarada en la linea 54 queda oculta por la 'm' declarada en la
   * linea 56 en el ambito del for
   */
  int m;

  for (m = 0; m < 10; m++) {
   C1 c1 = new C1();
   c1.metodo(m);
  }
  /**
   * La 'm' de las lineas 21 y 23 se refiere a la declaracion en el ambito mas
   * estrecho : la de la linea 21
   */

 }
}
