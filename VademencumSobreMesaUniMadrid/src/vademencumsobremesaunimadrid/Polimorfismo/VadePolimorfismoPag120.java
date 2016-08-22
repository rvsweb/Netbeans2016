/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Polimorfismo;

/**
 * @see - 133
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadePolimorfismoPag120 {

 public static void main(String[] args) {

  Punto p = new Cartesianas(1.0, 1.0);
  Punto q = new Polares(2.0, 2.0);

  p.getModulo(); // Hace referencia al objeto Cartesianas
  System.out.println(p.getModulo());
//  utiliza -> Cartesianas.getModulo()
  q.getAngulo(); // Hace referencia al objeto Polares
//  utiliza -> Polares.getModulo()
  System.out.println(p.getAngulo());

 }
}

/**
 * Una variable se refiere a objetos de diferente clases
 *
 * Comportamiento exacto depende de la clase exacta del objeto referido
 *
 * Tenemos polimorfismo cuando :
 *
 * 1º diferentes clases implementan una misma interface
 *
 * 2º una clases son subclases de otras
 *
 * @author remoto
 */
interface Punto {

 double getx();

 double getY();

 double getModulo();

 double getAngulo();

}

/**
 * Subclase
 *
 * @author remoto
 */
class Cartesianas implements Punto {

 private double x;
 private double y;

 public Cartesianas(double x, double y) {
  this.x = x;
  this.y = y;
 }

 @Override
 public double getx() {
  return x;
 }

 @Override
 public double getY() {
  return y;
 }

 @Override
 public double getModulo() {
  return Math.sqrt(x * x + y * y);
 }

 @Override
 public double getAngulo() {
  return Math.atan2(y, x);
 }

}

/**
 * Subclase
 *
 * @author remoto
 */
class Polares implements Punto {

 private double modulo;
 private double angulo;

 public Polares(double modulo, double angulo) {
  this.modulo = modulo;
  this.angulo = angulo;
 }

 @Override
 public double getx() {
  return modulo * Math.cos(angulo);
 }

 @Override
 public double getY() {
  return modulo * Math.sin(angulo);
 }

 @Override
 public double getModulo() {
  return modulo;
 }

 @Override
 public double getAngulo() {
  return angulo;
 }

}
