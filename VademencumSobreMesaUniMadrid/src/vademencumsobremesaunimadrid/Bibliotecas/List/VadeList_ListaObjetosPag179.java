/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeList_ListaObjetosPag179 {

 public static void main(String[] args) {

  /**
   * Normalmente las listas se utilizan indicando el tipo de objetos que pueden
   * contener
   *
   * Pero tambien se pueden utilizar listas sobre Objetos en general , lo que
   * permite listas Heterogeneas a cambio de ser (tipicamente ) necesario el uso
   * de downcasting en la recuperacion de los elementos
   */
  List lista = new ArrayList();
  lista.add(1);
  lista.add(9);
  lista.add(1, 5);
  lista.add(lista.get(0));
  lista.add(lista.get(1));
  lista.add(lista.get(2));
  lista.add(lista.size());
  for (Iterator it = lista.iterator(); it.hasNext();) {
   int n = (Integer) it.next();
   System.out.println(n + " ");
  }
  System.out.println("");
 }
}
