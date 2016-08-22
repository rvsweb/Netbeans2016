/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Refactoring;

/**
 * @see - 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeRefactoringPag128 {

}

/**
 * Actvidad por la que vamos a modificar el codigo fuente , sin modificar su
 * funcionamiento pero buscando una mejor legibilidad o estructura
 *
 * Actividades de Refactoring :
 *
 * 1 - Renombrar variables para que su nombre refleje intuitivamente su
 * contenido
 *
 * 2 - Renombrar metodos para que su nombre refleje intuitivamente su contenido
 *
 * 3 - Renombrar clases para que su nombre refleje intuitivamente su esencia
 *
 * 4 - Reordenar las clases en paquetes para que la estructura agrupe funciones
 * de detalle
 *
 * @author remoto
 */
class Refactoring {

 /**
  * Refactoring : Extraccion de variables
  *
  * Dificil lectura
  *
  * @param m1
  * @param m2
  * @return
  */
 public static int[][] mezcla(int[][] m1, int[][] m2) {
  int[][] resultado = new int[Math.max(m1.length, m2.length)][Math.max(m1[0].length, m2[0].length)];
  for (int i = 0; i < Math.max(m1.length, m2.length); i++) {
   for (int j = 0; j < Math.max(m1[0].length, m2[0].length); j++) {
    if (i < m1.length && j < m1[0].length) {
     if (i < m2.length && j < m2[0].length) {
      resultado[i][j] = (m1[i][j] + m2[i][j]) / 2;
     } else {
      resultado[i][j] = m1[i][j];
     }
    } else {
     if (i < m2.length && j < m2[0].length) {
      resultado[i][j] = m2[i][j];
     } else {
      resultado[i][j] = 0;
     }
    }
   }
  }
  return resultado;
 }

 /**
  * Paso 1 : Extraccion de las variables filasM1 , columnasM1 , filasM2 ,
  * columnasM2
  *
  *
  * @param m1
  * @param m2
  * @return
  */
 public static int[][] mezcla1(int[][] m1, int[][] m2) {
  int filasM1 = m1.length;
  System.out.println("fila 1º max : " + filasM1);
  int columnasM1 = m1[0].length;
  System.out.println("col 1º max :" + columnasM1);
  int filasM2 = m2.length;
  System.out.println("fila 2º max :" + filasM2);
  int columnasM2 = m2[0].length;
  System.out.println("col 2º max :" + columnasM2);
  int[][] resultado = new int[Math.max(filasM1, filasM2)][Math.max(columnasM1, columnasM2)];

  for (int i = 0; i < Math.max(filasM1, filasM2); i++) {
   for (int j = 0; j < Math.max(columnasM1, columnasM2); j++) {
    if (i < filasM1 && j < columnasM1) {
     if (i < filasM2 && j < columnasM2) {
      resultado[i][j] = (m1[i][j] + m2[i][j]) / 2;
     } else {
      resultado[i][j] = m1[i][j];
     }
    } else {
     if (i < filasM2 && j < columnasM2) {
      resultado[i][j] = m2[i][j];
     } else {
      resultado[i][j] = 0;
     }
    }
   }
  }
  return resultado;
 }

 /**
  * Paso 2 : Introduccion de las variables filasR y columnasR
  *
  * @param m1
  * @param m2
  * @return
  */
 public static int[][] mezcla2(int[][] m1, int[][] m2) {
  int filasM1 = m1.length;
  int columnasM1 = m1[0].length;
  int filasM2 = m2.length;
  int columnasM2 = m2[0].length;

  int filasR = Math.max(filasM1, filasM2);
  System.out.println("filasR : " + filasR);
  int columnasR = Math.max(columnasM1, columnasM2);
  System.out.println("columnasR : " + columnasR);

  int[][] resultado = new int[filasR][columnasR];
  for (int i = 0; i < filasR; i++) {
   for (int j = 0; j < columnasR; j++) {
    if (i < filasM1 && j < columnasM1) {
     if (i < filasM2 && j < columnasM2) {
      resultado[i][j] = (m1[i][j] + m2[i][j]) / 2;
     } else {
      resultado[i][j] = m1[i][j];
     }
    } else {
     if (i < filasM2 && j < columnasM2) {
      resultado[i][j] = m2[i][j];
     } else {
      resultado[i][j] = 0;
     }
    }
   }
  }
  return resultado;
 }

