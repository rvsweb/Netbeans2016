/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.ImplementacionEstandar.Ejemplo_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Uso_LinkedHashMapPag182 {

}

class Ejemplo_LinkedHashMap {

 public static void main(String[] args) {

  /**
   * Implementacion basada en "listas encadenadas".
   *
   * Respeta el orden de insercion , a cambio de ser mas lento
   */
  Map<String, Integer> mapa = new LinkedHashMap<>();

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
  mapa.put("tres", 32);

  int size = mapa.size();
  System.out.println("Tamaño : " + size + " \n");
  for (String clave : mapa.keySet()) {
   System.out.println("Clave : " + clave);
   Integer valor = mapa.get(clave);
   System.out.println("Valor : -> " + valor);
  }

  System.out.println("----------------------");

  Map<String, String> mapa1 = new LinkedHashMap<>();

  mapa1.put("uno", "one");
  mapa1.put("dos", "two");
  mapa1.put("tres", "three");
  mapa1.put("cuatro", "four");
  mapa1.put("tres", "33");

  System.out.println("Tamaño : " + mapa1.size());
  for (String clave : mapa1.keySet()) {
   String valor = mapa1.get(clave);
   System.out.println(clave + " -> " + valor);
  }

 }
}
