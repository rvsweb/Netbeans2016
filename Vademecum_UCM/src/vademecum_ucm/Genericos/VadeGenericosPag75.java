/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Genericos;

import java.util.ArrayList;
import java.util.List;

/**
 * @see - 83
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeGenericosPag75 {

 /**
  * Tipos Genericos : Clases Parametrizadas por uno o mas tipos que deben ser
  * facilitados por el programador cuando quieras usar la clase creando objetos
  */
 /**
  * Metodos Genericos : Metodos en los que los argumentos y/o el resultado
  * incluyen referencias a tipos que no se conoceran hasta que vayamos a usar el
  * metodo
  */
// 
// class ArrayList<E> implements List<E>{}
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
 public static void main(String[] args) {

  System.out.println("- Uso Habitual de Genericos : lista Generica");
  System.out.println("- public interface List<E>");
  System.out.println("- public class ArrayList<E> implements List<E> ");

  /**
   * Motivo para el uso de Genericos : La necesidad de disponer de Colecciones
   * Homogeneas de Objetos ( listas , Conjuntos , etc facilitando en el paquete
   * java.util )
   *
   * <E> -> queda a definir : <E> es un tipo formal En ingles se suele emplear
   * la expresion "type parameter" para referirse a esos parametro formales que
   * no se refieren a valores , sino a tipos de valores
   *
   * <E> -> traduccion : "Parametros de Tipo" -> Mas tecnica -> "Tipo Formal"
   * indicando que cuando se vaya a utilizar la clase hay que proporcionar un
   * 'tipo real'
   */
  System.out.println("- Clase Generica podemos crear objetos de diferentes tipos");
  List<String> lista_string = new ArrayList<>();
  List<Integer> lista_integer = new ArrayList<>();
  List<Punto> lista_punto = new ArrayList<>();

//class ArrayList<E> implements List<E>{}
// class interface List<E>;
 }
}

//class ArrayList<E> implements List<E>{}
// class interface List<E>
class Punto {

}
