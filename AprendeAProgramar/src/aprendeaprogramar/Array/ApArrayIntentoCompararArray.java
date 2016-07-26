/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Array;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=641:copiar-y-comparar-arrays-en-java-conceptos-identidad-e-igualdad-ejercicios-resueltos-ejemplos-cu00675b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayIntentoCompararArray {

 public static void main(String[] args) {

  int[] miArray1 = {2, -4, 3, -7};

  for (int i = 0; i < miArray1.length; i++) {
   System.out.println("miArray1[" + i + "]= " + miArray1[i] + ";");
  }

  System.out.println();

  int[] otroArray = {2, -4, 3, -7};
  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + "]= " + otroArray[i] + "; ");
  }

  System.out.println("");
  System.out.println("¿ Son lo mismo objetos ? ... " + (miArray1 == otroArray));
  System.out.println("¿ Tienen el mismo contenido (relacion de igualdad)? usando equals -> " + miArray1.equals(otroArray));
  System.out.print("\u001B[33m No lo son porque sus variable de referencia apunta a distintos objetos ARRAY ");
  System.out.println("");

  otroArray = miArray1;

  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + "] = " + otroArray[i] + "; ");
  }
  System.out.println("¿ Son los mismo objetos ? ... " + (miArray1 == otroArray));
  System.out.println("¿ Tienen el mismo contenido (relacion de igualdad)? usando equals -> " + miArray1.equals(otroArray));
  System.out.print("\u001B[33m Tienen el mismo contenido porque sus Variable de Referencia apunta al mismo objetos ARRAY");
 }
}
