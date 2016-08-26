/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.IterableSobreArray;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIterableSobreUnArray {

}

class ArrayIterable<T> implements Iterable<T> {

 private final T[] objetos;

 public ArrayIterable(T[] objetos) {
  this.objetos = objetos;
 }

 @Override
 public Iterator<T> iterator() {
  IteraArray<T> iterator = new IteraArray<>(objetos);
  return iterator;
 }

 public static void main(String[] args) {
  String[] datos = {"a", "b", "c"};
  Iterable<String> it = new ArrayIterable<>(datos);
  for (String s : it) {
   System.out.println(s);
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
