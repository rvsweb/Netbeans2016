/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.IteratorVsIterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIterableSobreArray {

 public static void main(String[] args) {

  String s1 = "a1";
  String s2 = "b2";
  String s3 = "c3";
  String s4 = "d4";
  String s5 = "e5";

  Object[] ob = new Object[]{s1, s2, s3, s4, s5};
  IteraArray t = new IteraArray(ob);

  while (t.hasNext()) {
   Object next_obj = t.next();
   System.out.println("•- " + next_obj);
  }

  Object[] ob1 = new Object[]{s1, s2, s3, s4, s5};

  IteraArray t2 = new IteraArray(ob1);
  while (t2.hasNext()) {
   Object next_obj2 = t2.next();
   System.out.println("@ " + next_obj2);
  }

  System.out.println("-- Usar el Iterador : Segun el libro -- ");
  IteraArray<String> it = new IteraArray(ob1);
  while (it.hasNext()) {
   System.out.println(it.next());
  }

 }
}

class IteraArray<T> implements Iterator<T> {

 private T[] objetos;
 private int posicion = 0;

 public IteraArray(T[] objetos) {
  this.objetos = (T[]) new Object[objetos.length];
  System.arraycopy(objetos, 0, this.objetos, 0, objetos.length);
  posicion = 0;
 }

 @Override
 public boolean hasNext() {
  return posicion < objetos.length;
 }

 @Override
 public T next() {
  if (posicion < objetos.length) {
   return objetos[posicion++];
  }
  throw new NoSuchElementException();
 }

 @Override
 public void remove() {
  throw new UnsupportedOperationException();
 }

}
