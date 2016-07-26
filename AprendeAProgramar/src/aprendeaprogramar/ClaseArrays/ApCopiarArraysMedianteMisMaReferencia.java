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
public class ApCopiarArraysMedianteMisMaReferencia {

 public static void main(String[] args) {
  //  Comparar 2 arrays tipo primitivo
  int a[] = {1, 2, 4, 5, 5, 6, 7, 8, 9};
  int b[] = {1, 2, 4, 5, 5, 6, 7, 8, 9};

  boolean son_iguales_tipo_primitivo = Arrays.equals(a, b);
  System.out.println("");
  System.out.println("- Los Valores Son Iguales : " + son_iguales_tipo_primitivo);

  Integer aI[] = {1, 2, 4, 5, 5, 6, 7, 8, 9};
  Integer bI[] = {1, 2, 4, 5, 5, 6, 7, 8, 9};

  boolean son_iguales_tipo_objeto = Arrays.equals(aI, bI);
  System.out.println("");
  System.out.println("- Los valores son Iguales : " + son_iguales_tipo_objeto);
  System.out.println("");

  System.out.println("");
  System.out.println("-----------                    ---------- ");
  System.out.println("----------- TestCompararArrays ---------- ");
  System.out.println("-----------                    ---------- ");
  System.out.println("");

  int[] miArray1 = {2, -4, 3, -7};
  for (int i = 0; i < miArray1.length; i++) {
   System.out.println("miArray1[" + i + "] = " + miArray1[i] + ";");
  }
  System.out.println("");
  int[] otroArray = {2, -4, 3, -7};

  for (int j = 0; j < otroArray.length; j++) {
   System.out.println("otroArray[" + j + "]= " + otroArray[j] + "; ");
  }
  System.out.println("-----------                    ---------- ");
  System.out.println("¿ Son el mismo objeto ? ... " + (miArray1 == otroArray));
  System.out.println("¿ Tienen el mismo contenido (relacion de igualdad)? ..." + Arrays.equals(miArray1, otroArray));
  System.out.println("-----------                    ---------- ");

  otroArray = miArray1; // otroArray pasa a ser el mismo objeto que miArray1
  System.out.println("\t    otroArray = miArray1");
  System.out.println("-----------                    ---------- ");

  for (int j = 0; j < otroArray.length; j++) {
   System.out.println("otroArray[" + j + "]= " + otroArray[j] + "; ");
  }
  System.out.println("");
  System.out.println("¿ Son el mismo objeto ?... (otroArray = miArray1) ->  " + (miArray1 == otroArray));
  System.out.println("¿ Tienen el mismo contenido (relacion de igualdad )? ... " + Arrays.equals(miArray1, otroArray));
  System.out.println("");
 }
}
