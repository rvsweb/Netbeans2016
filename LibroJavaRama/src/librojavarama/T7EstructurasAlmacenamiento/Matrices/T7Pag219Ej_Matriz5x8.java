/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.Matrices;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag219Ej_Matriz5x8 {

 public static void main(String[] args) {
  System.out.println("-----------------------------");

  int[][] matriz = new int[5][8];
  for (int i = 0; i < 5; i++) {
   for (int j = 0; j < 8; j++) {
    matriz[i][j] = i * j;
    System.out.print("|" + matriz[i][j]);
   }
   System.out.println("");
  }

  System.out.println("-----------------------------");

  int[][] matriz2 = new int[5][8];
  for (int i1 = 0; i1 < 5; i1++) {
   for (int i2 = 0; i2 < 8; i2++) {
    matriz2[i1][i2] = i1 + i2;
    System.out.print("|" + matriz2[i1][i2]);
   }
   System.out.println("");
  }

  System.out.println("-----------------------------");
 }
}
