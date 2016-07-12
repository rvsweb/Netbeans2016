/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.IncrementoDecremento;

/**
 * @see pruebas
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjIncrementoDecremento {

 public static void main(String[] args) {

  int n = 10;
  n++;
  System.out.println("Incremento : n++ " + n);

  int n2 = 10;
  ++n2;
  System.out.println("Incremento ++n2 : " + n);

  int n3 = 10;
  n3--;
  System.out.println("Decremento n3-- : " + n3);

  int n4 = 10;
  --n4;
  System.out.println("Decremento --n4 : " + n4);

  int a[] = new int[30];
  int b = a.length - 1;
  System.out.println("cadena : " + b);
  b--;
  System.out.println("cadena : " + b);

 }
}
