/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array;

import java.util.Arrays;

/**
 * @see pag 15
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayBasico {

 public static void main(String[] args) {
//                           1  2  3  4  5  6  7  8  9  0  1       
  int[] longitud = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  System.out.println(longitud[0]);
  System.out.println(longitud[longitud.length - 1]);
//  System.out.println(longitud[0 - longitud.length - 1]);

  System.out.println(" Copia Arrays - ");

  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = a;
  System.out.println("Realiza una multiplicacion sobre el mismo valor : " + Arrays.toString(b));
  b[0] *= 10;
  System.out.println("Realiza una division sobre el mismo valor " + Arrays.toString(b));
  b[0] /= 10;
  System.out.println("Sobre el mismo valor realiza la operacion : " + Arrays.toString(b));

 }
}
