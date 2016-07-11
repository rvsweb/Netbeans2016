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
public class T7Pag202MatricesBasico {

}

class Matrices {

 public static void main(String[] args) {

  byte m[][] = new byte[4][7];

  for (int i = 0; i < 4; i++) {
   for (int j = 0; j < 7; j++) {
    m[i][j] = (byte) (i + j);
    System.out.print(m[i][j]);
    System.out.print("__");
   }
   System.out.println("");
  }
  System.out.println("");

  int[][] ab = new int[6][6];
  int[][] abc = {{1, 2, 3}, {4, 5, 6}};

  System.out.println("filas : " + ab.length);
  System.out.println("columnas : " + ab[0].length);

  System.out.println("---------------------------");

  for (int i = 0; i < abc.length; i++) {
   for (int j = 0; j < abc[i].length; j++) {
    System.out.print(abc[i][j] + " <-> ");
   }
   System.out.println("");
  }
 }
}
