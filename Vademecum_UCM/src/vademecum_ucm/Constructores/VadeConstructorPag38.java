/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Constructores;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeConstructorPag38 {

 public static void main(String[] args) {

  Punto p = new Punto();
  double x = p.getX();
  System.out.println("" + x);
  double y = p.getY();
  System.out.println("" + y);

 }
}

class Punto {

 public Punto() {
  this.x = 1;
  this.y = 1;

 }

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 private double x, y;

 double getX() {
  return x;
 }

 double getY() {
  return y;
 }

}
