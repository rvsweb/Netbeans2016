/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

import java.util.HashSet;
import java.util.Set;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_Iterator_Collection_Pag73 {

 public static void main(String[] args) {
  ClaseC[] array_b = new ClaseC[10];

  int x = 0;
  int y = 0;

  for (int i = 0; i < array_b.length; i++) {
   array_b[i] = new ClaseC(x = x + 1, y = y + 2);
  }

//  SET no Ordena
  Set<ClaseC> lista3 = new HashSet<>();

  lista3.add(array_b[0]);
  lista3.add(array_b[1]);
  lista3.add(array_b[2]);
  lista3.add(array_b[3]);
  lista3.add(array_b[4]);
  lista3.add(array_b[5]);
  lista3.add(array_b[6]);
  lista3.add(array_b[7]);
  lista3.add(array_b[8]);
  lista3.add(array_b[9]);

  for (ClaseC xx : lista3) {
   ClaseC.procesa(xx);
  }

 }
}

class ClaseC {

 private int x;
 private int y;

 public ClaseC() {
  this.x = 0;
  this.y = 0;

 }

 public ClaseC(int x, int y) {
  this.x = x;
  this.y = y;
 }

 static void procesa(Object obj) {
  if (obj instanceof ClaseC) {
   System.out.println("ClaseB");
   System.out.println(((ClaseC) obj).x + " - " + ((ClaseC) obj).y);
  }
 }

}
