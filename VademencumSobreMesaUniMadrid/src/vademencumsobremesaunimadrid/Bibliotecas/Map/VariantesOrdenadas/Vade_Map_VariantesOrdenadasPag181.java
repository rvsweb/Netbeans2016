/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.VariantesOrdenadas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_VariantesOrdenadasPag181 {

}

/**
 * Implementaciones que Map<K,V> mantienen las claves ordenadas , cuando se
 * itera sobre el Map , las claves van saliendo en orden
 *
 * Para poder ordenar las claves , necesarios que sean objetos comparablesg
 *
 * @author remoto
 */
class UsoMap_VariantesOrdenadas {

 /**
  * ♦ INTERFACE
  *
  * Variante de Map<K,V> con la propiedad de que "Mantiene las Claves Ordenadas"
  * es decir , cuando se itera sobre el "Map" , las claves estan en orden. Las
  * claves deben ser "Comparable"
  *
  * @param <K>
  * @param <V>
  */
// interface SortedMap<K,V> extends Map<K,V>
 /**
  * • CLASE
  *
  * Es una implementacion que garantiza el orden de las claves cuando se itera
  * sobre ellas , Es mas voluminosa y lenta
  *
  * @param <K>
  * @param <V>
  */
// class TreeMap<K, V> implements SortedMap<K, V> 
}

class Ejemplo_De_Uso {

 public static void main(String[] args) {

  System.out.println("------- HashMap ------------");
  System.out.println("-------• Respeta el orden ----------");
  System.out.println("-------• No acepta repetidos ----------");
  System.out.println("-------♦ Mas eficiente uso memoria ----------");
  System.out.println("-------♦ Rapida operaciones : 'Array Asociativo ' ----------");
//  HashMap 
  Map<String, String> mapa_hash = new HashMap<>();
  mapa_hash.put("uno", "one");
  mapa_hash.put("dos", "two");
  mapa_hash.put("tres", "three");
  mapa_hash.put("cuatro", "four");
  mapa_hash.put("tres", "33");

  for (Object clave : mapa_hash.keySet()) {
   String valor = mapa_hash.get(clave);
   System.out.println(clave + " -> " + valor);
  }

  System.out.println("------- TreeMap ------------");
  System.out.println("-------• No Respeta el orden ----------");
  System.out.println("-------• No acepta repetidos ----------");
  System.out.println("-------♦ Parecido a HashMap pero con Metodo sincronizados ----------");
  System.out.println("-------♦ Mas lento que HashMap ----------");

//  TreeMap
  Map<String, String> mapa_tree = new TreeMap<>();
  mapa_tree.put("uno", "one");
  mapa_tree.put("dos", "two");
  mapa_tree.put("tres", "three");
  mapa_tree.put("cuatro", "four");
  mapa_tree.put("tres", "33");
  System.out.println("• Tamaño : " + mapa_tree.size());

  for (String clave : mapa_tree.keySet()) {
   String valor = mapa_tree.get(clave);
   System.out.println(clave + " -> " + valor);
  }

  System.out.println("-------- LinkedHashMap ----------");
  System.out.println("--------• Respeta el orden ----------");
  System.out.println("--------• No acepta repetidos ----------");
  System.out.println("--------♦ Mas lenta ----------");
  Map<String, String> mapa_linked = new LinkedHashMap<>();
  mapa_linked.put("uno", "one");
  mapa_linked.put("dos", "two");
  mapa_linked.put("tres", "three");
  mapa_linked.put("cuatro", "four");
  mapa_linked.put("tres", "33");

  for (String clave : mapa_linked.keySet()) {
   String valor = mapa_tree.get(clave);
   System.out.println(clave + " -> " + valor);
  }
  System.out.println("--------------------------------");
  System.out.println("• Tamaño : " + mapa_hash.size());
 }
}
