/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Iterable;

import java.util.Iterator;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeInterfaceIterablePag171 {

}

/**
 * Clases que implementan esta intefaz deben proporcionar un metodo 'iterator()'
 * que devuelve un Iterator sobre los objetos de la clase T
 *
 * @author remoto
 */
class Interface_Iterable {

 public interface Iterable<String> {

  public java.util.Iterator<String> iterator();
 }
}

/**
 * Los objetos de clases que implementan esta interface son susceptibles de
 * usarse directamente en sentencias 'for each' para ir recorriendo los objetos
 * que van devolviendo el iterador
 *
 * @author remoto
 */
class X implements Iterable<String> {

 @Override
 public Iterator<String> iterator() {
  for (String i : this) {
   System.out.println(i);
  }
  return null;
 }

}
