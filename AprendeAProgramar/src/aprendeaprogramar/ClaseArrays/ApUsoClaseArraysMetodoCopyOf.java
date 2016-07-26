/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseArrays;

import java.util.Arrays;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=642:clase-arrays-del-api-java-metodos-equals-comparar-copyof-copiar-fill-rellenar-ejemplos-cu00676b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoClaseArraysMetodoCopyOf {

 /**
  * El método copyOf de la clase Arrays nos permite:
  *
  * a) Copiar un array manteniendo el número de elementos.
  *
  * b) Copiar un array agrandando el número de elementos que tiene, quedando los
  * nuevos elementos rellenos con valores cero o nulos.
  *
  * c) Copiar un array empequeñeciendo el número de elementos que tiene; los
  * elementos que no caben en el nuevo array, dado que tiene menor capacidad, se
  * pierden (el array queda truncado).
  *
  * static int[ ] copyOf (int[ ] original, int newLength)
  *
  * Copia el array especificado, truncando o rellenando con ceros (si fuera
  * necesario) de manera que la copia tenga el tamaño especificado.
  *
  * Arrays.copyOf (nombreDelArray, n) siendo n un entero que define la nueva
  * longitud del array
  *
  * @param args
  */
 public static void main(String[] args) {

  int[] miArray1 = {2, -4, 3, -7};
  for (int i = 0; i < miArray1.length; i++) {
   System.out.println("miArray1[" + i + "] = " + miArray1 + ";");
  }

  System.out.println("");

  int[] otroArray = {1, 2, 4, 8};
  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + " ] = " + otroArray[i] + " ;");
  }
  System.out.println("¿ Son el mismo objeto ? ... (miArray1 == otroArray) -> " + (miArray1 == otroArray));
  System.out.println("¿ Tiene el mismo contenido (relacion de igualdad) ? ... " + Arrays.equals(miArray1, otroArray));

  System.out.println("");
  System.out.println("Copiamos el array utilizando el metodo 'copyOf' de la clase Arrays");
  otroArray = Arrays.copyOf(miArray1, miArray1.length);
  System.out.println("");

  for (int i = 0; i < otroArray.length; i++) {
   System.out.println("otroArray[" + i + "]= " + otroArray[i] + "; ");
  }

  System.out.println("¿Son el mismo objeto ? ... " + (miArray1 == otroArray));
  System.out.println("¿ Tiene el mismo contenido (relacion de igualdad) ? ... " + Arrays.equals(miArray1, otroArray));

  System.out.println("");
  System.out.println("---------------------------");
  System.out.println("");

  int[] base = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  int[] nuevo_array = Arrays.copyOf(base, 15);
  System.out.println("Copiar el array -> " + base.length);

  for (int i = 0; i < nuevo_array.length; i++) {
   if (nuevo_array[i] == 0) {
    System.out.println("Valores de relleno de la copia -> " + nuevo_array[i]);
   }
   System.out.println("Valores : " + nuevo_array[i]);
  }

  System.out.println("");
  System.out.println("---------------------------");
  System.out.println("");

  int[] base1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  int[] nuevo_array1 = Arrays.copyOf(base1, base1.length);
  System.out.println("Copiar el array -> " + base1.length);

  for (int i = 0; i < nuevo_array1.length; i++) {
   System.out.println("Valores : " + nuevo_array1[i]);
  }

  System.out.println("");
  System.out.println("Copiamos el array utilizando el metodo 'copyOf' de la clase Arrays");
  int[] otroArray2 = Arrays.copyOf(miArray1, miArray1.length + 2);
  int[] otroArray3 = Arrays.copyOf(miArray1, miArray1.length - 2);

  System.out.println(" miArray1.length + 2");
  for (int i = 0; i < otroArray2.length; i++) {
   System.out.println("Valores : " + otroArray2[i]);
  }

  System.out.println(" miArray1.length - 2");
  for (int i = 0; i < otroArray3.length; i++) {
   System.out.println("Valores : " + otroArray3[i]);
  }

 }
}
