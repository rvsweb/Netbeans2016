/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.ImplementacionEstandar.Ejemplo_HashTablePag181;

import java.util.Hashtable;
import java.util.Map;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Uso_HashtableMapPag182 {

}

class Ejemplo_Hashtable {

 public static void main(String[] args) {

  /**
   * Hashtable - Obsoleto
   *
   * Similar - 'HashMap' pero con metodos sincronizados
   *
   * Lo que permite ser usada en metodo concurrentes
   *
   * Es mas lento que un HashMap
   */
  Map<String, Integer> mapa = new Hashtable<>();

  mapa.put("Pepe", 1);
  mapa.put("Pepe1", 2);
  mapa.put("Pepe2", 3);
  mapa.put("Pepe3", 4);
  mapa.put("Pepe4", 5);
  mapa.put("Pepe5", 6);
  mapa.put("Pepe6", 7);
  mapa.put("Pepe7", 8);
  mapa.put("Pepe8", 9);
  mapa.put("Pepe9", 10);
  mapa.put("Pepe10", 11);
  mapa.put("Pepe11", 12);

  int size = mapa.size();
  System.out.println("Tamaño : " + size + " \n");
  for (String clave : mapa.keySet()) {
   System.out.println("Clave : " + clave);
   Integer valor = mapa.get(clave);
   System.out.println("Valor : " + valor);
  }

 }
}
