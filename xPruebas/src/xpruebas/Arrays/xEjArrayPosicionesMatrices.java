/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Arrays;

/**
 * @see Ejemplo Para Escribir desde Consola y Leer datos en la Consola Para que
 * Funcione se tiene que crear el archivo sin paquete y compilar desde la
 * consola con comando javac
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjArrayPosicionesMatrices {

 public static void main(String[] args) {

  System.out.println("------------------------------");

//               0  1  2  3    0  1  2  3 
  int[][] a1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
  for (int ii = 0; ii < a1.length; ii++) {
   for (int jj = 0; jj < a1[ii].length; jj++) {
    System.out.print(a1[ii][jj] + " ");
   }
   System.out.println("");
  }

  System.out.println("------------------------------");
//              0                 1
//              x                 x  
  int[][] a = {{1, 2, 3, 4,}, {5, 6, 7, 8}};
  for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[i].length; j++) {
    System.out.print(a[i][i] + " ");
   }
   System.out.println("");
  }
  System.out.println("------------------------------");

  System.out.println(" - " + a[0][0]);
  System.out.println(" - " + a[0][1]);
  System.out.println(" - " + a[0][2]);
  System.out.println(" - " + a[0][3]);
  System.out.println("------------------------------");
  System.out.println(" - " + a[1][0]);
  System.out.println(" - " + a[1][1]);
  System.out.println(" - " + a[1][2]);
  System.out.println(" - " + a[1][3]);
  System.out.println("------------------------------");

 }
}
