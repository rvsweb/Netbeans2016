/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Continue;

import java.util.Scanner;

/**
 * @see - USAR CONTINUE
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoContinuePag38 {

 /**
  * Se emplea para forzar la terminacion de una pasada en un bucle
  *
  * Es util cuando queremos abortar limpiamente una ejecucion del bucle
  *
  * Pero que este siga ejecutandose
  *
  * @param args
  */
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  A a = new A(1);
  B b = new B(2);
  C c1 = new C(3);
  C c2 = new C(4);

  for (int i = 0; i < 1000; i++) {
   if (c1 instanceof C) {
    System.out.println(c1.getC());
   }
   if (c2 instanceof C) {
    System.out.println(c2.getC());
   }

  }

  for (;;) {
   String linea = sc.nextLine();
   if (linea.charAt(0) == 's') { // se ignoran las lineas que empiezan por 's'
    continue;
    // Se hace algo con la linea leida
//    NO SE EJECUTA LAS LINEAS DE ABAJO
   }
  }

 }
}

class A {

 private int a;

 public A() {
  a = 0;
 }

 public A(int a) {
  this.a = a;
 }

 public int getA() {
  return a;
 }

 public void setA(int a) {
  this.a = a;
 }

}

class B {

 private int b;

 public B() {
  b = 0;
 }

 public B(int b) {
  this.b = b;
 }

 public int getB() {
  return b;
 }

 public void setB(int b) {
  this.b = b;
 }

}

class C {

 private int c;

 public C() {
  this.c = 0;
 }

 public C(int c) {
  this.c = c;
 }

 public int getC() {
  return c;
 }

 public void setC(int c) {
  this.c = c;
 }

}
