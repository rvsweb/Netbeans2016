/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.ImplementacionEstandar.Ejemplo_HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Uso_HashMapPag182 {

 public static void main(String[] args) {

  /**
   * HashMap : Implementacion muy eficiente en cuanto a uso de memoria
   *
   * Rapida en todas las operaciones ' ARRAY ASOCIATIVO ' de tamaño dinamico
   *
   *
   * No existe ordenacion
   */
  Map<String, String> mapa = new HashMap<String, String>();

  mapa.put("uno", "one");
  mapa.put("dos", "two");
  mapa.put("tres", "three");
  mapa.put("cuatro", "four");
  mapa.put("cinco", "five");
  mapa.put("tres", "33");
  System.out.println("Tamaño del Mapa : " + mapa.size());

  for (String clave : mapa.keySet()) {
   String valor = mapa.get(clave);
   System.out.println("Clave: " + clave + " ->" + " Valor: " + valor);
  }

 }
}
