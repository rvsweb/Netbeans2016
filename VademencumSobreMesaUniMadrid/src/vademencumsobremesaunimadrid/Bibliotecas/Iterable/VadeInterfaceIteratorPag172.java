/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeInterfaceIteratorPag172 {

}

/**
 * Interfaz normalizada para recorrer ordenadamente los elementos de una
 * coleccion
 *
 * @author remoto
 * @param <E>
 */
//interface Iterator<E> {
/**
 *
 * @return TRUE si la siguiente llamada a next() devolvera un elemento
 */
// public boolean hasNext();
/**
 *
 * @return el siguiente elemento de la coleccion
 * @throws NoSuchElementException si no hay ningun elemento que devolver
 */
// public E next();
/**
 * Elimina de la coleccion el ultimo elemento devuelto por next()
 *
 * @throws UnsupportedOperationException si la operacion no es posible
 * @throws IlegalStateException si no se acaba de llamar a next()
 */
// public void remove();
//}
class BuclesIteradores {

 public static void main(String[] args) {

  List<String> listas = new ArrayList<>();
  listas.add("1a");
  listas.add("1d");
  listas.add("1f");
  listas.add("1e");
  listas.add("1d");

  Iterator<String> ite = (Iterator<String>) listas.iterator();
  for (int i = 0; i < listas.size(); i++) {
   String next = ite.next();
   System.out.println(next);
  }

 }
}
