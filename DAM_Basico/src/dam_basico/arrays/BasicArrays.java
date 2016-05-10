/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_basico.arrays;

/**
 * @title..:
 * @todo...:
 * @example:
 * @date...:
 * @author TED
 */
public class BasicArrays {

 public static void main(String[] args) {

  System.out.println("Desordenado");
  int[] v = new int[10];
  for (int i = 0; i < v.length; i++) {
   v[i] = (int) (Math.random() * (1 + 100));
   System.out.print(v[i] + " ");
  }
  System.out.println("");

  Vectores.ordenarVector(v);

  System.out.println("Ordenado");

  for (int i = 0; i < v.length; i++) {
   System.out.print(v[i] + " ");
  }

  System.out.println("\n Estas ordenado : " + Vectores.vectorOrdenado(v));
 }

}

class Vectores {

 public static int[] ordenarVector(int[] vector) {
  int menor = 0;
  for (int i = 0; i < vector.length - 1; i++) {
   for (int j = i + 1; j < vector.length; j++) {
    if (vector[j] < vector[i]) {
     menor = vector[i];
     vector[i] = vector[j];
     vector[j] = menor;
    }
   }
  }
  return vector; // devuelve el vector empaquetado
 }

 public static boolean vectorOrdenado(int[] vector) {
  boolean ordenador = true;
  int menor = vector[0];
  for (int i = 1; i < vector.length; i++) {
   if (vector[i] > menor) {
    menor = vector[i];
   } else {
    ordenador = false;
    i = vector.length;
   }
  }
  return ordenador;
 }
}


