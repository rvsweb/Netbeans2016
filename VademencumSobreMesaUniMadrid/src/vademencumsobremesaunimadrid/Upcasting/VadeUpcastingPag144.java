/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Upcasting;

/**
 * @see - 174
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeUpcastingPag144 {

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

 public int getB() {
  B b = new B(5);
  return b.getBB();
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

 public B(int x, int y) {
  super(x, y);
 }

 public B(int b, int x, int y) {
  super(x, y);
  this.b = b;
 }

 public int getBB() {
  return this.b;
 }

 public static void main(String[] args) {

  B b = new B(3);
  A a = b;
  System.out.println(a.getX());
  System.out.println(a.getY());
  System.out.println(a.getB());
 }
}
