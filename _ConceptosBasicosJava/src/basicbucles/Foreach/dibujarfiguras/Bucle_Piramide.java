/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbucles.Foreach.dibujarfiguras;

/**
 * @title..:
 * @todo...:
 * @example:
 * @date...:
 * @author TED
 */
public class Bucle_Piramide {

 public static void main(String[] args) {

  int i, j, k;
  int c = 0;

  for (i = 1; i <= 3; i++) { // Posicion fila
   for (k = 1; k <= 3 - i; k++) { // Posicion columna
    System.out.print("-");
   }
   for (j = 1; j <= 2 * (i - 1) + 1; j++) { // Dibujo del Asterisco
    System.out.print("•");
   }
   System.out.print(--j);
   System.out.println("");
  }

  System.out.println("");

  int z, x;

  for (z = 1; z <= 4; z++) {
   for (x = 1; x <= 2 * (z - 1) + 1; x++) {
    System.out.print("*");
   }
   System.out.println("");
  }

  System.out.println("");

  int bb, cc;

  for (bb = 0; bb <= 3; bb++) {
   for (cc = bb * 3; cc >= bb; --cc) {
    System.out.print("$");
   }
   System.out.println("");

  }
  System.out.println("");

  for (int l = 0; l < 3; l++) {
   for (int m = l * 2; m < 3; m++) {
    System.out.print(" ");
   }
   System.out.println("*");
  }

 }
}
