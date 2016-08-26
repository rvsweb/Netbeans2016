/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map;

import java.util.Collection;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Pag180 {

}

/**
 * Dentro de las colecciones de datos que java proporciona en su biblioteca
 * basica , esta interfaz recoge una estructura de datos que permite almacenar
 * asociaciones { clave , valor } de forma que dada una clave podemos localizar
 * inmediatamente el valor asociado.
 *
 * Se denominan diccionarios o incluso 'Arrays Asociativos'
 *
 * Propiedades :
 *
 * • 'Key' - las claves , de tipo K , no pueden estar duplicadas
 *
 * • 'Values' - valores de tipo V , pueden ser cualquiera
 *
 * • Tamaño del mapa se adapta dinamicamente a lo que haga falta
 *
 * El resultado es una especie de 'array' de tamaño adaptable que , en vez de
 * indexarse por posicion , se indexa por medio de una clave
 *
 * @author remoto
 */
class Interface_Map {

 /**
  * Elimina todas las claves , valores
  */
 void clear() {
 }

 /**
  * Devuelve 'true' si alguna clave es 'equals' a la indicada
  *
  * @param clave
  * @return
  */
 boolean containsKey(Object clave) {
  return false;
 }

 /**
  * Devuelve 'true' si algun valor es 'equals' al indicado
  *
  * @param valor
  * @return
  */
 boolean containsValue(Object valor) {
  return false;
 }

 /**
  * Devuelve true si algun valro es 'equals' al indicado
  *
  * @param x
  * @return
  */
 @Override
 public boolean equals(Object x) {
  return false;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  return hash;
 }

 /**
  * Devuelve el valor asociado a la clave indicada
  *
  * V -> value
  *
  * @param clave
  * @return
  */
// V get(Object clave){
// }
// 
 /**
  * Devuelve 'true' si no hay claves ni valores
  *
  * @return
  */
 boolean isEmpty() {
  return false;
 }

 /**
  * Devuelve el conjunto de claves - K -> Key
  *
  * @return
  */
// Set<K> keySet() {
//return K;
// }
// 
// Asocia el valor a la clave 
// Devuelve el valor que estaba asociado anteriormente , 
// o NULL si no habia nada para esa clave 
// V = value
// 
// V put ( K clave , V valor){
// 
// Elimina la clave y el valor asociado:
// Devuelve el valor que estaba asociado anteriormente , 
// NULL si no habia nada para esa clave
// V - value 
// 
// V remove (Object clave)
 /**
  * Numero de asociaciones { clave , valor }
  *
  * @return
  */
 int size() {
  return 0;
 }

 /**
  * Devuelve una estructura de datos iterable sobre los valores asociados
  *
  * @return
  */
// Collection<V> values() {
// }
}
