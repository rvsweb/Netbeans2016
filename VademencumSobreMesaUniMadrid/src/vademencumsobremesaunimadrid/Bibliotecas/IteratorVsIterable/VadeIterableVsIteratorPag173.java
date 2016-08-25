/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.IteratorVsIterable;

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
public class VadeIterableVsIteratorPag173 {
}

/**
 * Cuando una clase implementa la interface Iterable<T> tiene que proporcionar
 * un metodo que devuelva un Iterator
 *
 * @author remoto
 */
class IterableVsIterator implements Iterable<String> {

 @Override
 public Iterator<String> iterator() {
  return null;
 }

 public static void main(String[] args) {
  X x = new X(12);
  X x1 = new X(22);
  X x2 = new X(32);
  X x3 = new X(42);
  X x4 = new X(52);
  X x5 = new X(62);
  Set<X> conjunto = new HashSet<>();
  conjunto.add(x);
  conjunto.add(x1);
  conjunto.add(x2);
  conjunto.add(x3);
  conjunto.add(x4);
  conjunto.add(x5);

  Iterator<X> ite = conjunto.iterator();
  while (ite.hasNext()) {
   X elemento = ite.next();
   System.out.println(" -> " + elemento.getX());
  }

  System.out.println("-- Aniadimos elementos a un Array ---");
  X[] array2 = new X[]{x, x1, x2, x3, x4, x5};

  List<X> lista = Arrays.asList(array2);
  Iterator<X> ite_lista = lista.iterator();
  while (ite_lista.hasNext()) {
   System.out.print("|" + ite_lista.next().getX());
  }
  System.out.println("");

 }
}

/**
 * Clase normal para trabajar
 *
 * @author remoto
 */
class X {

 private int x;

 public X() {
  this.x = 0;
 }

 public X(int x) {
  this.x = x;
 }

 public int getX() {
  return x;
 }

 public void setX(int x) {
  this.x = x;
 }

}
