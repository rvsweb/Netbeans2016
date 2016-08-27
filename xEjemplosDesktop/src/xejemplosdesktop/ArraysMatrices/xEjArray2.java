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

  /**
   * Tengo instanciada creada 3 dimensiones pero esta declaras 4 filas de Arrays
   */
  int[][][] a = new int[][][]{{
   {1, 1, 1}, //f1
   {1, 1, 1, 1},//f2
   {1, 1, 1, 1},//f3
   {1, 1, 1, 1, 1}}};//f4

  System.out.println("-----------------------------");
  System.out.println("Posicion fila 1 : " + a.length);
  System.out.println("Ultima posicion fila : " + a[0].length);
  System.out.println("-----------------------------");
  System.out.println("nº columnas 1º fila " + a[0][0].length);
  System.out.println("nº columnas 2º fila " + a[0][1].length);
  System.out.println("nº columnas 3º fila " + a[0][2].length);
  System.out.println("nº columnas 4º fila " + a[0][3].length);

  System.out.println("-----------------------------");
  for (int i = 0; i < a.length; i++) {
   System.out.println("*");
  }

  System.out.println("_______________________________");

  for (int i = 0; i < a[0].length; i++) {
   System.out.print("|");
  }
  System.out.print("\nTotal de filas : " + a[0].length);
  System.out.println("");
 }
}
