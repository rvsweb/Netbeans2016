/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Cuerpo;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCuerpoMetodoPag40 {

 public static void main(String[] args) {

 }
}

class Punto {

 private double x, y;

 public Punto() {
  this.x = 0;
  this.y = 0;

 }

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public double getY() {
  return y;
 }

 public void setX(double x) {
  this.x = x;
 }

 public void setY(double y) {
  this.y = y;
 }

 /**
  * Fragmento de codigo fuente que indica que hacer cuando se llama al Metodo
  *
  * @param q
  * @return
  */
 public double distancia(Punto q) {
  double dx = q.getX() - x;
  double dy = q.getY() - y;
  return Math.sqrt(dx * dx + dy * dy);
 }

}
