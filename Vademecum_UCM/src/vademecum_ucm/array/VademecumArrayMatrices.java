/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayMatrices {

 public static void main(String[] args) {
  System.out.println("\n -- For Each en matrices -- ");
  int[][] matriz3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

  for (int[] fila : matriz3) { // Recorre la 1º fila
   for (int dato : fila) { // Recorre la 2º fila
    System.out.print(dato + " "); // Muestra los valores 
   }
   System.out.println();
  }

 }
}
