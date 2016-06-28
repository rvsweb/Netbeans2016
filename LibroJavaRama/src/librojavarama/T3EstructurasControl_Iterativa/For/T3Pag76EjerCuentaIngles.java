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
public class T3Pag76EjerCuentaIngles {

 public static void main(String[] args) {
  CuentaIngles.cuenta_ingles();
 }
}

class CuentaIngles {

 public static void cuenta_ingles() {
  int num = 0;
  int i = 0;
  do {
   for (i = 0; i <= 1000000; i++) {
    switch (i) {
     case 1:
      System.out.println("One : " + i);
      break;
     case 100:
      System.out.println("hundred : " + i);
      break;
     case 1000:
      System.out.println("thousand : " + i);
      break;
     case 100000:
      System.out.println("one hundred thousand : " + i);
      break;
     case 1000000:
      System.out.println("one million : " + i);
      break;
    }
   }
  } while (num++ == i);
 }

}
