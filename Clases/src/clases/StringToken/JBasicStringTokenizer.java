/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.StringToken;

import java.util.StringTokenizer;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class JBasicStringTokenizer {

 public static void main(String[] args) {

  String nombre = "Pepe Anto Pirulero";
  UsoDeSubString_Token.dividirString(nombre);

  System.out.println("................");

  String numero = "6.3\n6.2\n6.4\n6.2";
  UsoDeSubString_Token.dividirCadenaNumeros(numero);

  String cadena = "Pepe1$Pepe2$Pepe3$Pepe4$Anto5";
  UsoDeSubString_Token.dividirStringAsignandoTipo(cadena);
 }
}

class UsoDeSubString_Token {

 public static void dividirString(String nombre) {
  String nomb = nombre;
  StringTokenizer tokens = new StringTokenizer(nomb);
  while (tokens.hasMoreElements()) {
   System.out.println(tokens.nextToken());
  }
 }

 public static void dividirStringAsignandoTipo(String caracter) {
  String car = caracter;
  StringTokenizer tokens = new StringTokenizer(car, "$");
  while (tokens.hasMoreElements()) {
   System.out.println(tokens.nextToken());
  }
 }

 public static void dividirCadenaNumeros(String num) {
  String strDatos = "6.3\n6.2\n6.4\n6.2";
  StringTokenizer tokens = new StringTokenizer(strDatos, "\n"/*Modificador a eliminar*/);
  int nDatos = tokens.countTokens();
  double[] datos = new double[nDatos];
  int i = 0;
  while (tokens.hasMoreElements()) {
   String str = tokens.nextToken();
   datos[i] = Double.valueOf(str).doubleValue();
   System.out.println(datos[i]);
  }
 }

}
