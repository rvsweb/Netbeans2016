/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Finally;

import java.util.Scanner;

/**
 * @see - 78
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFinallyPag70 {

}

class Inversos {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int pruebas = 0;

  while (true) {
   double inverso = 0;
   try {
    String x = scanner.next();
    if (x.equals("fin")) {
     break;
    }

    int valor = Integer.parseInt(x);
    inverso = 100 / valor;

   } catch (Exception e) {
    System.out.println(" -> " + e);
    inverso = 0;
   } finally {
    pruebas++;
    System.out.println(" -> " + pruebas + ": " + inverso);
   }
  }
 }
}
