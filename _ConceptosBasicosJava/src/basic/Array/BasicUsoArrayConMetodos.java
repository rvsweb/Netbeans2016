/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.Array;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoArrayConMetodos {

 public static void main(String[] args) {

  int i2 = 2;
  int i3 = 3;

  int valor = Double.compare(i2, i3);

  System.out.println("Valor es : " + valor);

  int i3a = 3;
  int i3b = 3;

  int valor1 = Double.compare(i3a, i3b);

  System.out.println("Valor es : " + valor1);

  System.out.println("-- SE PUEDE METER METODOS DENTRO DE LA CONDICION DE LOS FOR -- ");

  for (int i = 0; i < /* 0 */ Double.compare(i2, i3); i++) {
   System.out.println(i);
  }

  System.out.println("Integer.BYTES -> 4 ");
  for (int i = 0; i < Integer.BYTES; i++) {
   System.out.println(i);
  }

 }
}
