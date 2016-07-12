/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.VectoresString;

import java.util.Scanner;

/**
 * @see Ej
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag213EjemploVectoresString {

 private static String[] lista;
 final static int POS = 10;

 public static void muestra() {
  for (int i = 0; i < POS; i++) {
   System.out.println(lista[i] + " ");
  }

 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String leer = sc.nextLine();
  lista = new String[POS];
  for (int i = 0; i < POS; i++) {
   String ln = leer;
   lista[i] = ln;
  }
  System.out.println("");
  muestra();
  System.out.println("");
 }
}
