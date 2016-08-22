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
public class xEjArray {

 public static void main(String[] args) {

  int[] a = {11, 22, 33};

  System.out.println("• longitud - int[] a : " + a.length);
  System.out.println("-------------------------");
  System.out.println("♦ columna 1 : " + a[0]);
  System.out.println("♦ columna 2 : " + a[1]);
  System.out.println("♦ columna 3 : " + a[2]);
  System.out.println("-------------------------");

//                0   1    2    3    4   5
  int[][] aa = {{44, 55, 33, 22, 11, 01},
                {66, 77, 88}};

  System.out.println("• longitud int[][] aa : " + aa.length + " numero de filas ");
  System.out.println("----------------------------------");

  for (int i = 0; i < aa.length; i++) {
   System.out.println("♦ longitud de las filas -> int[][] aa : " + aa[i].length);
  }
  System.out.println("----------------------------------");

  System.out.println("♦ nº de columnas de la 1º filas -> aa[0].length : " + aa[0].length);
  System.out.println("♦ nº de columnas de la 2º filas -> aa[1].length : " + aa[1].length);
  
  System.out.println("\n----- 1º Fila --------------");
  System.out.println(aa[0][0]+ " | "+ aa[0][1]+ " | "+ aa[0][2]  + " | "+ aa[0][3]+ " | "+ aa[0][4] + " | " + aa[0][5] );
  System.out.println("----- 2º Fila --------------");
  System.out.println(aa[1][0]+ " | "+ aa[1][1]+ " | "+ aa[1][2]);
  
  System.out.println("----------------------------");

  
 }
}
