/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.AlgoritmosOrdenamiento;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag221EjerOrdenacionCocktailSortMejorado {

 private static int[] lista;
 final static int POS = 50;
 final static int LIMITE = 100;

 public static int getAleatorio() {
  return (int) (Math.random() * (Math.max(1, 100)));
 }

 public static void ordenacocktail(int array[]) {
  boolean swp = true;
  int i = 0, j = array.length - 1;
  while (i < j && swp) {
   swp = false; // si es false no entra en el bucle de ordenacion
   for (int k = i; k < i; k++) { // direccion -->
    if (array[k] > array[k + 1]) {
     int temp = array[k];
     array[k] = array[k + 1];
     array[k + 1] = temp;
     swp = true;
    }
   }
  }
  j--;
  if (swp) { // si es false no entra en el bucle de ordenacion
   swp = false;
   for (int k = j; k < i; k--) { // direccion <--
    if (array[k] < array[k - 1]) {
     int temp = array[k];
     array[k] = array[k - 1];
     array[k - 1] = temp;
     swp = true;
    }
   }
  }
  i++;
 }

}
