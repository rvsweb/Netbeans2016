/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.IteratorSobreIteratorBuscaMultiplo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIteratorSobreIteratorPag176 {

 public static void main(String[] args) {

  Integer i1 = new Integer(1);
  Integer i2 = new Integer(2);
  Integer i3 = new Integer(3);
  Integer i4 = new Integer(4);
  Integer i5 = new Integer(5);
  Integer i6 = new Integer(6);
  Integer i7 = new Integer(7);
  Integer i8 = new Integer(8);

  List<Integer> conjunto1 = new LinkedList<>();
  conjunto1.add(i1);
  conjunto1.add(i2);
  conjunto1.add(i3);
  conjunto1.add(i4);
  conjunto1.add(i5);
  conjunto1.add(i6);
  conjunto1.add(i7);
  conjunto1.add(i8);
//  conjunto1.clear(); // Vacia lista
//  conjunto1.remove(0); // Borra el 2 
//  conjunto1.remove(i2);
//  conjunto1.set(1, i1);
  int tamanio = conjunto1.size();
  System.out.println("• Tamanio : " + tamanio);
  Object[] cadena_array = conjunto1.toArray();

  for (int i = 0; i < cadena_array.length; i++) {
   System.out.print("|" + cadena_array[i] + "|");
  }
  System.out.println("");

  Iterator<Integer> ite2 = conjunto1.iterator();
  FiltraMultiplos f = new FiltraMultiplos(ite2, 2);
  while (f.hasNext()) {
   Integer numeros = f.next();
   System.out.println("Nº multiplos -> " + numeros);
   boolean equals = conjunto1.equals(f);
   System.out.println(equals);
  }

 }
}

class FiltraMultiplos implements Iterator<Integer> {

// Finales necesita inicializarse mediante el constructor
 private final int numero;
 private final Iterator<Integer> entrada;
 private Integer siguiente;
 private boolean hayMas;

 /**
  *
  */
 public FiltraMultiplos() {
  this.entrada = null;
  this.numero = 0;
 }

 /**
  * n -> numero por el que tienen que ser multiplos los que entre en la lista
  *
  * @param entrada
  * @param n
  */
 public FiltraMultiplos(Iterator<Integer> entrada, int n) {
  this.entrada = entrada;
  this.numero = n;
  calculaSiguientePaso();
 }

 /**
  *
  */
 private void calculaSiguientePaso() {
  while (true) {
   hayMas = entrada.hasNext();
   if (!hayMas) { // si tiene no entra , no tiene entra : rompe el flujo de ejecucion
    break;
   }
   siguiente = entrada.next();
   if (siguiente % numero == 0) {
    break;
   }
  }
 }

 /**
  *
  * @return
  */
 @Override
 public boolean hasNext() {
  return hayMas;
 }

 /**
  *
  * @return
  */
 @Override
 public Integer next() {
  if (!hayMas) {
   throw new NoSuchElementException();
  }
  Integer devolver = siguiente;
  calculaSiguientePaso();
  return devolver;
 }

 /**
  *
  */
 @Override
 public void remove() {
  throw new UnsupportedOperationException();
 }

}
