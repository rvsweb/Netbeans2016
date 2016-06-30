/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.Wrapper;

import java.math.BigInteger;

/**
 *
 * @author Portatil
 */
public class T5Pag120BasicMetodosInteger {

}

class Test {

 public static String toHex(String arg) {
  return String.format("%040x", new BigInteger(1, arg.getBytes()));
 }

 public static void main(String[] args) {

  Integer i1 = new Integer(5);
  Integer i2 = new Integer("7");

  String s1 = i1.toString();
  System.out.println(s1);

  int i3 = Integer.parseInt("10", 10);
  int i4 = Integer.parseInt("10", 8);
  int i5 = Integer.parseInt("BABA", 16);

  System.out.println(i3); // muestra 10 por pantalla
  System.out.println(i4); // muestra 8 por pantalla
  System.out.println(i5); // muestra 47.802 por pantalla

  System.out.println(Integer.toOctalString(i4));
  System.out.println("BABA - " + Integer.toHexString(i5));
  int i6 = Integer.valueOf("22");
  System.out.println(i6);

  String i7 = Integer.toHexString(47802);
  System.out.println(i7);

  int i8 = Integer.valueOf("22").intValue();

  if (i8 == 22 && Integer.valueOf("22").intValue() == 22) {
   System.out.println("Soy igual : " + i8);
  }

  int i9 = Integer.parseInt("22");

  if (i9 == 22 && Integer.parseInt("22") == 22) {
   System.out.println("Soy igual : " + i8);
  }

 }
}
