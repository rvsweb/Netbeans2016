/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_Iterator_Collection_Pag73 {

 public static void main(String[] args) {

  Collection<ClaseD> coleccion = new ArrayList<>();
  ClaseD[] clase_d = new ClaseD[10];

  int x = 0;
  int y = 0;

  for (int i = 0; i < clase_d.length; i++) {
   coleccion.add(clase_d[i] = new ClaseD(i, i = i + 1));
  }

  System.out.println("----------------------------------");

  for (int i = 0; i < clase_d.length; i++) {
   ClaseD.procesa(clase_d[i]);
  }

 }
}

class ClaseD {

 private int x;
 private int y;

 public ClaseD() {
  this.x = 0;
  this.y = 0;

 }

 public ClaseD(int x, int y) {
  this.x = x;
  this.y = y;
 }

 static void procesa(Object obj) {
  if (obj instanceof ClaseD) {
//   System.out.println(((ClaseD) obj).x + " - " + ((ClaseD) obj).y);
   int x = ((ClaseD) obj).x;
   int y = ((ClaseD) obj).y;
   System.out.println(" Valores : -> x = " + x + " | y = " + y);
  }
 }

}
