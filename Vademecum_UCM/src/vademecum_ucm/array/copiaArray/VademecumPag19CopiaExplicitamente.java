/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

/**
 * @see - pag 19
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumPag19CopiaExplicitamente {

 public static void main(String[] args) {

  T[] a = new T[]{new T(1, 2), new T(3, 4)};
  T[] b = new T[a.length];

  for (int i = 0; i < a.length; i++) {
   b[i] = a[i];
  }

  for (T ia : a) {
   System.out.println(ia);
  }

  System.out.println("----------------------");

  for (T ib : b) {
   System.out.println(ib);
  }

 }
}

class T {

 private int a;
 private int b;

 public T() {
  this.a = 0;
  this.b = 0;

 }

 public T(int a, int b) {
  this.a = a;
  this.b = b;
 }

 @Override
 public String toString() {
  return " - " + a + " - " + b;
 }

}
