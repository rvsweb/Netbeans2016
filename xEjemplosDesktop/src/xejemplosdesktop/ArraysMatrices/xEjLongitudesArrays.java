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
public class xEjLongitudesArrays {

 public static void main(String[] args) {

  int[] a = new int[]{1};
  System.out.println("-• longitud 1D a: " + a.length);

  System.out.println("------------------------------");

  int[][] a2 = new int[][]{
   {1},
   {2},
   {3}};
  System.out.println("-• nº de filas 2D a2: " + a2.length);
  System.out.println("-• longitud 2D a2: " + a2[0].length);
  System.out.println("-• longitud 2D a2: " + a2[1].length);
  System.out.println("-• longitud 2D a2: " + a2[2].length);

  System.out.println("------------------------------");

  int[][][] a3 = new int[][][]{
   {{1}, {2}, {3}}};
  System.out.println("♦ Longitud 3D a3: " + a3.length);
  System.out.println("♦ Numero de columnas 3D a3: " + a3[0].length);

  System.out.println("------------------------------");

  //Nº filas 1
  //Nº Columna 8 
  int[][][] a4 = {{{1}, {2}, {3}, {4}, {5}, {6}, {7}, {18}}};
  System.out.println("• Nº filas 3D a4: " + a4.length);
  System.out.println("• Cuenta nº todas de las columnas de la 1º fila a4: " + a4[0].length); // solo tenemos declarada 1 fila
  System.out.println("------------------------------");

  int[][][] a5
          = {{{111, 3, 4, 5, 6}}};
  System.out.println("• Nº filas 3D a4: " + a5.length);
  System.out.println("• Cuenta nº todas de las columnas de la 1º fila a4: " + a5[0].length); // solo tenemos declarada 1 fila
  System.out.println("------------------------------");

 }
}
