/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.For;

/**
 *
 * @author Portatil
 */
public class T3Pag74Piramide {

 public static void main(String[] args) {
  Piramide.piramide_basica();

 }
}

class Piramide {

 public static void piramide_basica() {
  int i, j, k;

  for (i = 1; i <= 3; i++) {
   for (k = 1; k <= 3 - i; k++) {
    System.out.print(" ");
   }
   for (j = 1; j <= 2 * (i - 1) + 1; j++) {
    System.out.print("*");
   }
   System.out.println("");
  }

 }

}
