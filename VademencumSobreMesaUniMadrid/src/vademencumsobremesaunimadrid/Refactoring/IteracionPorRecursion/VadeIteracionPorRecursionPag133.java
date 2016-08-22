/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Refactoring.IteracionPorRecursion;

/**
 * Sustituir Iteracion por Recursion
 *
 * Los programas iterativos suelen ser mas rapidos
 *
 * Los programas recursivos suelen ser mas faciles de entender
 *
 *
 * @see - 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIteracionPorRecursionPag133 {

 /**
  *
  * @param a
  * @param b
  * @return
  */
 public static int mcd_iterativo(int a, int b) {
  while (a != b) {
// Si 'a' es menor 'b'
   if (a > b) {
// Resta 'a' la cantidad de a = a - b;
    a -= b;
// Sino 'b' mayor que 'a'
   } else if (b > a) {
// Resta 'b' la cantidad de b = b - a;
    b -= a;
   }
  }
  return a;
 }

 /**
  *
  * @param a
  * @param b
  * @return
  */
 public static int mcd_recursivo(int a, int b) {
  if (a == b) {
   return a;
  }
  if (a > b) {
   return mcd_recursivo(a - b, b);
  } else {
   return mcd_recursivo(a, b - a);
  }
 }

 public static void main(String[] args) {
  int a = mcd_iterativo(10, 20);
  System.out.println("valor : " + a);
  int b = mcd_recursivo(10, 20);
  System.out.println("valor : " + b);
 }
}
