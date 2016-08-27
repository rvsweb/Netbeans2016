/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.StringBuffer;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeStringBufferLeerDesdeConsolaPag199 {

}

class Usar {

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

 public static void main(String[] args) {
  int n = Integer.parseInt(args[0]);
  long t1, t2;

  t1 = System.currentTimeMillis();
  metodo1(n);
  t2 = System.currentTimeMillis();
  System.out.println("Metodo 1: " + (t2 - t1) + "ms");

  t1 = System.currentTimeMillis();
  metodo2(n);
  t2 = System.currentTimeMillis();
  System.out.println("metodo 2: " + (t2 - t1) + "ms");
 }
}
