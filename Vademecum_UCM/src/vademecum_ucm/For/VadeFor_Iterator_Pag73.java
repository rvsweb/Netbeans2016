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
public class VadeFor_Iterator_Pag73 {

 public static void main(String[] args) {
  Clase[] array = new Clase[10];

  array[0] = new Clase(0, 0);
  array[1] = new Clase(1, 1);
  array[2] = new Clase(2, 2);
  array[3] = new Clase(3, 3);
  array[4] = new Clase(4, 4);
  array[5] = new Clase(5, 5);
  array[6] = new Clase(6, 6);
  array[7] = new Clase(7, 7);
  array[8] = new Clase(8, 8);
  array[9] = new Clase(9, 9);

//  1º Opcion
  System.out.println("______1º_______");
  for (Clase x : array) {
   Clase.procesa(x);
  }

//  2º Opcion
  System.out.println("______2º_______");
  List<Clase> lista2 = new ArrayList<>();

  lista2.add(array[0]);
  lista2.add(array[1]);
  lista2.add(array[2]);
  lista2.add(array[3]);

  for (Clase xx : lista2) {
   Clase.procesa2(xx);
  }

 }
}

class Clase {

 private int x;
 private int y;

 public Clase() {
  this.x = 0;
  this.y = 0;

 }

 public Clase(int x, int y) {
  this.x = x;
  this.y = y;
 }

 static void procesa(Object obj) {
  if (obj instanceof Object) {
   System.out.println("soy Object");
  }
  if (obj instanceof Clase) {
   System.out.println("soy Clase");
   System.out.println(((Clase) obj).x);
   System.out.println(((Clase) obj).y);
  }
  if ((obj instanceof String) == false) {
   System.out.println("No Soy String ");
  }
 }

 static void procesa2(Object obj) {
  if (obj instanceof Clase) {
   System.out.println("soy Clase 2");
   System.out.println(((Clase) obj).x);
   System.out.println(((Clase) obj).y);
  }
 }

}
