/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Refactoring;

/**
 * @see - 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeRefactoringMetodos2Pag132 {

 /**
  * Extraccion de metodos para evitar "BREAK"
  *
  * @param s
  */
 public static void testSimetria(String s) {
  boolean esSimetrica = true;
  for (int i = 0; i < s.length(); i++) {
   int j = s.length() - 1 - i;
   System.out.println("soy j : " + j);
   if (j < i) {
    break;
   }
   char c1 = s.charAt(i);
   System.out.println("c1 : " + c1);
   char c2 = s.charAt(j);
   System.out.println("c2 : " + c2);
   if (c1 != c2) {
    esSimetrica = false;
    break;
   }
  }
  System.out.println(esSimetrica);
 }

// EXTRAEMOS EL BUCLE NUCLEAR EN UN METODO AUXILIAR
 public static void testSimetria2(String s) {
  System.out.println(isSimetrica(s));
 }

 /**
  *
  * @param s
  * @return
  */
 private static boolean isSimetrica(String s) {
  for (int i = 0; i < s.length(); i++) {
   int j = s.length() - 1 - i;
   if (j < i) {
    return true;
   }
   char c1 = s.charAt(i);
   char c2 = s.charAt(j);

   if (c1 != c2) {
    return false;
   }
  }
  return true; // en caso de que la cadena sea vacia ""
 }

 public static void testSimetriaVerRecorrido(String s) {
  boolean esSimetrica = true;
  for (int i = 0; i < s.length(); i++) {
   int j = s.length() - 1 - i;
   System.out.println("!!!! soy j : " + j + " !!!!!");
  }
 }

 public static void main(String[] args) {
  testSimetria("peep");
  testSimetriaVerRecorrido("peep");
  System.out.println("------------------");
  testSimetria2("peep");
  testSimetria2("peep1");
 }
}
