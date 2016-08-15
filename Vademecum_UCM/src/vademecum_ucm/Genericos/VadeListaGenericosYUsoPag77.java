/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Genericos;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeListaGenericosYUsoPag77 {

 //class ArrayList<E> implements List<E>{}
// class interface List<E>
//
// Interface para Clases Genericas
//
// interface Comparator<E>
// interface Enumeration<E>
// interface Collection<E> extends Iterable<E>
// interface List<E> extends Collection<E>
// interface Queue<E> extends Collection<E>
// interface Map<K,V>
// interface Set<E> extends Collection<E>
// interface SortedMap<K, V> extends Map<K, V>
// interface SortedSet<E> extends Set<E>
//
// class ArrayList<E>
// class EnumSet<E>
// class HashMap<K , V>
// class HashSet<E>
// class LinkedList<E>
// class PriorityQueue<E>
// class Stack<E>
// 
}

/**
 * Ejemplo : Crear Objetos que es una asociacion de 2 datos de tipo formales S y
 * T que se usaran para almacenar 2 objetos de cualquier tipo
 *
 * @author Portatil
 * @param <S>
 * @param <T>
 */
class Pareja<S, T> {

 private S primero;
 private T segundo;

 public Pareja() {
  this.primero = null;
  this.segundo = null;
 }

 public Pareja(S primero, T segundo) {
  this.primero = primero;
  this.segundo = segundo;
 }

 public S getPrimero() {
  return primero;
 }

 public T getSegundo() {
  return segundo;
 }

 public void setPrimero(S primero) {
  this.primero = primero;
 }

 public void setSegundo(T segundo) {
  this.segundo = segundo;
 }

 public static void main(String[] args) {
  // Cuando se crean objetos de un tipo generico 
  // Hay que proporcionar tipos concretos que determinen que son realmente los
  // tipos formales de la definicion 
  Pareja<String, String> textos = new Pareja<String, String>("hola", "adios");
  System.out.println(textos.getPrimero());
  System.out.println(textos.getSegundo());

  Pareja<String, Number> tabla = new Pareja<String, Number>("PI", 3.14159265);
  System.out.println(tabla.getPrimero());
  System.out.println(tabla.getSegundo());

 }
}
