/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeArrayList_List_UsosPag179 {

// Trabaja sobre Object
 public static List asList(Object[] a) {
  return null;
 }

// Trabaja sobre Object
 public Object[] toArray() {
  return null;
 }

 /**
  * Si ya tiene el array creado , desea llenarlo con los elementos de la lista
  *
  * Ventaja : Respeta el tipo de los elementos , lo que combinado con el hecho
  * de que crea el array si no existe o si no tiene espacio para todos los
  * elementos de la lista , permite escribir cosas de este tipo -->
  *
  * @param a
  * @return
  */
 public Object[] toArray(Object[] a) {
  Vector v = new Vector();
  String[] x = (String[]) v.toArray(new String[0]);
  return x;
 }

 public static void main(String[] args) {

//  T[] array = new T[5];
  String[] array = new String[5];
  array[0] = new String("a1");
  array[1] = new String("a2");
  array[2] = "a3";
  array[3] = "a4";
  array[4] = new String("a5");

// • Si necesitas un Array y tiene una LIST
  java.util.List list = Arrays.asList(array);

  for (int ii = 0; ii < list.size(); ii++) {
   Object ver = list.get(ii);
   System.out.println(ver);
  }

  java.util.List<String> list0 = new ArrayList<>();
  list0.add("a1");
  list0.add("a2");
  list0.add("a3");
  list0.add("a4");

// Si tiene una lista y necesita un array
  Object[] nuevo_array = list0.toArray();
  System.out.println("-> " + nuevo_array.length);

 }
}

class T {

 private Object t = null;

 public T() {
  t = new Object();
 }

 public T(Object t) {
  t = new Object();
 }

 public Object getT() {
  return t;
 }

 public void setT(Object t) {
  this.t = t;
 }

}
