/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeInterfaceIteratorPag173Ej {

 public static void main(String[] args) {

  System.out.println("-- List<String> lista = new ArrayList<>()");
  List<String> lista = new ArrayList<>();
  lista.add("1a");
  lista.add("1d");
  lista.add("1f");
  lista.add("1g");
  lista.add("1b");
  java.util.Iterator<String> ite = lista.iterator();
  while (ite.hasNext()) {
   String elemento = ite.next();
   System.out.println(elemento);
  }

  System.out.println("--  Set<String> conjunto = new HashSet<>(); --");

  Set<String> conjunto = new HashSet<>();
  conjunto.add("3a");
  conjunto.add("3v");
  conjunto.add("3e");
  conjunto.add("3x");
  conjunto.add("33");
  conjunto.add("3r");
  Iterator<String> ite1 = conjunto.iterator();
  while (ite1.hasNext()) {
   String elemento1 = ite1.next();
   System.out.println(elemento1);
  }

  System.out.println("--Array - Pasarlo a Lista e Iterar sobre la lista");
  String[] array = new String[]{"1a", "v1", "d1", "g1", "ge1", "1e", "1gee"};
  List<String> lista_array = Arrays.asList(array);
  Iterator<String> ite_array = lista_array.iterator();
  while (ite_array.hasNext()) {
   String next = ite_array.next();
   System.out.println("Mi lista : " + next);
  }

 }
}
