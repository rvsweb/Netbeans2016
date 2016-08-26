/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Scanner;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeScannerPag192 {

}

/**
 * Analizador lexico simple - Se construye sobre algun tipo de fuente de
 * caracteres
 *
 * @author remoto
 */
class Uso_Scanner {

 /**
  * Se puede parametrizar Scanner para que utilice cualquier otro tipo de
  * separador de 'Tokens'
  *
  * Ofrece una serie de metodos que , habiendo leido un 'Token' , lo intenta
  * interpretar como algun tipo PRIMITIVO de JAVA
  *
  * int nextInt(); byte nextByte(); short nextShort(); long nextLong()
  *
  * double nextDouble() float nextFloat()
  *
  * boolean nextBoolean()
  *
  * Para analizar valores numericos se emplean los convenios locales de
  * puntuacion
  *
  * Metodos intentan interpretar el 'token' que toca leer , lanzando una
  * excepcion si no puede
  *
  * InputMismatchException -> si el 'token' no responde al tipo deseado
  *
  * NoSuchElementException -> si no quedan mas token
  *
  * String nextLine() - Devuelve lo que queda por leer de la linea actual 
  * 
  * @param args
  */
 public static void main(String[] args) {

//  Scanner sc1 = new Scanner(/*String source*/);
//  Scanner sc2 = new Scanner(/*Readable source*/);
//  Scanner sc3 = new Scanner(/*Reader source*/);
//  Scanner sc4 = new Scanner(/*InputStream source*/);
//  Scanner sc5 = new Scanner(/*File source*/);
//  
  /**
   * Sobre la fuente de caracteres , va seleccionando lexemas ( TOKENS )
   * Separados por espacio en BLANCO
   *
   * Proporciona los resultados por medio de una interface Iterator
   */
  String s = "Martes , 13 de septiembre de 2005 , actualizado a las 16:16 h.";
  Scanner scanner = new Scanner(s);
  for (Iterator it = scanner; it.hasNext();) {
   String token = (String) it.next();
   System.out.print(token);
  }
  System.out.println();
 }
}
