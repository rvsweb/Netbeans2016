/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.List;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeJavaListEjemploPag178 {

 public static void main(String[] args) {

  /**
   * List y array son intercambiables , con la principal diferencia de que un
   * "ARRAY" hay que indicar el tamaño al construirlo , mientras que las 'List'
   * se adaptan automaticamente al numero de datos que contiene
   */
  List<Integer> lista = new ArrayList<>();
  lista.add(1);
  lista.add(9);
  lista.add(1, 5);
  System.out.println("Tamanio : " + lista.size());
  System.out.println("obtener posicion 0 - " + lista.get(0));
  System.out.println("obtener posicion 1 - " + lista.get(1));
  System.out.println("obtener posicion 2 - " + lista.get(2));

  System.out.println("");
  for (int n : lista) {
   System.out.println("• Valores : " + n + " ");
  }

  System.out.println("");
  for (Iterator<Integer> it = lista.iterator(); it.hasNext();) {
   Integer n = it.next();
   System.out.println("♦ con Iterador : " + n + " ");
  }
  System.out.println("");
 }
}
