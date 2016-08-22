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
public class xEjMatrices {

 public static void main(String[] args) {

  int[][] a = new int[][]{{1}, // fila 1 
                          {3, 4}}; // fila 2
  System.out.println(" nº de filas : " + a.length);
//                                      f                             f  c      
  System.out.println("columna 1 : " + a[0].length + " - valor : " + a[0][0]);
  System.out.println("columna 2 : " + a[1].length + " - valor : " + a[1][0]);
  System.out.println("columna 2 : " + a[1].length + " - valor : " + a[1][1]);
  
  System.out.println("-----------------------------------");
  int[][][] b = new int[][][]{{{11, 22, 33},
                               {44, 55, 66, 77},
                               {88, 90, 91, 92, 93}}};

  System.out.println("fila b : " + b.length);
  System.out.println("columna b : " + b[0].length);
  System.out.println("---------------------------------------------------");
  System.out.println("numero columnas de la 1º fila : " + b[0][0].length); // numero columnas de la 1º fila
  System.out.println("numero columnas de la 2º fila : " + b[0][1].length); // numero columnas de la 2º fila
  System.out.println("numero columnas de la 3º fila : " + b[0][2].length); // numero columnas de la 3º fila

  System.out.println("-------------------------------------");
  
  int[][][] bb = {{{11, 22, 33},
                   {44, 55 },
                   {88}}};

  System.out.println("fila 1 bb : " + bb.length);
  System.out.println("fila 3 bb : " + bb[0].length);
  System.out.println("fila 2 bb : " + bb[0][1].length);

  System.out.println("-------------------------------------");
  int [][][] bbx = new int [4][12][13];
  System.out.println("fila bb : " + bbx.length);
  System.out.println("fila bb : " + bbx[0].length);
  System.out.println("fila bb : " + bbx[0][1].length);
  
  System.out.println("-------------------------------------");
    int[][] aa = new int[][]{{1}, // fila 1 
                             {3, 4}}; // fila 2
  System.out.println("fila aa : " + aa.length);
  
  System.out.println("-------------------------------------");
    int[][] aaa = new int[][]{{1,1,1,1,1,1,1,1,1,1,1,1,1,}, // fila 1 
                             {3, 4}, // fila 2
                             {3, 4}, // fila 2
                             {3, 4}, // fila 2
                             {3, 4}}; // fila 2
  System.out.println("nº de columna aaa : " + aaa[0].length);
  System.out.println("nº de fila aaa : " + aaa.length);

  System.out.println("-------------------------------------");
  int[][][] bbb = new int[3][4][5];  
  System.out.println("fila 1 - nº columnas : " + bbb.length); // nº columnas 1 fila
  System.out.println("fila 2 - nº columnas : " + bbb[0].length); // nº columnas 2 fila
  System.out.println("fila 3 - nº columnas : " + bbb[0][0].length); // nº columnas 3 fila
    
  
  
 }
}
