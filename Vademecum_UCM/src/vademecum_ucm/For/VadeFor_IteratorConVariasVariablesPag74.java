/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_IteratorConVariasVariablesPag74 {

 public static void main(String[] args) {

  int[] datos = {1, 2, 3, 4};
  for (int i = 0; i < datos.length; i++) {
   System.out.println(datos[i]);
  }

  System.out.println("vademecum_ucm.For.VadeFor_IteratorPag74.main()");
  for (int dato : datos) {
   System.out.println(dato + " ");
  }

  System.out.println("--------------------------------------");
  for (int i = 0, j = 10; i < 10 && j > 1; i++, j--) {
   System.out.println(i + " - " + j);
  }

  System.out.println("--------------------------------------");
  for (int i = 1, j = 10; i < 11 || j > 1; i++, j--) {
   System.out.println(" i : " + i + " <-> " + j + "  : j ");
  }

 }
}
