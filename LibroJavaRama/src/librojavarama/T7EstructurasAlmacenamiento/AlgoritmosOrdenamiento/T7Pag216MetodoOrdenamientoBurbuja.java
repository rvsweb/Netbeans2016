/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.AlgoritmosOrdenamiento;

import java.util.Arrays;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag216MetodoOrdenamientoBurbuja {

 public static void burbuja(int array[]) {
  int aux;
  for (int i = array.length; i > 0; i--) {
   for (int j = 0; j < i - 1; j++) {
    if (array[j] > array[j + 1]) {
     aux = array[j + 1];
     array[j + 1] = array[j];
     array[j] = aux;
    }
   }
  }
 }

 public static void main(String[] args) {
  int[] array = {64, 34, 63, 93, 59, 42, 31, 12, 32, 45, 67, 89, 1, 98, 76, 54, 32, 10};
  System.out.println("Longitud total : " + array.length);

  burbuja(array);

  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i] + " ");
  }
  System.out.println("");

  int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  for (int i = 0; i < array2.length; i++) {
   System.out.print(array2[i] + " ");
  }
  System.out.println("");

 }
}
