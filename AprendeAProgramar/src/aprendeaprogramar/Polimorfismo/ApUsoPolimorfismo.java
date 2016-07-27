/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Polimorfismo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoPolimorfismo {

 public static void main(String[] args) {
  ArrayList<List> misListas = new ArrayList<List>();
  ArrayList<Integer> miListaInteger = new ArrayList<Integer>();
  ArrayList<String> miListaString = new ArrayList<String>();
  misListas.add(miListaInteger);
  misListas.add(miListaString);

  for (List i : misListas) {
   System.out.println(i);
  }

  System.out.println("Interface Set de Java es implementada Clases HashSet y TreeSet.");
  ArrayList<Set> misListasSet = new ArrayList<Set>();
  HashSet<String> miobjetoHash = new HashSet<>();
  TreeSet<Integer> miobjetoTree = new TreeSet<>();

  miobjetoHash.add("sol");
  miobjetoHash.add("luna");
  miobjetoHash.add("saturno");

  miobjetoTree.add(2);
  miobjetoTree.add(5);
  miobjetoTree.add(8);

  misListasSet.add(miobjetoHash);
  misListasSet.add(miobjetoTree);

  System.out.println("for (Set i : misListasSet)");
  for (Set i : misListasSet) {
   System.out.println(i);
  }

  System.out.println("");
  System.out.println("Iterator<Set> it = misListasSet.iterator(); ");

  Iterator<Set> it = misListasSet.iterator();
  while (it.hasNext()) {
   System.out.println(it.next());
  }

 }
}
