/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Constructor;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEjConstructor {

 int i;
 String s;
 boolean b;

 private xEjConstructor(int i, String s) {
  this.i = i;
  this.s = s;
 }

 public xEjConstructor(int i, String s, boolean b) {
  this.i = i;
  this.s = s;
  this.b = b;
 }
}

class ConstructorPrueba {

 public static void main(String[] args) {
  xEjConstructor xp1 = new xEjConstructor(1, "3", true);
  System.out.println(xp1.i);
  System.out.println(xp1.s);
  System.out.println(xp1.b);

 }
}
