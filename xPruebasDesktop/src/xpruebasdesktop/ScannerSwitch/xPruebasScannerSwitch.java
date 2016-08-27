/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebasdesktop.ScannerSwitch;

import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xPruebasScannerSwitch {

 private static String intro;
 private static String intro2;
 public static int contador = 3;
 public static int contador2 = 3;

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Nº de oportunidades : " + contador);

  System.out.printf("\u001B[36m Escribe tu nombre : ");
  intro = sc.nextLine();
  while (!intro.equals("sa") && contador > 0) {
   switch (intro) {
    case "a":
     System.out.println("Bienvenido : Alejandro ");
     intro = "sa";
     break;
    default:
     System.out.println("• Nombre introducido : " + intro);
     System.out.println("• Escribe 'sa' para terminar ");
     System.out.println("• Te quedan : " + contador);
     intro = sc.nextLine();
     break;
   }
   --contador;
  }

  System.out.println("------------------------------------------");
  System.out.println("------------- 2º opcion ----------------");
  System.out.println("------------------------------------------");

  Scanner sc1 = new Scanner(System.in);

  System.out.println("Nº de oportunidades : " + contador2);

  System.out.printf("\u001B[36m Escribe tu nombre : ");
  intro2 = sc1.nextLine();
  while (!intro2.equals("sa") || contador2 > 0) {
   if (contador2 > 0) {
    switch (intro2) {
     case "a":
      System.out.println("Bienvenido : Alejandro ");
      intro2 = "sa";
      break;
     default:
      System.out.println("• Nombre introducido : " + intro2);
      System.out.println("• Escribe 'sa' para terminar ");
      System.out.println("• Te quedan : " + contador2);
      intro = sc1.nextLine();
      break;
    }
    --contador2;
   } else if (contador2 == 0) {
    System.out.println("♦ No tienes mas oportunidades : " + contador2);
    System.out.println("♦ Fin del programa");
    break;
   }
  }

 }
}
