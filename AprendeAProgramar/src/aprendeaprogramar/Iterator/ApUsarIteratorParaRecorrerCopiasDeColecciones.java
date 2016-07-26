/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=633:tipo-iterator-api-java-ejemplo-error-javautilconcurrent-modificationexception-resumen-bucles-cu00667b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsarIteratorParaRecorrerCopiasDeColecciones {

}

class TestUsoIterator {

 public static void main(String[] args) {
  String cadenaBuscar = "Alberto";
  ArrayList<String> listaDeNombres = new ArrayList<>();
  listaDeNombres.add("Juan Perez Sanchez");
  listaDeNombres.add("Jose Alberto Reveron Montes");
  System.out.println("La cadena que buscamos es " + cadenaBuscar);

// Creamos el objeto 'it' de tipo Iterator con String
  Iterator<String> it = listaDeNombres.iterator();
  String tmpAnalizando;
  while (it.hasNext()) { // Utilizamos el metodo hasNext de los objetos tipo Iterator
   tmpAnalizando = it.next(); // Utilizamos el metodo next de los objetos tipo Iterator
   System.out.println("Analizando elemento ... " + tmpAnalizando);
   if (tmpAnalizando.contains(cadenaBuscar)) {
    System.out.println("Cadena encontrada !!! ");
   } else {
    System.out.println("Cadena NO Encontrada !!! ");
   }
  }

 }
}
