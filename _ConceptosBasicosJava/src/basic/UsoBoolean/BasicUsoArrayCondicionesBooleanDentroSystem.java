/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.UsoBoolean;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoArrayCondicionesBooleanDentroSystem {

 public static void main(String[] args) {

  int x1 = 1;
  int x2 = 2;

  System.out.println("Num basicos ");
  System.out.println(x1 < 10);
  System.out.println(x1 > 10);
  System.out.println(x1 == 10);

  System.out.println("Comparando Num ");
  System.out.println(x1 == x2);
  System.out.println(x1 < x2);
  System.out.println(x1 > x2);

  System.out.println("Con Array");

  int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  for (int i = 0; i < a.length; i++) {
   System.out.print("Es menor indice < 5  " + a[i] + " -> ");
   System.out.println(a[i] < 5);
  }

  System.out.println("1º Comprobacion");
  int[] a1 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
  for (int i = 0; i < a1.length; i++) {
   if ((a1[i] < 50) == true) {
    System.out.print(a1[i] < 50);
    System.out.println("- Soy menor de 50 : " + a1[i] + " ");
   } else {
    System.out.print(a1[i] > 50);
    System.out.println("- Soy MAYOR de 50 : " + a1[i] + " ");
   }
  }

  System.out.println("2º Comprobacion");
  int[] a2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
  for (int i = 0; i < a2.length; i++) {
   if ((a2[i] < 50)) {
    System.out.print(a2[i] < 50);
    System.out.println(" - Soy menor de 50 : " + a2[i] + " ");
   } else {
    System.out.print(a2[i] > 50);
    System.out.println(" - Soy MAYOR de 50 : " + a2[i] + " ");
   }
  }

 }
}
