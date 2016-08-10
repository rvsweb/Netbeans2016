/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array;

import java.util.Random;

/**
 * @see - Libro Vademecum
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 *
 */
public class VademecumArray {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {

  System.out.println("---------- Conceptos basicos : Declaracion directa ------------");

//Tipo [] ... [] variable;
// Tipo primitivo
  int[] vector;
  double[][] matriz;
// Tipo Objetos
  String[][][] cadena = null;

  vector = new int[100];
  matriz = new double[2][3];

  int[] vector2 = new int[100];
  double[][] matriz2 = new double[2][3];

  int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 31};

  int[] cuadrados = {1 * 1, 2 * 2, 3 * 3, 4 * 4};

  int[][] matriz_2 = {
   {1, 2, 3},
   {4, 5, 6}};

  int[][] triangularPascal = {
   {1, 1},
   {1, 2, 1},
   {1, 3, 3, 1},
   {1, 4, 6, 4, 1}
  };

  System.out.println("---------- Conceptos basicos : Mostrar valores ------------");

  for (int i = 0; i < cuadrados.length; i++) {
   System.out.print(cuadrados[i] + " ");
  }
  System.out.println("");

  System.out.println("---------- Conceptos basicos : Uso de String  ------------");

  String nombre = "Pepito";
  String[] dialogo = {"Hola D. " + nombre, "Adios D. " + nombre};

  System.out.println("-> " + dialogo[0]);
  System.out.println("-> " + dialogo[1]);

  System.out.println("-------------------------------------------");

  for (int i = 0; i < dialogo.length; i++) {
   System.out.println(dialogo[i]);
  }

  System.out.println("----- Manejo Posiciones del Array ------");
//  Declaracion
  int[] x = new int[10];

  System.out.println("Lectura de valor <->int[] x = new int[10] ");
  System.out.println("x[0] : " + x[0]);
  System.out.println("x[1] : " + x[1]);
  System.out.println("x[2] : " + x[2]);
  System.out.println("x[3] : " + x[3]);
  System.out.println("x[4] : " + x[4]);
  System.out.println("x[5] : " + x[5]);
  System.out.println("x[6] : " + x[6]);
  System.out.println("x[7] : " + x[7]);
  System.out.println("x[8] : " + x[8]);
  System.out.println("x[9] : " + x[9]);

  System.out.println("");
  for (int i = 0; i < x.length; i++) {
   System.out.print(x[i] + " - ");
  }

  System.out.println("\nLectura de valor <-> int[] x = new int[10] ");
  System.out.println("x[0] : " + x[0]);
  System.out.println("x[1] : " + x[1]);
  System.out.println("x[2] : " + x[2]);
  System.out.println("x[3] : " + x[3]);
  System.out.println("x[4] : " + x[4]);
  System.out.println("x[5] : " + x[5]);
  System.out.println("x[6] : " + x[6]);
  System.out.println("x[7] : " + x[7]);
  System.out.println("x[8] : " + x[8]);
  System.out.println("x[9] : " + x[9]);

  int[][] crea = Array_DimensionesAleatorias.crea();
  System.out.println("");
  System.out.println("Lectura de valor <-> int[] x = new int[10] ");
  x[0] = 100;
  x[1] = 1;
  x[2] = 2;
  x[3] = 3;
  x[4] = 5;
  x[5] = 7;
  x[6] = 11;
  x[7] = 13;
  x[8] = 17;
  x[9] = 21;

  System.out.println("• Primer elemento : " + x[0]);
  System.out.println("• Ultimo elemento : " + x[x.length - 1]);
  System.out.println("• Ultimo elemento : " + x[10 - 1]);

  System.out.println("x[0] : " + x[0]);
  System.out.println("x[1] : " + x[1]);
  System.out.println("x[2] : " + x[2]);
  System.out.println("x[3] : " + x[3]);
  System.out.println("x[4] : " + x[4]);
  System.out.println("x[5] : " + x[5]);
  System.out.println("x[6] : " + x[6]);
  System.out.println("x[7] : " + x[7]);
  System.out.println("x[8] : " + x[8]);
  System.out.println("x[9] : " + x[9]);

  System.out.println("\n---------- Doble For --------------");
  System.out.println(" for (int i = 0; i < crea.length; i++) {\n"
          + "   for (int j = 0; j < crea[i].length; j++) ");
  System.out.println("");
  for (int i = 0; i < crea.length; i++) {
   for (int j = 0; j < crea[i].length; j++) {
    System.out.print(crea[i][j] + " ");
   }
   System.out.println("");
  }

  System.out.println("");
  System.out.println("1º fila y 1º columna ");
  System.out.println("x[0][0] ");
  int[][] crea2 = Array_DimensionesAleatorias.crea();

  System.out.println("");
  System.out.println("----------- ForEach y For -------------");
  System.out.println(" for (int[] crea1 : crea2) {\n"
          + "   for (int jj = 0; jj < crea1.length; jj++) ");
  System.out.println("");
  for (int[] crea1 : crea2) {
   for (int jj = 0; jj < crea1.length; jj++) {
    System.out.print(crea1[jj] + " ");
   }
   System.out.println("");
  }

  int maximo = Integer.MIN_VALUE;
  System.out.println("\n Integer.MIN_VALUE : " + maximo);

  System.out.println("• Recorrido de un Array ");
  for (int i = 0; i < x.length; i++) {
   vector[i] = (int) (Math.random() * (1 + 100));
   System.out.println("• Vector[i] : " + vector[i]);
   if (vector[i] > maximo) {
    maximo = vector[i];
   }
   System.out.println("♦ Maximo : " + maximo);
  }

  System.out.println("--------------------------------------------");

  int maximo1 = Integer.MIN_VALUE;
  int c = 0;
  System.out.println("♦ Integer.MIN_VALUE " + maximo1);
  for (int n : vector) {
   int nn = (int) (Math.random() * (1 + 100));
   if (nn > maximo1) {
    maximo1 = nn;
   }
   System.out.println("Valor de indice " + c++ + " n " + n + " nn " + nn + " • Maximo : " + maximo1);
  }
 }
}

class Array_DimensionesAleatorias {

 /**
  * Genera una Array de 2 dimensiones
  *
  * @return
  */
 public static int[][] crea() {
// Creamos una variable referencia a un objeto del tipo Random
  Random random = new Random();
// Generamos un num aleatorio y lo almacenamos dentro de una variable primitiva
  int filas = 1 + random.nextInt(9);
// Creamos una matriz 
  int[][] resultado = new int[filas][];
// Recorremos el array de filas 
  for (int i = 0; i < filas; i++) {
// Generamos un num aleatorio y lo almacenamos dentro de una variable primitiva
   int columnas = 1 + random.nextInt(9);
// La variable de referencia crea una dimension aleatoria 
// Genera una nueva variable referencia la cual apunta a una nueva direccion de memoria
   resultado[i] = new int[columnas];
// Recorre el num generado por la columna 
   for (int j = 0; j < columnas; j++) {
// almacena en cada dimension y columna los valores generados aleatoriamente
    resultado[i][j] = -9 + random.nextInt(109);
   }
  }
  return resultado;
 }
}
