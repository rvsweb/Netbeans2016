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
public class VademecumArrayCopiaMatrices {

 /**
  *
  */
 public void copia2ArrayBiDi() {
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
 public void copiaArrayMetodoStandar() {
  String a[] = {"1", "2", "3", "4", "5"};
  String b[] = new String[a.length];
  System.arraycopy(a, 0, b, 0, a.length);
  for (int i = 0; i < b.length; i++) {
   System.out.println(b[i]);
  }
 }

 /**
  *
  */
 public void copia20() {
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
 public void copia21Objetos() {
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
 public void copia22metodocopyOf() {
  Punto[] a = new Punto[]{new Punto(11, 22), new Punto(33, 44)};
  Punto[] b = Arrays.copyOf(a, a.length);
  for (int i = 0; i < b.length; i++) {
   System.out.println(b[i]);
  }
 }

 /**
  *
  */
 public void copia31Objetos() {
  Punto[] a = new Punto[]{new Punto(111, 222), new Punto(333, 444)};
  System.out.println(Arrays.toString(a));
  Punto[] b = Arrays.copyOf(a, a.length);
  System.out.println(Arrays.toString(b));
  a[0].multiplica(-1);
  System.out.println(Arrays.toString(b));
 }

 public void copia32ObjetosExplicitamente() {
  String[] a = {"a1", "a2", "a3", "a4", "a5"};
  String[] b = new String[a.length];
  for (int i = 0; i < a.length; i++) {
   b[i] = a[i];
  }
  for (int i = 0; i < b.length; i++) {
   System.out.print(b[i] + " ");
  }
  System.out.println("");
 }

 public static void main(String[] args) {

  VademecumArrayCopiaMatrices v = new VademecumArrayCopiaMatrices();
  v.copia2ArrayBiDi();
  System.out.println("--------------");
  v.copiaArrayMetodoStandar();
  System.out.println("--------------");
  v.copia20();
  System.out.println("--------------");
  v.copia21Objetos();
  System.out.println("--------------");
  v.copia22metodocopyOf();
  System.out.println("--------------");
  v.copia31Objetos();
  System.out.println("--------------");
  v.copia32ObjetosExplicitamente();
  System.out.println("--------------");
  System.out.println("--- Valores de tipo Array ---  ");
  int[] vector = new int[]{2, 4, 6, 8, 16, 32, 64, 128};
  String[] opciones = new String[]{"si", "no"};

 }
}
