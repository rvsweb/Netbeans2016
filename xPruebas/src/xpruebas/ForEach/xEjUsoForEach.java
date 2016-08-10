/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.ForEach;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjUsoForEach {

 public static void main(String[] args) {

  String[] uno = {"1º", "2º", "3º", "4º", "5º", "6º", "7º", "8º", "9º"};

  for (String indice : uno) {
   System.out.print(indice + " - ");
  }

  System.out.println("\n-----------------------");

  String[] dos = {"11", "22", "33", "44", "55", "66", "77", "88", "99"};

  for (String indice : dos) {
   System.out.print(indice + " - ");
  }

  System.out.println("\n-----------------------");

  for (String u : uno) {
   System.out.print("" + u + "\n");
   for (String d : dos) {
    System.out.println(" - " + d);
   }
  }

  System.out.println("");
  System.out.println(" For each en matrices ");
  int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

  for (int[] fila : matriz) { // Recorre la 1º fila
   for (int dato : fila) { // Recorre la 2º fila
    System.out.print(dato + " "); // Muestra los valores 
   }
   System.out.println();
  }
 }
}
