/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_basico.bucles;

import java.util.Scanner;

/**
 *
 * @author TED
 */
public class BasicBuclesDistintosParametrosDentrodeFor {

 static int c = 0;

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  boolean parar = false;
  int v[] = new int[10];

  for (int i = 0; i < v.length; i++) {
   v[i] = (int) (Math.random() * (1 + 100));
  }

  System.out.println("");
  System.out.println("Intro valor ");

  for (int i = 0; i < v.length - 3 && !parar; i = sc.nextInt()) {
   System.out.println(v[i]);
   if (v[i] <= 10) {
    System.out.println("\n Numero menores de 10 : " + v[i]);
    parar = true;
   } else {
    System.out.println("\n Numero mayores de 10  : " + v[i]);
   }
   c++;
  }

  System.out.println("\n long vector " + v.length + " - vueltas dadas " + c);

 }

}
