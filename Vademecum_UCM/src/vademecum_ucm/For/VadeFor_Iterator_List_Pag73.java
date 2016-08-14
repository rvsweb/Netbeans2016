/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

import java.util.ArrayList;
import java.util.List;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_Iterator_List_Pag73 {

 public static void main(String[] args) {
  ClaseA[] array_a = new ClaseA[10];

  array_a[0] = new ClaseA(0, 0);
  array_a[1] = new ClaseA(1, 1);
  array_a[2] = new ClaseA(2, 2);
  array_a[3] = new ClaseA(3, 3);
  array_a[4] = new ClaseA(4, 4);
  array_a[5] = new ClaseA(5, 5);
  array_a[6] = new ClaseA(6, 6);
  array_a[7] = new ClaseA(7, 7);
  array_a[8] = new ClaseA(8, 8);
  array_a[9] = new ClaseA(9, 9);

//  2º Opcion
  System.out.println("______2º_______");
  List<ClaseA> lista2 = new ArrayList<>();

  lista2.add(array_a[0]);
  lista2.add(array_a[1]);
  lista2.add(array_a[2]);
  lista2.add(array_a[3]);

  for (ClaseA xx : lista2) {
   ClaseA.procesa2(xx);
  }

 }
}

class ClaseA {

 private int x;
 private int y;

 public ClaseA() {
  this.x = 0;
  this.y = 0;

 }

 public ClaseA(int x, int y) {
  this.x = x;
  this.y = y;
 }

 static void procesa2(Object obj) {
  if (obj instanceof ClaseA) {
   System.out.println("ClaseA");
   System.out.println(((ClaseA) obj).x);
   System.out.println(((ClaseA) obj).y);
  }
 }

}
