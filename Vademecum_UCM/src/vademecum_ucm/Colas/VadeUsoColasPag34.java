/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Colas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @see - Los nuevos objetos se van añadiendo por el final , mientras van
 * saliendo por el principio , EL 1º QUE ENTRA ES EL PRIMERO QUE SALE
 *
 * - FIFO - First In First Out
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoColasPag34 {

 public static void main(String[] args) {

  ColaLista cola = new ColaLista();
  System.out.println("○ longitud : " + cola.longitud());

  String[] cadena0 = new String[]{"a"};
  String[] cadena1 = new String[]{"a", "b"};
  String[] cadena2 = new String[]{"a", "b", "c"};
  String[] cadena3 = new String[]{"a", "b", "c", "d"};
  String[] cadena4 = new String[]{"a", "b", "c", "d", "e"};

  cola.mete(cadena0);
  cola.mete(cadena1);
  cola.mete(cadena2);
  cola.mete(cadena3);
  cola.mete(cadena4);

  Integer i00 = new Integer(0);
  Integer i01 = new Integer(01);
  Integer i02 = new Integer(02);
  Integer i03 = new Integer(03);
  Integer i04 = new Integer(04);
  Integer i05 = new Integer(05);

  cola.mete(i00);
  cola.mete(i01);
  cola.mete(i02);
  cola.mete(i03);
  cola.mete(i04);
  cola.mete(i05);

  System.out.println("• 1º Elemento : " + cola.miraPrimero());
  System.out.println("• Longitud : " + cola.longitud());

  for (int i = 0; i < cola.longitud(); i++) {
   System.out.println(" --> " + cola.obtenerElemento());
  }

  /**
   * ERROR Iterator<ColaLista> it1 = cola.iterator(); while (it1.hasNext()) {
   * ColaLista cl1 = it1.next(); System.out.println("" + cl1.toString()); }
   */
 }

}

// Colas ( Listas FIFO )
interface Cola<T> {

// Mete un objeto T al final de la cola
 void mete(T t);

// Mira SIN Retirar el 1º objeto
 T miraPrimero();

// Retira el 1º objeto de la cola
 T sacaPrimero();

// OBJETO en la COLA
 int longitud();

 T obtenerElemento();

}

// Colas implementada con una LISTA
class ColaLista<T> implements Cola<T>, Iterable<ColaLista> {

// Creamos una referencia de tipo List que apunta a una clase de Tipo ArrayList
 private List<T> lista = new ArrayList<>();

 /**
  *
  * @param t
  */
 @Override
 public void mete(T t) {
  lista.add(t);
 }

 /**
  *
  * @return
  */
 @Override
 public T miraPrimero() {
  if (lista.size() == 0) {
  }
  return lista.get(0);
 }

 /**
  *
  * @return
  */
 @Override
 public T sacaPrimero() {
  if (lista.size() == 0) {
  }
  return lista.remove(0);
 }

 /**
  *
  * @return
  */
 @Override
 public int longitud() {
  return lista.size();
 }

 @Override
 public T obtenerElemento() {
  for (int i = 0; i < lista.size(); i++) {
   lista.get(i);
  }
  return (T) lista;
 }

 @Override
 public Iterator<ColaLista> iterator() {
  Iterator it = (Iterator) new ColaLista();
  return it;
 }

}
