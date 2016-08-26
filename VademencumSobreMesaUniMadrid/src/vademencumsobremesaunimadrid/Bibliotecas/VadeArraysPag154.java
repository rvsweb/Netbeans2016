/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas;

import java.util.Arrays;

/**
 * @see 2
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeArraysPag154 {

 public static int alea() {
  int a1 = (int) (Math.random() * (Math.max(1, 10)));
  return a1;
 }

//♦ Clase Arrays proporciona multiples metodos para manipular Arrays 
// sobre multiples tipos de datos 
//♦  T -> tipo primitivos ( enteros , reales , booleanos ) y OBJETOS
//
//• Llena el array con el valor indicado : todos los elementos iguales
// static void fill(T[] array, T valor) { }
//
//
 //• Chequea si los arrays son identicos , comprobando valores primitivos (==) y 
// referencias (con equals)
// static boolean equals(T [] a1 , T [] a2){}
// 
//• Chequea si los arrays son identicos , comprobando valores primitivos (==) y
// referencias (con equals). Ademas , si el array es multidimensional , profundiza
// en las sucesivas dimensiones
// static boolean deepEquals(Object [] a1 , Object [] a2)
// 
//• Genera una cadena para impresion , incluso si se trata de un array multidimensional
// static String deepToString(T [] datos)
// 
//• Genera una copia de los datos , Si 'n' es mayor que datos.length, rellena con null
// Si 'n' es menor que datos.length , se ignora el exceso ( se trunca )
// static T[] copyOf(T [] datos , int n)
//
//• Copia un segmento de los datos 
// static T[] copyOfRange(T [] datos , int desde , int hasta )
// 
//• Busca en que posicion del array datos se encuentra la clave dada , El array debe de estar
// ordenado
// static int binarySearch(T [] datos , T clave)
// 
//• Ordena el array 
// static void sort(T[] datos)
// 
//• Ordena el array entre las posiciones indicadas  
// static void sort(T[] datos , int desde , int hasta) 
 public static void main(String[] args) {

  int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
  int[] a2 = {alea(), alea(), alea(), alea(), alea(), alea(), alea(), alea()};

  String[] st = new String[]{"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
  String[][] st1 = new String[][]{
   {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete"},
   {"uno", "dos", "tres", "cuatro", "cinco"}};

  int[] llenado = new int[10];

  Arrays.fill(llenado, 11);
  for (int i = 0; i < llenado.length; i++) {
   System.out.print(llenado[i] + "|");
  }
  System.out.println("");

  boolean son_iguales = Arrays.equals(a, a2);
  System.out.println("¿ Son iguales los arrays ? " + son_iguales);

  int[][][] a3 = new int[][][]{{
   {alea(), alea(), alea()},
   {alea(), alea(), alea(), alea()},
   {alea(), alea(), alea(), alea(), alea()}}};

  int[][][] a3a = new int[][][]{{
   {alea(), alea(), alea()},
   {alea(), alea(), alea(), alea()},
   {alea(), alea(), alea(), alea(), alea()}}};

  boolean son_iguales2 = Arrays.deepEquals(a3, a3a);
  System.out.println("¿ Son iguales los arrays ? " + son_iguales2);

  String son_iguales3 = Arrays.deepToString(st);
  System.out.println("" + son_iguales3);
  String son_iguales4 = Arrays.deepToString(st1);
  System.out.println("" + son_iguales4);

  int[] copia = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  int[] copia_2 = Arrays.copyOf(copia, 21);

  System.out.println("--------------------------");
  for (int i = 0; i < copia_2.length; i++) {
   System.out.println(copia_2[i]);
  }

  System.out.println("--------------------------");
  int[] copyOfRange = Arrays.copyOfRange(copia, 0, 3);
  for (int i = 0; i < copyOfRange.length; i++) {
   System.out.println(copyOfRange[i]);
  }

  System.out.println("--------------------------");
  int busquedaBinaria = Arrays.binarySearch(copia, 5);
  System.out.println(busquedaBinaria);

  System.out.println("!--------------------------");
  for (int[][] a31 : a3) {
   for (int[] a311 : a31) {
    System.out.println(Arrays.toString(a311));
   }
  }

  Arrays.sort(a3);

  System.out.println("--------------------------");
  for (int i = 0; i < a3.length; i++) {
   for (int j = 0; j < a3[i].length; j++) {
    for (int k = 0; k < a3[i][j].length; k++) {
     System.out.print("|" + a3[i][j][k]);
    }
    System.out.println("");
   }
  }
  System.out.println("--------------------------");
  for (int b = 0; b < a.length; b++) {
   Arrays.sort(a, 0, 4);
   System.out.print("| " + a[b]);
  }
  System.out.println("");

 }
}
