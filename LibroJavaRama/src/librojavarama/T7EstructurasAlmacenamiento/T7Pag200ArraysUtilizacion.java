/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag200ArraysUtilizacion {
}

class Temperatura {

 private static int[] temperatura1;
 private final static int POS = 12;

 public static void main(String[] args) {
  int dato = 0;
  int media = 0;
  temperatura1 = new int[POS];
  for (int i = 0; i < POS; i++) {
   try {
    System.out.println("Introduzca Temperatura :");
//    String sdato = System.console().readLine(); ESTO SOLO FUNCIONA FUERA DEL IDE "LINEA COMANDOS"
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    dato = Integer.parseInt(br.readLine());
   } catch (IOException | NumberFormatException e) {
    System.out.println("Error en la introduccion de datos " + e.getMessage());
   }
   temperatura1[i] = dato;
  }
  for (int i = 0; i < POS; i++) {
   media = media + temperatura1[i];
  }
  media = media / POS;
  System.out.println("La media de temperaturas del anio es : " + media);

 }
}
