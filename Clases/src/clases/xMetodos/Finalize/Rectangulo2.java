/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.xMetodos.Finalize;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class Rectangulo2 {

 private int x;
 private int y;
 private static int c = 0;

 public Rectangulo2() {
  this.x = 0;
  this.y = 0;
 }

 public Rectangulo2(int x, int y) {
  this.x = x;
  this.y = y;
 }

 private int getX() {
  return x;
 }

 private int getY() {
  return y;
 }

 protected void finalize() {
  System.out.println("Adios!!" + c++);
 }

 public static void main(String[] args) {
  int c = 0;
  for (int i = 0; i < 20; i++) {
   Rectangulo2 r2 = new Rectangulo2(5, 6);
   System.out.println(c++);
  }
  System.out.println("");
  System.runFinalization();
  System.gc();
 }
}
