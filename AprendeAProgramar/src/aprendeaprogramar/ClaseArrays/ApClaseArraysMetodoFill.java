/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseArrays;

import java.util.Arrays;

/**
 * @see -
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=642:clase-arrays-del-api-java-metodos-equals-comparar-copyof-copiar-fill-rellenar-ejemplos-cu00676b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApClaseArraysMetodoFill {

 /**
  * La clase Arrays tiene un método, denominado fill, sobrecargado, que permite
  * rellenar un array con un determinado valor u objeto. En el caso de arrays de
  * enteros la signatura es:
  *
  * @param args
  */
 public static void main(String[] args) {

  System.out.println("Relleno de Arrays de Enteros con metodo fill ");
  System.out.print("\u001B[33m static void fill (int[ ] a, int val)\n"
          + "\u001B[33m Asigna el valor entero especificado a cada elemento del array de enteros indicado.");

  System.out.println("");

  int[] miArray = new int[10];
  Arrays.fill(miArray, 33);

  for (int temp : miArray) {
   System.out.print(temp + ", ");
  }
  System.out.println("");

  System.out.println(" Especificar Indices De Relleno Pueda Preservar parte del contenido previo del array:");
  int[] miArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,};
  Arrays.fill(miArray2, 5, 10, 1);
  for (int i : miArray2) {
   System.out.println(i);
  }

 }
}
