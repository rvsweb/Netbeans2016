/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayCopy {

 public static void main(String[] args) {
  int[] a = {1, 2, 3, 4, 5};
  int[] b = {6, 7, 8, 9, 10};

  System.arraycopy(a, 0, b, 0, 5);

  for (int i = 0; i < a.length; i++) {
   System.out.println("- " + a[i]);
  }
  System.out.println("------------------------");
  for (int i = 0; i < b.length; i++) {
   System.out.println("- " + b[i]);

  }
 }
}
