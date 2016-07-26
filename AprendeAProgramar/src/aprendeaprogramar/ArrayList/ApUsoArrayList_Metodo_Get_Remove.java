/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=637:metodos-get-y-remove-de-arraylist-java-tipo-requerido-y-devuelto-ejemplo-conversion-de-tipos-cu00671b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoArrayList_Metodo_Get_Remove {

 public static void main(String[] args) {
  ArrayList<Integer> miListadoAL = new ArrayList<Integer>();
  ArrayList<Integer> tmpAL = new ArrayList<Integer>();

  miListadoAL.add(44);
  miListadoAL.add(76);
  miListadoAL.add(7);
  miListadoAL.add(29);
  miListadoAL.add(17);

  System.out.println("************************");
  System.out.println("miListadoAl : " + miListadoAL.size());
  System.out.println("************************");

  for (int i = 1; i < miListadoAL.size(); i++) {
   System.out.println("Indice : " + i + " Valor -> " + miListadoAL.get(i));
   if (miListadoAL.get(i - 1) < 10) { // get(i - 1) -> MODIFICA INDICES 
    System.out.println("Detectado un objeto (" + i + ") : " + miListadoAL.get(i - 1) + " -> integer con valor menor de 10 , sera eliminado");
    tmpAL.add(i - 1);
    System.out.println("Elemento en el ArrayList (" + i + "): " + miListadoAL.get(i - 1));
   }
  }
  System.out.println("************************");
  System.out.println("miListadoAl : " + miListadoAL.size());
  System.out.println("tmpAL : " + tmpAL.size());
  System.out.println("************************");

  for (int i = 0; i < tmpAL.size(); i++) {
   System.out.println("Eliminamos item " + (tmpAL.get(i) + 1)/*INDICA EL INDICE */ + " : " + miListadoAL.get(tmpAL.get(i)));
   miListadoAL.remove(tmpAL.get(i));
  }

  System.out.println("************************");
  System.out.println("Valor devuelto por size() en miListadoAL despues de borrado : " + miListadoAL.size());
  int tmpInt = 0;
  for (Integer tmpObjeto : miListadoAL) {
   System.out.println("Elemento en el ArrayList (" + (tmpInt + 1) + "): " + tmpObjeto);
   tmpInt++;
  }

 }
}
