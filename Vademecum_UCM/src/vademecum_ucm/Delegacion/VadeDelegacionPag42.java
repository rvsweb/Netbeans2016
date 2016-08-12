/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Delegacion;

/**
 * @see - Cuando un metodo de una clase B recurre a metodos de la clase A para
 * lograr sus objetivos
 *
 * La clase B delega en clase A
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeDelegacionPag42 {

 public static void main(String[] args) {

 }
}

class Punto {

 private int x;
 private int y;

 public Punto() {
  this.x = 0;
  this.y = 0;

 }

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public void setX(int x) {
  this.x = x;
 }

 public void setY(int y) {
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public int getY() {
  return y;
 }

 /**
  * METODO 'distancia' delega en el metodo 'sqrt' de la clase 'Math' para
  * calcular la raiz cuadrada y en los metodo getX() y getY() de la clase Punto
  * para acceder a las coordenadas
  *
  * @param p
  * @param q
  * @return
  */
 public double distancia(Punto p, Punto q) {
  double dx = p.getX() - q.getX();
  double dy = p.getY() - q.getY();
  return Math.sqrt(dx * dx + dy * dy);
 }

}
