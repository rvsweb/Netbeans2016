/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Promocion;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadePromocionPag122 {

}

/**
 * UPCasting de tipos primitivos
 *
 * Conversion automatica de valores entre tipos primitivos
 *
 * Convierte de un formato 'más pobre' a un formato 'mas rico'
 *
 * @author remoto
 */
class Promocion {

 /**
  * Promocion se produce automaticamente ( el compilador la realiza sin quejarse
  * ni avisar al programador ) cuando:
  *
  * 1º En una expresion se combinan valores de diferente tipo
  *
  * 2º Se intenta asignar a una variable de un cierto tipo un valor de otro tipo
  *
  *
  * @param args
  */
 public static void main(String[] args) {

//  byte -> short -> int -> long -> float -> double
//           char -> int -> long -> float -> double
//  
  byte b = 1;
  short s = 2;
  int i = 3;
  long l = 4l;
  float f = 5.5F;
  double d = 6.6;

  System.out.println("• Se promociona el (int)3 a (double) 3.0 y la expresion vale (double) 1.666 : " + d / i);
  System.out.println("• Se promociona el (int)3 a (double) 3.0 y la variable recibe el valor(double) 3.0 : " + i / d);

 }
}
