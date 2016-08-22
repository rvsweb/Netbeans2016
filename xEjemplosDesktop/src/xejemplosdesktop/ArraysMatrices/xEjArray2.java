/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xejemplosdesktop.ArraysMatrices;

/**
 * @see .-
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class xEjArray2 {

 public static void main(String[] args) {

  int[][][] a = new int[][][]{{
                               {1, 1, 1}, 
                               {1, 1, 1, 1}, 
                               {1, 1, 1 , 1 ,1}}};
  
  System.out.println("-----------------------------");
  System.out.println(a.length);
  System.out.println(a[0].length);
  System.out.println("nº columnas 1º fila "+a[0][0].length);
  System.out.println("nº columnas 2º fila "+a[0][1].length);
  System.out.println("nº columnas 3º fila "+a[0][2].length);
  
  System.out.println("-----------------------------");
  for (int i = 0; i < a.length; i++) {
   System.out.println("*");
  }
 }
}
