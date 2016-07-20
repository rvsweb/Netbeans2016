/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.ObjetosStringBuffer;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEjObjetosStringBuffer {

 public static StringBuffer getCadena(char a) {
  StringBuffer n = new StringBuffer().append(a);
  System.out.println(n);
  return n;
 }

 public static StringBuffer getCadena1(char a, final String b) {
  StringBuffer n = new StringBuffer().append(a).append(b);
  System.out.println(n);
  return n;
 }

 public static void main(String[] args) {

  StringBuffer st1 = new StringBuffer("hi");
  StringBuffer st2 = st1.append(" friend");

  StringBuffer st3 = new StringBuffer().append(st2);
  System.out.println(st3.append(" 1 "));

  st3 = getCadena('b');

  StringBuffer cadena1 = getCadena1('z', " Cadena StringBuffer añadida al char ");

 }

}
