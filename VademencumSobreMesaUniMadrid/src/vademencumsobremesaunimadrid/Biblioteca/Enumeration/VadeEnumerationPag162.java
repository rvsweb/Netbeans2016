/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Biblioteca.Enumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeEnumerationPag162 {

 public static void main(String[] args) {

  Enumeration<String> num;
  Vector numeros = new Vector();
  numeros.add("1a");
  numeros.add("2s");
  numeros.add("d3");
  numeros.add("4f");
  numeros.add("5g");
  numeros.add("6d");
  numeros.add("7f");

  num = numeros.elements();
  while (num.hasMoreElements()) {
   System.out.println(num.nextElement());
  }
 }
}
