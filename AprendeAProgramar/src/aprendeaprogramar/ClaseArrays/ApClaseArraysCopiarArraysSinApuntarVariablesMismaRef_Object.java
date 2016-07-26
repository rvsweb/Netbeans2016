/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseArrays;

import java.util.Arrays;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApClaseArraysCopiarArraysSinApuntarVariablesMismaRef_Object {

 public static void main(String[] args) {

  int[] miArray = {2, -4, 3, -7};

  for (int i = 0; i < miArray.length; i++) {
   System.out.println("miArray[" + i + "]= " + miArray[i] + ";");
  }
  System.out.println();

  int[] otroArray = {1, 2, 4, 8};
  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray [" + i + "]= " + otroArray[i] + "; ");
  }

  System.out.println("¿ Son el mismo objetivo ? ... " + (miArray == otroArray));
  System.out.println("¿ Tiene el mismo contenido (relacion de igualdad ) ? ... " + Arrays.equals(miArray, otroArray));

  System.out.println("\n \t     -------------------------------");
  System.out.println(" ------------ Asignacion Elemento a Elemento ---------- ");
  System.out.println("   ------------ otroArray[i] = miArray[i]; ---------- ");
  System.out.println("\t     -------------------------------");

  for (int i = 0; i < otroArray.length; i++) {
   otroArray[i] = miArray[i];
  }

  System.out.println("");
  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + "]= " + otroArray[i] + ";");
  }
  System.out.println("");

  System.out.println("¿ Son el mismo objetivo ? ... " + (miArray == otroArray));
  System.out.println("¿ Tiene el mismo contenido (relacion de igualdad ) ? ... " + Arrays.equals(miArray, otroArray));

 }
}
