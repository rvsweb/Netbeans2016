/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

import java.util.Arrays;

/**
 * @see - pag 17
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumPag17ArrayMetodoClone {

 /**
  *
  */
 void copia2() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = a;
  System.out.println(Arrays.toString(b));
  a[0] *= 10;
  System.out.println(Arrays.toString(b));
 }

 /**
  * 1 Dimension
  */
 void copia2objetos() {
//Array obj tipo Punto    instancia obj1    instancia obj2 
  Punto[] a = new Punto[]{new Punto(1, 2), new Punto(3, 4)};
  System.out.println(Arrays.toString(a));
  Punto[] b = a.clone();
  System.out.println(Arrays.toString(b));
  a[0].multiplica(-1);
 }

 /**
  * 2 Dimensiones
  */
 void copia2ArraysBiDi() {
  int[][] a = new int[][]{{1, 2}, {3, 4}};
  System.out.println(Arrays.deepToString(a));
  int[][] b = a.clone();
  System.out.println(Arrays.deepToString(b));
  a[0][0] *= -1;
  System.out.println(Arrays.deepToString(b));
 }

 /**
  *
  */
 void copia20() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = new int[a.length];
  System.arraycopy(a, 0, b, 0, a.length);
  System.out.println(Arrays.toString(b));
  a[0] *= 10;
  System.out.println(Arrays.toString(b));
 }

 /**
  *
  */
 void copia21Objetos() {
  Punto[] a = new Punto[]{new Punto(1, 2), new Punto(3, 4)};
  System.out.println(Arrays.toString(a));
  Punto[] b = new Punto[a.length];
  System.arraycopy(a, 0, b, 0, a.length);
  System.out.println(Arrays.toString(b));
  a[0].multiplica(-1);
  System.out.println(Arrays.toString(b));
 }

 /**
  *
  */
 void copia30() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  int[] b = Arrays.copyOf(a, a.length);
  System.out.println(Arrays.toString(b));
  a[0] *= 10;
  System.out.println(Arrays.toString(b));
 }

 /**
  *
  */
 void copia31Objetos() {
  Punto[] a = new Punto[]{new Punto(1, 2), new Punto(3, 4)};
  System.out.println(Arrays.toString(a));
  Punto[] b = Arrays.copyOf(a, a.length);
  System.out.println(Arrays.toString(b));
  a[0].multiplica(-1);
  System.out.println(Arrays.toString(b));
 }

 public static void main(String[] args) {

  VademecumPag17ArrayMetodoClone vp17 = new VademecumPag17ArrayMetodoClone();
  System.out.println("------ copia2 ----------");
  vp17.copia2();
  System.out.println("------ copia20 ----------");
  vp17.copia20();
  System.out.println("------ copia2objetos ---------");
  vp17.copia2objetos();
  System.out.println("------ copia2ArraysBiDi ----------");
  vp17.copia2ArraysBiDi();
  System.out.println("------ copia21Objetos -----------");
  vp17.copia21Objetos();
  System.out.println("------ copia30 -----------");
  vp17.copia30();
  System.out.println("------ copia31Objetos -----------");
  vp17.copia31Objetos();
 }
}

class PuntoA {

 private int x, y;

 public PuntoA(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public void multiplica(int factor) {
  x *= factor;
  y *= factor;
 }

 @Override
 public String toString() {
  return String.format("(%d %d)", x, y);
 }

}
