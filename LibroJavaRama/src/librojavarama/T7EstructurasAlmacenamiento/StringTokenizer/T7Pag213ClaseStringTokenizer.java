/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.StringTokenizer;

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
public class T7Pag213ClaseStringTokenizer {

 public static void main(String[] args) {

  StringTokenizer str, str1, str2;
  str = new StringTokenizer("1 2 3 4 5 6 7_8");
  System.out.println("La cadena str tiene : " + str.countTokens() + " elementos");
  str1 = new StringTokenizer("Uno Dos Tres Cuatro Cinco Seis_Siete");
  while (str1.hasMoreTokens()) {
   System.out.print(str1.nextToken());
  }
  System.out.println("");

  System.out.println("Cadena a mostrar : UNO|DOS|TRES|CUATRO|CINCO ");
  str2 = new StringTokenizer("UNO|DOS|TRES|CUATRO|CINCO", "|");
  System.out.println("Numero de Elementos : " + str2.countTokens());
  System.out.println("Lista de elementos : UNO|DOS|TRES|CUATRO|CINCO ");
  System.out.print("Elementos modificados : ");
  while (str2.hasMoreTokens()) {
   System.out.print(str2.nextToken());
  }
  System.out.println("");
 }
}
