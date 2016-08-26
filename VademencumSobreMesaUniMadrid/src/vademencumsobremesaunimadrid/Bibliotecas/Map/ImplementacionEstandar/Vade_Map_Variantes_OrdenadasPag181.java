/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.ImplementacionEstandar;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Variantes_OrdenadasPag181 {

 /**
  * Variantes ordenadas
  *
  * Son aquellas implementaciones de Map <K,V> que mantienen las claves
  * ordenadas , que cuando se itera sobre el Map , las claves van saliendo en
  * orden
  *
  * Para poder ordenar las claves , es necesario que sean de objetos
  * 'comparables'
  *
  */
//// // // // // // // // // // // // // // // // // // // // // // // //  
 /**
  * Variantes de Map <K,V> con la propiedad de que mantiene las claves
  * ordenadas, cuando se itera sobre el 'Map' , las claves estan en orden.
  *
  * Las claves deben de ser 'Comparable'
  *
  * @param <K>
  * @param <V>
  */
 interface SortedMap<K, V> extends Map<K, V> {

 }

}
