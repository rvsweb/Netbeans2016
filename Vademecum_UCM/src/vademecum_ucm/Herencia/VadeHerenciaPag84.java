/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Herencia;

/**
 * @see 87
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeHerenciaPag84 {

 public static void main(String[] args) {

  A a = new A();
  B b = new B(1, 2, 3);

  a.verDatos();
  b.verDatos();

  int bb = b.getB();
  int by = b.getY();
  int bx = b.getX();
  System.out.println(bb + by + bx);
 }
}

class A {

 private int x;
 private int y;

 public A() {
  this.x = 0;
  this.y = 0;

 }

 public A(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public int getY() {
  return y;
 }

 public void setX(int x) {
  this.x = x;
 }

 public void setY(int y) {
  this.y = y;
 }

 public void verDatos() {
  System.out.println("Soy Clase A");
 }

 @Override
 public String toString() {
  return " -> y " + y + " -> x " + x;
 }

}

class B extends A {

 private int b;

 public B() {
  this.b = 0;
 }

 public B(int b) {
  this.b = b;
 }

 public B(int b, int x, int y) {
  super(x, y);
  this.b = b;
 }

 public int getB() {
  return b;
 }

 @Override
 public void verDatos() {
  System.out.println("Soy Clase B");
 }

}
