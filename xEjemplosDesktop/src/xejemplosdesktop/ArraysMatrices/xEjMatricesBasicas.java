/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xejemplosdesktop.ArraysMatrices;

/**
 * @see -
 * http://puntocomnoesunlenguaje.blogspot.com.es/2012/12/matriz-en-java.html
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class xEjMatricesBasicas {

 public static void main(String[] args) {

  int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};

  System.out.println("•- nº filas " + numeros.length);
  System.out.println("•- nº 0 col " + numeros[0].length);
  System.out.println("•- nº 1 col " + numeros[1].length);
  System.out.println("•- nº 2 col " + numeros[2].length);
  System.out.println("•- nº 3 col " + numeros[3].length);

  int[][][] numeros1 = {{
   {1, 2, 3},
   {4, 5, 6},
   {7, 8, 9, 9, 9},
   {11, 12, 13}}};

  System.out.println("-------------------------");
  System.out.println("nº filas : " + numeros1.length);
  System.out.println("nº columnas por fila : " + numeros1[0].length);
  System.out.println("nº 1 columnas por fila " + numeros1[0][0].length);
  System.out.println("nº 2 columnas por fila " + numeros1[0][1].length);
  System.out.println("nº 3 columnas por fila " + numeros1[0][2].length);
  System.out.println("nº 4 columnas por fila " + numeros1[0][3].length);
  System.out.println("-------------------------");

  int[][][] numeros2 = new int[2][3][4];
  System.out.println("nº filas 1 : " + numeros2.length);
  System.out.println("nº filas 2 : " + numeros2[0].length);
  System.out.println("nº filas 3 : " + numeros2[0][0].length);

  System.out.println("-------------------------");

  int[][][] numeros3 = {{
   {11, 22, 33},
   {44, 55, 66}}};
  System.out.println("nº filas 1 : " + numeros3.length);
  System.out.println("nº filas 2 : " + numeros3[0].length);
  System.out.println("nº filas 3 : " + numeros3[0][0].length);

  System.out.println("-------------------------");
  int[][][] numeros4 = {{{1, 1, 1, 1, 1, 1, 1}, {2}}};
  System.out.println("nº filas 1 : " + numeros4.length);
  System.out.println("nº filas 2 : " + numeros4[0].length);
  System.out.println("nº filas 3 : " + numeros4[0][0].length);

  System.out.println("-------------------------");

  int[][][] n5 = {{{1, 2}, {0, 0, 0}, {1, 1, 1, 1}}};

  System.out.println("nº filas 1 : " + n5.length);
  System.out.println("nº filas totales : " + n5[0].length);
  System.out.println("-------------------------");
  System.out.println("nº col 1 : " + n5[0][0].length);
  System.out.println("nº col 2 : " + n5[0][1].length);
  System.out.println("nº col 3 : " + n5[0][2].length);

  System.out.println("----------------------------------------");
  System.out.println("------------- Ejemplo ------------------");
  System.out.println("----------------------------------------");

  int[][][] n6 = {{{1, 2}, {0, 0, 0}, {1, 1, 1, 1}}};
  int x = n6.length;
  System.out.println("n6.length - " + x);
  int x1 = n6[0].length;
  System.out.println("nº filas 1 : " + x1);
  System.out.println("---------------------------------------");
  int x2 = n6[0][0].length;
  System.out.println("nº col 1º fila : " + x2);
  int x3 = n6[0][1].length;
  System.out.println("nº col 1º fila : " + x3);
  int x4 = n6[0][2].length;
  System.out.println("nº col 1º fila : " + x4);
  System.out.println("---------------------------------------");

  int[][][][] n7 = {{{{1, 2}, {0, 0, 0}, {1, 1, 1, 1}}}};
  int x7 = n7.length;
  System.out.println("n7.length -> " + x7);

  int[][][][] n8 = new int[13][23][33][43];
  System.out.println("n8 nº col = f1 -> " + n8.length);
  System.out.println("n8 nº col = f2 -> " + n8[0].length);
  System.out.println("n8 nº col = f3 -> " + n8[0][0].length);
  System.out.println("n8 nº col = f4 -> " + n8[0][0][0].length);

 }
}
