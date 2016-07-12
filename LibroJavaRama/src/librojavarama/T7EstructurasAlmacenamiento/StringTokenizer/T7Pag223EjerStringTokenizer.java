/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @see Clase permite dividir una cadena de caracteres en elementos
 * independientes si estos estan SEPARADOS por los siguientes modificadores
 * ESPACIO " " , RETORNO DE CARRO \r , LINEA \n , AVANCE de PAGINA \f ,
 * TABULADOR \t
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag223EjerStringTokenizer {

}

class Test {

 private static String[] lista;
 final static int POS = 10;

 public static void ordenar(String array[]) {
  String aux = new String();
  for (int i = array.length; i > 0; i--) {
   for (int j = 0; j < i - 1; j++) {
    if (array[j].compareTo(array[j + 1]) > 0) {
     aux = array[j + 1];
     array[j + 1] = array[j];
     array[j] = aux;
    }
   }
  }
 }

 public static void muestra() {
  for (int i = 0; i < POS; i++) {
   System.out.println(lista[i] + " ");
  }
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  StringTokenizer notas;
  notas = new StringTokenizer("Juan Carlos\n8.5\nAndres\n4.9\n Pedro\n3.8\nJuan\n6.3", "\n");
  while (notas.hasMoreTokens()) { // tiene mas elementos
   System.out.println("El alumno " + notas.nextToken() + " ha sacado un " + notas.nextToken()); // devuelve siguiente elem
  }

  lista = new String[POS];
  for (int i = 0; i < POS; i++) {
   String ln = "a";
   lista[i] = ln;
   muestra(); // muestra los nombres desordenados
   System.out.println("");
   ordenar(lista); // ordena los nombres 
   System.out.println("");
   muestra(); //ahora los muestra ordenados
   System.out.println("");
  }
 }

}
