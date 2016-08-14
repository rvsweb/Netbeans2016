/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.If;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEj_If {

 private int x;

 public static boolean isMayorX(int x) {
  if (x > 5) {
   return true;
  } else {
   return false;
  }
 }

 public static boolean isMenorX(int x) {
  if (x < 5) {
   return true;
  } else {
   return false;
  }
 }

 public static void main(String[] args) {

  boolean menorX = isMayorX(10);
  System.out.println(menorX);

  boolean menorX1 = isMenorX(10);
  System.out.println(menorX1);
 }
}
