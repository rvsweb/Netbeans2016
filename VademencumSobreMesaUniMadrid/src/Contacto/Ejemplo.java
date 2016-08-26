/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

import java.util.Comparator;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Ejemplo implements Comparator<String> {

 @Override
 public int compare(String o1, String o2) {
  int n1 = o1.length();
  int n2 = o2.length();
  return n1 - n2;
 }

 public static void main(String[] args) {
  String cadena = "valor";
  String cadena1 = "valor1";
  String cadena2 = "valor2";
  String cadena3 = "valor3";

  Ejemplo e = new Ejemplo();
  int comparar = e.compare(cadena, cadena1);
  System.out.println("Comparar : " + comparar);
  int comparar1 = e.compare(cadena1, cadena2);
  System.out.println("Comparar : " + comparar1);
  int comparar2 = e.compare(cadena2, cadena3);
  System.out.println("Comparar : " + comparar2);

 }
}
