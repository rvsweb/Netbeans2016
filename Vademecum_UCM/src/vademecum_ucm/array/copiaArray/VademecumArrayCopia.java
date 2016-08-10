/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

import java.util.Arrays;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayCopia {

 /**
  * Un array se trata a todos los efectos como un objeto, pasándose referencias
  * entre variables:
  *
  *  Cuando se llama a un método y se le pasa un array, el método hace su copia
  * de la referencia; pero comparte el array
  *
  * @param x
  */
 public void caso1(int[] x) {
  x[0] *= 10;
 }

 /**
  *
  */
 public void test1() {
  int[] a = new int[]{1, 2, 3};
  System.out.println(Arrays.toString(a));
  caso1(a);
  System.out.println(Arrays.toString(a));
 }

 public static void main(String[] args) {

  VademecumArrayCopia v1 = new VademecumArrayCopia();
  v1.test1();

 }
}
