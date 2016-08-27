/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.StringBuffer;

import java.util.Scanner;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeStringBufferPag199 {

}

class UsandoStringBuffer {

 private static String metodo1(int n) {
  String resultado = "";
  for (int i = 0; i < n; i++) {
   resultado += i + ", ";
  }
  return resultado;
 }

 private static String metodo2(int n) {
  StringBuffer buffer = new StringBuffer();
  for (int i = 0; i < n; i++) {
   buffer.append(i).append(", ");
  }
  return buffer.toString();
 }

 private static String metodo3(int n) {
  StringBuilder buffer = new StringBuilder();
  for (int i = 0; i < n; i++) {
   buffer.append(i).append(", ");
  }
  return buffer.toString();
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String letra = sc.nextLine();
  int n = Integer.parseInt(letra);

  long t1, t2, t3;

  System.out.println("------ Comprobar la velocidad de procesamiento ------ ");

  t1 = System.currentTimeMillis();
  metodo1(n);
  t2 = System.currentTimeMillis();
  System.out.println("Metodo 1 : " + (t2 - t1) + " ms ");

  System.out.println("---------------------------------");

  t1 = System.currentTimeMillis();
  metodo2(n);
  t2 = System.currentTimeMillis();
  System.out.println("Metodo 2 : " + (t2 - t1) + " ms ");

  System.out.println("---------------------------------");

  t2 = System.currentTimeMillis();
  metodo3(n);
  t3 = System.currentTimeMillis();
  System.out.println("Metodo 3 : " + (t3 - t1) + " ms ");

  System.out.println("---------------------------------");

 }

}
