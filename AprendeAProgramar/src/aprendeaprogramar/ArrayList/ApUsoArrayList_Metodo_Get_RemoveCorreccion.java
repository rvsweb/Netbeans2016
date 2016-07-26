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
public class ApUsoArrayList_Metodo_Get_RemoveCorreccion {

 public static void main(String[] args) {
  ArrayList<Integer> miListadoAL = new ArrayList<Integer>();
  ArrayList<Integer> tmpAL = new ArrayList<Integer>();

  miListadoAL.add(44);// 0
  miListadoAL.add(76);// 1
  miListadoAL.add(7);// 2
  miListadoAL.add(29);// 3
  miListadoAL.add(17);// 4 

  System.out.println("************************");
  System.out.println("miListadoAl : " + miListadoAL.size());
  System.out.println("************************");

  System.out.println("------- (miListadoAL.get(i - 1)) ------ ");
  for (int i = 1; i < miListadoAL.size(); i++) {
   System.out.print("indice " + i + " - ");
   System.out.println(miListadoAL.get(i - 1));
  }
  System.out.println("• El ultimo valor miListadoAL.add(17) -> 4 : NO SE EJECUTA ");
  System.out.println("------------------------------");

  for (int i = 1; i < miListadoAL.size(); i++) {
   System.out.println("Indice : " + i + " Valor -> " + miListadoAL.get(i));
   if (miListadoAL.get(i - 1) < 10) { // get(i - 1) -> MODIFICA INDICES 
    System.out.println("Detectado un objeto (" + i + ") : " + miListadoAL.get(i - 1) + " -> integer con valor menor de 10 , sera eliminado");
    tmpAL.add(i - 1); // Un valor -1 en el indice : LLEGARIA HASTA 
    System.out.println("Elemento en el ArrayList (" + i + "): " + miListadoAL.get(i - 1));
   }
  }
  System.out.println("************************");
  System.out.println("miListadoAl : " + miListadoAL.size());
  System.out.println("tmpAL : " + tmpAL.size());
  System.out.println("************************");

  for (int i = 0; i < tmpAL.size(); i++) {
   System.out.println("Eliminamos item " + (tmpAL.get(i) + 1)/*INDICA EL INDICE */ + " : " + miListadoAL.get(tmpAL.get(i)));
//   miListadoAL.remove(tmpAL.get(i)); // Le estamos pasadon un objeto Integer y tenemos que pasarle un int para recorrer todo el indice  : LLega hasta 5
   miListadoAL.remove((int) tmpAL.get(i)); // Ahora recorre el indice de forma adecuada : LLega hasta 4 FORMA CORRECTA 
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
