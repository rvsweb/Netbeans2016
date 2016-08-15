/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

import java.util.Iterator;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_Clase_Iterador_Pag73 {

 public static void main(String[] args) {

 }
}

class Almacen implements Iterable<Dato> {

 @Override
 public Iterator<Dato> iterator() {
  Iterator it = (Iterator) new Almacen();
  return it;
 }

}

class Dato {

 int d1;
 int d2;

 public Dato() {
  this.d1 = 0;
  this.d2 = 0;

 }

 public Dato(int d1, int d2) {
  this.d1 = d1;
  this.d2 = d2;
 }

 @Override
 public String toString() {
  return " -> d1 " + d1 + " d2 " + d2;
 }

}
