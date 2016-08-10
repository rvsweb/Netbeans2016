/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

import java.util.Arrays;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayCopia2 {

 public void copia1() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = a;
  System.out.println("• Copia de la variable de la Referencia - ");
  System.out.println("• int[] b = a; ");
  System.out.println(Arrays.toString(b));
  System.out.println("• a[0] *= 10; ");
  a[0] *= 10;
  System.out.println(Arrays.toString(b));
 }

 public void copia2() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = a.clone();
  System.out.println(Arrays.toString(b));
  a[0] *= 10;
  System.out.println(Arrays.toString(b));
 }

 public void copia2Objetos() {
  Punto[] a = new Punto[]{new Punto(1, 2), new Punto(3, 4)};
  System.out.println(Arrays.toString(a));
  Punto[] b = a.clone();
  System.out.println(Arrays.toString(b));
  a[0].multiplica(-1);
  System.out.println(Arrays.toString(b));
 }

 public static void main(String[] args) {

  VademecumArrayCopia2 v2 = new VademecumArrayCopia2();
  v2.copia1();
  System.out.println("-------------------------------");
  v2.copia2();
  System.out.println("-------------------------------");
  v2.copia2Objetos();

 }
}

class Punto {

 private int x, y;

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public void multiplica(int factor) {
  x *= factor;
  y *= factor;
 }

 @Override
 public String toString() {
  return String.format("(%d,%d)", x, y);
 }

}
