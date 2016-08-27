/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.StringBuilder;

import java.util.Scanner;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeStringBuilderPag200 {

}

/**
 * A diferencia de la clase estandar String , StringBuilder , permite trabajar
 * con cadenas de caracteres modificables
 *
 *
 * @author remoto
 */
/**
 * Construir un objeto que un listado de N numeros separados por comas
 *
 * @author remoto
 */
class Uso_StringBuilder {

 private static String metodo1(int n) {
  String resultado = "";
  for (int i = 0; i < n; i++) {
   resultado += i + ", ";
  }
  return resultado;
 }

 private static String metodo2(int n) {
  StringBuilder buffer = new StringBuilder();
  for (int i = 0; i < n; i++) {
   buffer.append(i).append(", ");
  }
  return buffer.toString();
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String num = sc.nextLine();

  int n = Integer.parseInt(num);
  long t1, t2;

  t1 = System.currentTimeMillis();
  metodo1(n);
  t2 = System.currentTimeMillis();
  System.out.println("metodo 1 : " + (t2 - t1) + " ms");

  t1 = System.currentTimeMillis();
  metodo2(n);
  t2 = System.currentTimeMillis();
  System.out.println("metodo 2 : " + (t2 - t1) + " ms");

 }
}
