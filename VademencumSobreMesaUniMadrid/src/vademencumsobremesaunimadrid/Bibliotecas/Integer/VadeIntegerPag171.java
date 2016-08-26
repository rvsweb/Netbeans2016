/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Integer;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIntegerPag171 {

 public static void main(String[] args) {

  System.out.println(Integer.MIN_VALUE);
  System.out.println(Integer.MAX_VALUE);

  Integer i = new Integer(5);
  System.out.println(i);
  Integer si = new Integer("5");
  System.out.println(si);
  Integer.parseInt("6");
  String cadena = Integer.toString(5);
  System.out.println("cadena " + cadena);
  String cadena1 = Integer.toBinaryString(5);
  System.out.println("cadena " + cadena1);
  String cadena2 = Integer.toOctalString(5);
  System.out.println("cadena " + cadena2);
  String cadena3 = Integer.toHexString(5);
  System.out.println("cadena " + cadena3);

 }
}
