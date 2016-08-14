/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Etiquetas;

/**
 * @see - 67
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEtiquetasContinuePag58 {

 /**
  * Encuentra la primera linea tal que los datos de las columnas estan ordenados
  * (valores estrictamente crecientes )
  *
  * @param matriz NO NECESARIAMENTE RECTANGULAR
  * @return fila : con datos ordenados , o -1 si no hay ninguna
  */
 static int fileOrdenada(int[][] matriz) {
  filas:
  for (int fila = 0; fila < matriz.length; fila++) {
   for (int columna = 1; columna < matriz[fila].length; columna++) {
    int v1 = matriz[fila][columna - 1];
    int v2 = matriz[fila][columna];
    if (v1 >= v2) {
     continue filas; // 'continue' fuerce el salto a la siguiente vuelta del bucle mas interno en ejecucion
// Si queremos retomar otro bucle mas externo , lo marcaremos con una etiqueta X y regresamos a el escribiendo continue filas;
    }
   }
   return fila;
  }
  return -1;
 }

 /**
  * Sentencia 'continue' fuerce el salto a la siguiente vuelta del bucle mas
  * interno en ejecucion
  *
  * Si queremos retomar otro bucle mas externo , lo marcaremos con una etiqueta
  * X y regresaremos a el escribiendo
  *
  * continue X;
  *
  * Sirva el siguiente metodo de ejemplo
  *
  * @param args
  */
 public static void main(String[] args) {

//                     Columnas 1  2  3 |  1  2  3  4   5  
  int[][] matriz = new int[][]{{1, 2, 3}, {6, 7, 8, 9, 10}};

  System.out.println("------------------------");
  System.out.println(matriz[0][0]);
  System.out.println(matriz[0][1]);
  System.out.println(matriz[0][2]);
  System.out.println(matriz[1][0]);
  System.out.println("------------------------");
  System.out.println(matriz[1][1]);
  System.out.println(matriz[1][2]);
  System.out.println(matriz[1][3]);
  System.out.println(matriz[1][4]);
  System.out.println("------------------------");

  int lonFila = matriz.length;
  int lonCol = matriz[0].length;
  int lonCol1 = matriz[1].length;
  int[][] matriz2 = new int[][]{{31, 22, 63}, {4, 37, 88, 59, 410}};
  System.out.println("Longitud Fila : " + lonFila);
  System.out.println("Longitud Colum : " + lonCol);
  System.out.println("Longitud Colum : " + lonCol1);
  int fileOrdenada = fileOrdenada(matriz);
  System.out.println("----------------------------------------");
  System.out.println("Esta ordenada la fila ? -> " + fileOrdenada);
  int fileOrdenada1 = fileOrdenada(matriz2);
  System.out.println("----------------------------------------");
  System.out.println("Esta ordenada la fila ? -> " + fileOrdenada1);
 }
}
