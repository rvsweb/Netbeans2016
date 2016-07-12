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
public class T7Pag221EjerOrdenacionCocktailSort {

 private static int[] lista;
 final static int POS = 50;
 final static int LIMITE = 100;

 public static int getAleatorio2() {
  return (int) (Math.random() * LIMITE + 1);
 }

 public static int getAleatorio() {
  return (int) (Math.random() * (Math.max(1, 10000)));
 }

 /**
  * Hemos creado un metodo unico para toda la clase que ordena un array de
  * numeros.
  *
  * @param array
  */
 public static void ordenaCocktail(int array[]) {
  int i = 0, j = array.length - 1;
  while (i < j) {
   for (int k = i; k < j; k++) { // direccion -->
    if (array[k] > array[k + 1]) {
     int temp = array[k];
     array[k] = array[k + 1];
     array[k + 1] = temp;
    }
   }
   j--;
   for (int k = j; k > i; k--) { // direccion <--
    if (array[k] < array[k - 1]) {
     int temp = array[k];
     array[k] = array[k - 1];
     array[k - 1] = temp;
    }
   }
   i++;
  }
 }

 /**
  * Metodo muestra por pantalla un array
  */
 public static void muestra() {
  for (int i = 0; i < POS; i++) {
   System.out.print("|" + lista[i]);
  }
  System.out.println("");
 }

 public static void main(String[] args) {
  lista = new int[POS];
  System.out.println("---- Sin Ordenacion ----- ");
  for (int i = 0; i < POS; i++) {
   lista[i] = getAleatorio();
  }
  muestra();
  System.out.println("---- Ordenacion ------ ");
  ordenaCocktail(lista);
  muestra();
  System.out.println("---------------------------");
 }
}
