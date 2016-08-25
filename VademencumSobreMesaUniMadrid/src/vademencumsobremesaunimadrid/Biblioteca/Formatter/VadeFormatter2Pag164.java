/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Biblioteca.Formatter;

import java.util.Date;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeFormatter2Pag164 {

}

class Formateo2 {

 public static void main(String[] args) {

  String s1 = "cadena normal";
  String f1 = String.format("[%s]", s1);
  System.out.println("cadena : " + f1);

  String s2 = "cadena normal";
  String f2 = String.format("[%10s]", s2);
  System.out.println("cadena : " + f2);

  String s3 = "cadena normal";
  String f3 = String.format("[%.10s]", s3);
  System.out.println("cadena : " + f3);

  String s4 = "cadena normal";
  String f4 = String.format("[%-10s]", "corta");
  System.out.println("cadena : " + f4);

  String s5 = "cadena normal";
  String f5 = String.format("[%10.3s]", "corta");
  System.out.println("cadena : " + f5);

  String s6 = "cadena normal";
  String f6 = String.format("[%-10.3s]", "corta");
  System.out.println("cadena : " + f6);

  String format = String.format("[%%%ds]%%n", 10);
  String f7 = String.format(format, "corta");
  System.out.println("cadena : " + f7);
 }
}
