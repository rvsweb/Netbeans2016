/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Unicode;

/**
 * @see - 173
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeUnicodePag143 {

 public static void main(String[] args) {

  char char1 = '\u0020';
  char char2 = '\u0021';
  char char3 = '\u0022';
  char char4 = '\u0023';
  char char5 = '\u0024';
  System.out.println("---------------");
  System.out.printf("\nValor char : " + char1);
  System.out.printf("\nValor char : " + char2);
  System.out.printf("\nValor char : " + char3);
  System.out.printf("\nValor char : " + char4);
  System.out.printf("\nValor char : " + char5);
  System.out.println("\n----------");
  String c20 = "\u0020";
  String c21 = "\u0021";
  String c23 = "\u0023";
  String c24 = "\u0024";
  String c26 = "\u0026";
  System.out.println("\n------------");
  System.out.printf("\nValor Unicode : " + c20);
  System.out.printf("\nValor Unicode : " + c21);
  System.out.printf("\nValor Unicode : " + c23);
  System.out.printf("\nValor Unicode : " + c24);
  System.out.printf("\nValor Unicode : " + c26);
  System.out.println("\n----------");
  String c0 = "\u0041";
  String c1 = "\u0042";
  String c2 = "\u0043";
  String c3 = "\u0044";
  String c4 = "\u0045";
  String c5 = "\u0046";
  System.out.println("-----------");
  System.out.printf("\nValor Unicode : " + c0);
  System.out.printf("\nValor Unicode : " + c1);
  System.out.printf("\nValor Unicode : " + c2);
  System.out.printf("\nValor Unicode : " + c3);
  System.out.printf("\nValor Unicode : " + c4);
  System.out.printf("\nValor Unicode : " + c5);

  System.out.println("\n-- Usar cadenas de String mediante Unicode -- ");
  String nombre = "\u004a\u006f\u0073\u00e8";
  System.out.printf("Nombre en hexadecimal : " + nombre + " \n");

 }
}
