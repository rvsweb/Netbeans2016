/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.MapaDeObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeMapaObjetosPag183 {

}

/**
 * Mapas se utilizan indicando el tipo de claves y valores que pueden contener
 * Pero tambien se pueden utilizar mapas sobre Objetos en general , lo que
 * permite 'Mapas' Heterogeneos a cambio de ser necesario el uso de
 * 'downcasting' en la recuperacion de los elementos
 *
 * @author remoto
 */
class Ejemplo_Mapas_Objetos {

 public static void main(String[] args) {
  Map mapa = new HashMap();

  mapa.put("uno", "one");
  mapa.put("dos", "two");
  mapa.put("tres", "three");
  mapa.put("cuatro", "four");
  mapa.put("tres", "33");

  System.out.println("Tamaño : " + mapa.size());

  for (Iterator it = mapa.keySet().iterator(); it.hasNext();) {
   String clave = (String) it.next();
   String valor = (String) mapa.get(clave);
   System.out.println(clave + " -> " + valor);
  }
 }
}
