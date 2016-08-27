/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xejemplosdesktop.ArraysMatrices;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class xEjArrayBasico {

 public static void main(String[] args) {

  int[] a = new int[1];
  System.out.println("• nº de filas : " + a.length);
  System.out.println("• valor de la columna : " + a[0]);

  System.out.println("----------- int[] aa = {11} ---------------------");
  int[] a2 = {11};
  System.out.println("♦ nº de filas : " + a2.length);
  System.out.println("♦ nº de columnas : " + a2[0]);

  System.out.println("--------------------------------");
  int[][] a3 = {
   {11},//f0
   {22}};//f1
  System.out.println("♦ nº de filas : " + a3.length);
  System.out.println("♦ nº de columnas : " + a3[0].length);
  System.out.println("♦ nº de columnas : " + a3[1].length);

  System.out.println("--------------------------------");
//                                                 f  c     
  System.out.println("♦ valor de columnas : " + a3[0][0]);
  System.out.println("♦ valor de columnas : " + a3[1][0]);

  System.out.println("\n-------  int[][] a4 = {{11, 22}, {44, 55, 66}}--------------");
  int[][] a4
          = {{11, 22, 88, 99},
          {44, 55, 66}};
  System.out.println("-♦ nº de f1 : " + a4.length);
  System.out.println("-♦ nº de columnas f1 : " + a4[0].length);
  System.out.println("-♦ nº de columnas f2 : " + a4[1].length);
//                                                  f  c     
  System.out.println("-♦- valor de columnas : " + a4[0][0]);
  System.out.println("-♦- valor de columnas : " + a4[0][1]);
  System.out.println("-♦- valor de columnas : " + a4[0][2]);
  System.out.println("-♦- valor de columnas : " + a4[0][3]);
  System.out.println("--------------------------------");
  System.out.println("-♦- valor de columnas : " + a4[1][0]);
  System.out.println("-♦- valor de columnas : " + a4[1][1]);
  System.out.println("-♦- valor de columnas : " + a4[1][2]);

  System.out.println("\n--int[][] a5 = {{{11, 22 ..}, {44, 55, 66}, {111, 222, 333}}}--");
  int[][][] a5
          = {{{11, 22, 33, 44, 55, 66}, {77, 88, 99}, {111, 222, 333, 444}}};
  System.out.println("-• nº de f1 : " + a5.length);
  System.out.println("-• nº de columnas f1 : " + a5[0][0].length);
  System.out.println("-• nº de columnas f2 : " + a5[0].length);
  System.out.println("-• nº de columnas f2 : " + a5[0][1].length);
  System.out.println("-• nº de columnas f3 : " + a5[0][2].length);
 }
}
