/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xejemplosdesktop.ArraysMatrices;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjArrayDimensiones {

 public static void main(String[] args) {
//               1d      2d 
  int[][] d = {
   {1, 2},
   {3, 4}};

  System.out.println("nº de filas " + d.length);

  int[][] d1 = {
   {1, 2},
   {3, 4},
   {5, 6}
  };
  System.out.println("nº de filas " + d1.length);

  System.out.println("---------------------------------");

  int[][] d2 = {
   {1, 2, 3},
   {4, 5, 6, 7, 8}
  };

  System.out.println("nº de filas : " + d2.length);
  System.out.println("nº columas 1º fila : " + d2[0].length);
  System.out.println("nº columas 2º fila : " + d2[1].length);

  System.out.println("_________________________");
  System.out.print("" + d2[0][0]);
  System.out.print(" | " + d2[0][1]);
  System.out.print(" | " + d2[0][2]);
  System.out.print("\n" + d2[1][0]);
  System.out.print(" | " + d2[1][1]);
  System.out.print(" | " + d2[1][2]);
  System.out.print(" | " + d2[1][3]);
  System.out.print(" | " + d2[1][4]);
  System.out.print("\n_________________________");
  System.out.println("");

  int[][][] d3 = {{
   {22, 33},
   {11, 22, 33},
   {44, 55, 66, 66},
   {111, 222, 333, 444, 555}}};

  System.out.println("nº de filas : " + d3.length);
  System.out.println("nº columas 1º fila : " + d3[0].length);
  System.out.println("________________________________________");
  System.out.println("nº columas 1º fila : " + d3[0][0].length);
  System.out.println("nº columas 1º fila : " + d3[0][1].length);
  System.out.println("nº columas 1º fila : " + d3[0][2].length);
  System.out.println("nº columas 1º fila : " + d3[0][3].length);
  System.out.println("________________________________________");

  int[][][][] d4 = {{{
   {1, 2},
   {3, 4},
   {15, 16},
   {25, 26},
   {35, 36},
   {45, 46}}}};
  System.out.println("•- " + d4.length);
  System.out.println("•- " + d4[0].length);
  System.out.println("•- " + d4[0][0].length);

 }
}