 /**
  * Paso 3 : Introduccion de las variables estaEnM1 y estaEnM2
  *
  * @param m1
  * @param m2
  * @return
  */
 public static int[][] mezcla3(int[][] m1, int[][] m2) {
  int filasM1 = m1.length;
  int columnasM1 = m1[0].length;
  int filasM2 = m2.length;
  int columnasM2 = m2[0].length;

  int filasR = Math.max(filasM1, filasM2);
  System.out.println("• filasR : " + filasR);
  int columnasR = Math.max(columnasM1, columnasM2);
  System.out.println("• columnasR : " + columnasR);

  int[][] resultado = new int[filasR][columnasR];

  for (int i = 0; i < filasR; i++) {
   for (int j = 0; j < columnasR; j++) {
    boolean estaEnM1 = i < filasM1 && j < columnasM1;
    boolean estaEnM2 = i < filasM2 && j < columnasM2;
    System.out.println("---------------");
    System.out.println(" ♦ estaEnM1 : " + estaEnM1 + " - f1 : " + filasM1 + " - c1 : " + columnasM1 + " - " + m1[i][j]);
    System.out.println(" ♦ estaEnM1 : " + estaEnM2 + " - f2 : " + filasM2 + " - c2 : " + columnasM2 + " - " + m1[i][j]);
    if (estaEnM1) {
     if (estaEnM2) {
      resultado[i][j] = (m1[i][j] + m2[i][j]) / 2;
     } else {
      resultado[i][j] = m1[i][j];
     }
    } else {
     if (estaEnM2) {
      resultado[i][j] = m2[i][j];
     } else {
      resultado[i][j] = 0;
     }
    }
   }
  }
  return resultado;
 }

 public static void main(String[] args) {

  int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
  int[][] m2 = {{11, 22, 33}, {44, 55, 66}};

  int[][] mezcla = mezcla(m1, m2);

  for (int i = 0; i < mezcla.length; i++) {
   for (int j = 0; j < mezcla[i].length; j++) {
    System.out.print("|" + mezcla[i][j]);
   }
   System.out.println("");
  }

  System.out.println("--------------------------------");

  int[][] m1max = {{1, 2, 3}, {4, 5, 6}};
  int[][] m2max = {{11, 22, 33}, {44, 55, 66}};

  int[][] mezcla_1 = mezcla1(m1max, m2max);

  System.out.println("--------------------------------");
  for (int i = 0; i < mezcla_1.length; i++) {
   for (int j = 0; j < mezcla_1[i].length; j++) {
    System.out.print("|" + mezcla_1[i][j]);
   }
   System.out.println("");
  }

  System.out.println("--------------------------------");
  int[][] m1max1 = {
   {1, 2, 3},
   {1, 2, 3},
   {1, 2, 3},
   {1, 2, 3},
   {4, 5, 6}};
  int[][] m2max2 = {
   {11, 22, 33},
   {44, 55, 66}};

  int[][] mezcla_2 = mezcla2(m1max1, m2max2);

  System.out.println("--------------------------------");
  for (int i = 0; i < mezcla_2.length; i++) {
   for (int j = 0; j < mezcla_2[i].length; j++) {
    System.out.print("|" + mezcla_2[i][j]);
   }
   System.out.println("");
  }

  System.out.println("--------------------------------");
  int[][] m1max11 = {
   {1, 2, 3},
   {11, 22, 33},
   {444, 555, 666}};
  int[][] m2max22 = {
   {4, 5, 6},
   {44, 55, 66}};

  int[][] mezcla_3 = mezcla3(m1max11, m2max22);

  System.out.println("------------------------------");
  for (int i = 0; i < mezcla_3.length; i++) {
   for (int j = 0; j < mezcla_3[0].length; j++) {
    System.out.println(mezcla_3.length + " <-> " + mezcla_3[i].length + " -- " + mezcla_3[i][j]);
   }
   System.out.println("------------------------------");
  }

 }
}
