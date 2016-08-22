/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Refactoring;

/**
 * @see 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeEncapsulacionPag128 {

}

/**
 * Consiste en sustituir campos public por private y acceder por medio de
 * metodos public
 *
 * @author remoto
 */
class Encapsulacion {

 private String nombre;

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

}

/**
 * Una expresion imbuida en una expresion mas grande puede extraerse para
 * aclarar el significado de la sub_expresion
 *
 * Para ello se introducen variables auxiliares
 *
 * @author remoto
 */
class IntroduccionVariableExplicativas {

}

/**
 * Refactoring : variable Explicativas
 *
 * @author remoto
 */
class VariableExplicativas {

 /**
  * Metodo en una sola linea
  *
  * @param anio
  * @return
  */
 public boolean bisiesto(int anio) {
  return ((anio % 4 == 0) && (!(anio % 100 == 0)) || (anio % 400 == 0));
 }

 /**
  * Descomponemos la expresion booleana en expresiones mas sencillas y
  * explicativas
  *
  * @param anio
  * @return
  */
 public boolean bisiesto2(int anio) {
  boolean multiplo4 = (4 / anio == 0);
  boolean multiplo100 = (100 / anio == 0);
  boolean multiplo400 = (400 / anio == 0);
  return (multiplo4 && (!multiplo100)) || multiplo400;
 }

}

/**
 * Eliminacion de variables
 *
 * En la extraccion de variables se elige una expresion y se calcula asignando
 * el resultado a una variable , a continuacion , se emplea la variable en donde
 * la expresion.
 *
 * La variable puede ser local o ser un campo del objeto
 *
 * La extraccion de variables permite:
 *
 * 1 - Dar un nombre significativo a una expresion
 *
 * 2 - Simplificar las expresiones que usan la nueva variable
 *
 * 3 - Acelerar la ejecucion cuando la expresion reemplazada se evalua una sola
 * vez en vez de varias veces
 *
 *
 * @author remoto
 */
class Extraccion {

 /**
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
      resultado[i][j] = (m1[i][j] + m2[j][j]) / 2;
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
  * 1º Paso : Extraccion de las variables filasM1 , columnasM1 , filasM2 ,
  * columnasN2
  *
  * @param m1
  * @param m2
  * @return
  */
 public int[][] mezcla2(int[][] m1, int[][] m2) {
  System.out.println("1º Paso : Extraccion de las variables filasM1 , columnasM1 , filasM2 , columnasN2 ");
  int filasM1 = m1.length; // max fila 1
  int filasM2 = m2.length; // max fila 2
  int columnasM1 = m1[0].length; // max col 1
  int columnasM2 = m2[0].length; // max col 2

  int[][] resultado = new int[Math.max(filasM1, filasM2)][Math.max(columnasM1, columnasM2)];

  for (int i = 0; i < Math.max(filasM1, filasM2); i++) {
   for (int j = 0; j < Math.max(columnasM1, columnasM2); j++) {
    if (i < filasM1 && j < columnasM1) {
     if (i < filasM2 && j < columnasM2) {
      resultado[i][j] = (m1[i][j] + m2[i][j]) / 2; // asignacion
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

// public static int[][] mezcla2(int[][] m1, int[][] m2) {
//
// }

 /**
  * Recorrer la matriz
  *
  * @param a
  * @param b
  */
 public static void recorrer_matriz(int[][] a, int[][] b) {
  for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[0].length; j++) {
    System.out.print(a[i][j] + "|");
   }
   System.out.println("");
  }

  System.out.println("-------------------");
  for (int i = 0; i < b.length; i++) {
   for (int j = 0; j < b[0].length; j++) {
    System.out.print(b[i][j] + "|");
   }
   System.out.println("");
  }

 }

 public static void main(String[] args) {

  int[][] a = new int[][]{{1, 2}, {4, 5}};
  int[][] b = new int[][]{{6, 7}, {8, 9}};

  System.out.println("------ Ver Resultado ------");
  System.out.println("------ Uso del metodo-------");
  int[][] mezcla = mezcla(a, b);
  for (int i = 0; i < mezcla.length; i++) {
   for (int j = 0; j < mezcla[0].length; j++) {
    System.out.print(mezcla[i][j] + "|");
   }
   System.out.println("");
  }

 }

}
