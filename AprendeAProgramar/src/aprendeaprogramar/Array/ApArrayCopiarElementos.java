/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Array;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayCopiarElementos {

 public static void main(String[] args) {

  int[] miArray1 = {2, -4, 3, -7};

  for (int i = 0; i < miArray1.length; i++) {
   System.out.println("miArray1[" + i + "]=" + miArray1[i] + ";");
  }
  System.out.println("");

  int[] otroArray = {1, 2, 4, 8};

  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + "]=" + otroArray[i] + "; ");
  }
  System.out.println("");
  System.out.println("¿ Son el mismo objeto ? ... " + (miArray1 == otroArray));
  System.out.println("");
  otroArray = miArray1; // Se copia la referencia de miArray1 a otroArray (otroArray ha perdido su referencia al objeto)
  for (int j = 0; j < otroArray.length; j++) {
   System.out.println("otroArray[" + j + "]= " + otroArray[j] + "; ");
  }
  System.out.println("");
  System.out.println("¿ Son el mismo objeto ? ..." + (miArray1 == otroArray));
  System.out.println("¿ Apunta al mismo objeto : ? ..." + (miArray1 == otroArray));

  System.out.println("---------------------------------------------------------------");
  System.out.println("--------------- COPIADO -----------");
  System.out.println("---------------------------------------------------------------");

  int[] miArray12 = {2, -4, 3, -7};
  for (int i = 0; i < miArray12.length; i++) {
   System.out.println("miArray1[" + i + "]= " + miArray12[i] + "; ");
  }
  System.out.println("");
  int[] otroArray2 = {1, 2, 4, 8};
  for (int i = 0; i < otroArray2.length; i++) {
   System.out.println("otroArray[" + i + "]= " + otroArray2[i] + "; ");
  }
  System.out.println("");
  System.out.println("¿Son el mismo objeto? ... " + (miArray1 == otroArray));
  System.out.println("");

  otroArray2 = miArray12;   //otroArray pasa a ser el mismo objeto que miArray1
  for (int i = 0; i < otroArray2.length; i++) {
   System.out.println("otroArray[" + i + "]= " + otroArray2[i] + "; ");
  }
  System.out.println("");
  System.out.println("¿Son el mismo objeto? ... " + (miArray12 == otroArray2));

 } //Cierre de la clase
}
