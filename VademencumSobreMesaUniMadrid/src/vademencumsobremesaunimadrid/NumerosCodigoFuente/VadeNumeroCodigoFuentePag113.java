/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.NumerosCodigoFuente;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeNumeroCodigoFuentePag113 {

 public static void main(String[] args) {

  System.out.println("Notacion decimal : " + 2001);
  System.out.println("2001 a Notacion octal : 03721 -> " + 03721);
  System.out.println("2001 a Notacion hexadecimal : 0x7d1 -> " + 0x7d1);

  String cadena = "5";

  int n = Integer.parseInt(cadena);
  System.out.println(n);
  int n1 = Integer.parseInt(cadena, 8); // base 10 , 8 , 16
  System.out.println(n1);
  int n2 = Integer.parseInt(cadena, 10); // base 10 , 8 , 16
  System.out.println(n2);
  int n3 = Integer.parseInt(cadena, 16); // base 10 , 8 , 16
  System.out.println(n3);

 }
}
