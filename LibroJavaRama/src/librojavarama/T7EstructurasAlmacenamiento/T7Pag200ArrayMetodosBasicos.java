/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento;

import java.util.Arrays;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag200ArrayMetodosBasicos {

 public static void main(String[] args) {
  Metodos.comparar_arrays();

  byte a[] = {1, 2, 3};
  byte b[] = {1, 2, 3, 4};

  byte bb[] = a;

  byte c[] = (byte[]) a.clone();

  System.out.println("Son iguales ? ");
  Metodos.comparar_ref_array(a, bb);
  System.out.println("Son iguales ? ");
  Metodos.comparar_ref_array(a, c);
  System.out.println("♦ Son iguales ? No , porque No contienen el mismo numero de elementos ");
  Metodos.comparar_ref_metodo_Array(a, b);
  System.out.println("♦ Son iguales ? Si , porque contiene el mismo numero de elementos ");
  Metodos.comparar_ref_metodo_Array(a, c);

 }
}

class Metodos {

 public static void comparar_ref_array(byte[] primer, byte[] segundo) {
  if (primer.equals(segundo)) {
   System.out.println("Los objetos Arrays REFERENCIAN la misma direccion de memoria");
  } else {
   System.out.println("Los objetos Arrays NO REFERENCIAN la misma direccion de memoria");
  }
 }

 public static void comparar_ref_metodo_Array(byte[] primer, byte[] segundo) {
  if (Arrays.equals(primer, segundo)) { // se tiene en cuenta la cantidad de elementos NO REFERENCIAS
   System.out.println("Los objetos Arrays REFERENCIAN la misma direccion de memoria");
  } else {
   System.out.println("Los objetos Arrays NO REFERENCIAN la misma direccion de memoria");
  }
 }

 public static void comparar_arrays() {
  byte[] temperatura1 = {10, 11, 12, 11, 10, 8, 9, 12, 11, 12, 13};
  byte[] temperatura2 = (byte[]) temperatura1.clone();
  byte[] temperatura3 = temperatura1;

  if (temperatura1.equals(temperatura2)) {
   System.out.println("temperatura1 == temperatura2");
  } else {
   System.out.println("temperatura1 != temperatura2");
  }

  if (temperatura1.equals(temperatura3)) {
   System.out.println("temperatura1 == temperatura3");
  } else {
   System.out.println("temperatura1 != temperatura3");
  }
 }

}
