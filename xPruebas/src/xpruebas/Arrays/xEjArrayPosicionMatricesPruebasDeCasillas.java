/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Arrays;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjArrayPosicionMatricesPruebasDeCasillas {

 public static void main(String[] args) {
//F0                 c0 c1 c2
  int[][] matriz = {{1, 2, 3,},
  //F1               c0 c1 c2
  {4, 5, 6}};

  for (int fila = 0; fila < matriz.length; fila++) {
   for (int columna = 0; columna < matriz[fila].length; columna++) {
    int v1 = matriz[fila][columna];
    int v2 = matriz[fila][columna];
    System.out.println(v1);
    System.out.println(v2);
//    System.out.print(matriz[fila][columna]);
   }
  }

  System.out.println("---------------------");

  for (int fila = 0; fila < 2; fila++) {
   for (int columna = 0; columna < matriz[0].length; columna++) {
    System.out.println("long columna : " + matriz[0].length);
    int v1 = matriz[fila][columna];
    int v2 = matriz[fila][columna];
    System.out.println(v1);
//    System.out.print(matriz[fila][columna]);
   }
  }
  System.out.println("-------------------------");

  int[][][] matriz2 = {{{1, 2, 3}, 
                        {4, 5, 6, 7}, 
                        {7, 8, 9, 0, 11}}};
  System.out.println("longitud fila : " + matriz2.length);
  System.out.println("longitud columna : " + matriz2[0].length);
  System.out.println("longitud columna : " + matriz2[0][1].length);
  System.out.println("longitud columna : " + matriz2[0][2].length);
  System.out.println("-------------------------");
  System.out.println("longitud fila : " + matriz2.length);
  System.out.println("longitud valor : " + matriz2[0][0][0]);
  System.out.println("longitud valor : " + matriz2[0][0][1]);
  System.out.println("longitud valor : " + matriz2[0][0][2]);
  System.out.println("-------------------------");
  System.out.println("longitud valor : " + matriz2[0][1][0]);
  System.out.println("longitud valor : " + matriz2[0][1][1]);
  System.out.println("longitud valor : " + matriz2[0][1][2]);
  System.out.println("longitud valor : " + matriz2[0][1][3]);
  System.out.println("-------------------------");
  System.out.println("longitud valor : " + matriz2[0][2][0]);
  System.out.println("longitud valor : " + matriz2[0][2][1]);
  System.out.println("longitud valor : " + matriz2[0][2][2]);
  System.out.println("longitud valor : " + matriz2[0][2][3]);
  System.out.println("longitud valor : " + matriz2[0][2][4]);

 }
}
