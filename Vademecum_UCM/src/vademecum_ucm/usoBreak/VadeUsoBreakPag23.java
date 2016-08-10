/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.usoBreak;

import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * @see pag23
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoBreakPag23 {

 public static String procesa(String pro) {
  if (pro.equals("s")) {
   System.out.println("Escribio si ");
  } else {
   System.out.println("Escribio otra cosa : " + pro);
  }
  return pro;
 }

 public static void main(String[] args) {

  System.out.printf("\u001B[33m !!! NO USAR SENTENCIAS 'BREAK' SALVO EVIDENTE NECESIDAD !!! \n");
  System.out.println("Se emplean para forzar la terminacion de un bucle");
  System.out.println("Util en bucles cuya condicion de terminacion no se puede");
  System.out.println("chequear comodamente ni al principio (while) ni al final ( do-while) ");

  for (;;) {
   String linea = "4";
   if (linea == "4") {
    System.out.println("- Ha entrado - ");
    System.out.println("- break - Rompe el flujo de ejecucion - ");
    break;
    // Debajo del break - no se ejecuta ningun codigo 
   }
  }

  System.out.println("----- Sin break ------");
  Scanner sc = new Scanner(System.in);
  String linea = sc.next();
  while (linea != null) {
   if (linea.equals("s")) {
    break;
   }
   procesa(linea);
   linea = sc.next();
  }

  System.out.println("----- Con break ------");
  for (;;) {
   String linea1 = sc.next();
   if (linea1.equals("s")) {
    break;
   }
   procesa(linea);
  }

  System.out.println("En algunas ocasiones no es cómodo"
          + "\nescribir la condición de terminación "
          + "\nni al principio (“while”)"
          + "\nni al final (“do ... while”) "
          + "\nsino que aparece de forma natural por en medio:");

  for (;;) {
   String linea3 = sc.next();
   if (linea3.equals("s")) {
    System.out.println("• Se introdujo : " + linea3);
    break;
   }
   procesa(linea);
  }

  while (true) {
   String linea4 = sc.next();
   if (linea.equals("s")) {
    System.out.println("• Valor de la linea introducida es " + linea4);
    break;
   } else {
    procesa(linea);
   }
  }

  System.out.println(" --- while (linea5 != null) --- \n");
  String linea5 = sc.next();
  while (linea5 != null) {
   procesa(linea5);
   linea5 = sc.next();
   break;
  }


 }
}
