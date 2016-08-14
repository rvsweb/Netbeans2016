/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeForPag73 {

 public static void main(String[] args) {

  for (int i = 0; i < 10; i++) {
   System.out.println(i);
  }

  String[] array = new String[11];

  for (int i = 1; i < array.length; i++) {
   String s = array[i] = i >= 5 ? "Si mayor de 5 : " + i : "No mayor de 5 : " + i;
   procesa(s);
  }

  System.out.println("-----------------_");
  factorial(5);
 }

 private static void procesa(String s) {
  System.out.println(s);
 }

 static void factorial(int m) {
  int fact = 1;
  int n = 0;
  for (n = m; n > 0; n--) {
   System.out.println(fact);
   fact *= n;
  }
 }

}
