/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeCollectionPag160 {

}

/**
 * Una serie de estructuras de datos proporcionadas por la bibliotecas estandar
 * de java
 *
 * @author remoto
 */
class Collection {

}

/**
 * La mas relevante : Lista de cosas , respetando el orden y admitiendo
 * duplicados
 *
 * @author remoto
 */
class Lista {

}

/**
 * Conjunto de cosas , sin Duplicados
 *
 * @author remoto
 */
class Set {

}

/**
 *
 * !!! TODAS LAS CLASES QUE IMPLEMENTAN ESTA INTERFACES PROPORCIONA LOS
 * SIGUIENTES METODOS
 *
 * @author remoto
 */
class Ejecutar {

 public static void main(String[] args) {

  List<String> lista = new ArrayList<>();
  List<String> lista_1 = new ArrayList<>();
  lista.add("1");
  lista.add("2");
  lista.add("3");
  lista.add("4");
  lista.add("5");
  lista.add("6");
  lista_1.addAll(lista);

  boolean contiene = lista_1.contains(lista.get(1));
  System.out.println("• Valor : " + contiene);

  boolean empty = lista_1.isEmpty();
  System.out.println("• Esta vacio : " + empty);

  Iterator<String> iterator = lista_1.iterator();
  while (iterator.hasNext()) {
   String next = iterator.next();
   System.out.print(" ♦ " + next);
  }
  System.out.println("");

  boolean remove = lista_1.remove(lista.get(2));
  if (remove) {
   System.out.println("♦ Borrado : ");
   Iterator<String> iterator1 = lista_1.iterator();
   while (iterator1.hasNext()) {
    String next = iterator1.next();
    System.out.print(" ♦ " + next);
   }
   System.out.println("");
  }

  boolean borrarTodo = lista_1.removeAll(lista);

  System.out.println("Borrar todos los elementos : " + borrarTodo);
  Iterator<String> iterator1 = lista_1.iterator();
  while (iterator1.hasNext()) {
   String next = iterator1.next();
   System.out.print(" ♦ " + next);
  }
  System.out.println("");

  System.out.println("Elementos de la lista : " + lista.size());
  System.out.println("Elementos de la lista : " + lista_1.size());

  System.out.println("------------------------------------------");

  Object[] lista_arrays = lista.toArray();
  for (int i = 0; i < lista_arrays.length; i++) {
   System.out.println("• Array de la lista : " + lista_arrays[i]);
  }

  System.out.println("------------------------------------------");
  System.out.println("Si el tamaño del array “a” es mayor que el número de "
          + "elementos en la colección, los datos\n"
          + "se cargan en las primeras posiciones del array "
          + "y en la primera posición que “sobra” se\n"
          + "mete NULL");
  System.out.println("------------------------------------------");
  Object[] array_cargado = lista_1.toArray(lista_arrays);
  for (int i = 0; i < array_cargado.length; i++) {
   System.out.println("• Array de la lista : " + array_cargado[i]);
  }

  Object[] colección = lista.toArray(new Object[0]);
  Object[] resultado1 = new Object[10];
  Object[] toArray = lista.toArray(colección);

  System.out.println("------------------------");
  for (int i = 0; i < toArray.length; i++) {
   System.out.println("♦- " + toArray[i]);
  }

  System.out.println("------------------------");
  for (int i = 0; i < colección.length; i++) {
   System.out.println("♦- " + colección[i]);
  }

  System.out.println("------------------------");
  for (int i = 0; i < resultado1.length; i++) {
   System.out.println("♦- " + resultado1[i]);
  }

 }
}
