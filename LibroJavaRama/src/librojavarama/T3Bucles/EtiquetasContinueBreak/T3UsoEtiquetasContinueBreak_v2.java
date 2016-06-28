/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3Bucles.EtiquetasContinueBreak;

/**
 *
 * @author Portatil
 */
public class T3UsoEtiquetasContinueBreak_v2 {

 public static void main(String[] args) {
  EjemploDeBuclesConEtiquetas.piramide();
 }
}

class EjemploDeBuclesConEtiquetas {

 public static void piramide() {
  int i = 0;
  buclext:
  while (i < 20) {
   i++;
   for (int k = 1; k < (20 - i); k += 2) {
    if (k % 2 == 0) {
     continue buclext;
    }
    System.out.print("_");
   }
   for (int j = 0; j < i; j++) {
    System.out.print("•");
   }
   System.out.println("");
   if (i == 19) {
    break buclext;
   }
  }
 }
}
