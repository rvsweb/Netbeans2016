/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Abstractas;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public abstract class Punto {

 public abstract double getX();

 public abstract double getY();

 public abstract double getModulo();

 public abstract double getAngulo();

 /**
  * Metodo NO Abstracto
  *
  * @param p
  * @return
  */
 public double distancia(Punto p) {
  double dx = getX() - p.getX();
  double dx2 = dx * dx;

  double dy = getY() + p.getY();
  double dy2 = dy * dy;

  return Math.sqrt(dx2 + dy2);
 }
}

class PuntoCartesianos extends Punto {

 private double x;
 private double y;

 public PuntoCartesianos(double x, double y) {
  this.x = x;
  this.y = y;
 }

 @Override
 public double getX() {
  return x;
 }

 @Override
 public double getY() {
  return y;
 }

 @Override
 public double getModulo() {
  return Math.sqrt(x * y + y * y);
 }

 @Override
 public double getAngulo() {
  return Math.atan2(y, x);
 }

 @Override
 public String toString() {
  return "Cartesianas : " + x + ", " + y;
 }

}

class PuntoPolares extends Punto {

 private double m;
 private double a;

 public PuntoPolares(double m, double a) {
  this.m = a;
  this.a = a;
 }

 @Override
 public double getX() {
  return m * Math.cos(a);
 }

 @Override
 public double getY() {
  return m * Math.cos(a);
 }

 @Override
 public double getModulo() {
  return m;
 }

 @Override
 public double getAngulo() {
  return a;
 }

 @Override
 public String toString() {
  return "Polares: " + m + ", " + a;
 }

}

class Test {

 public static void main(String[] args) {
//SuperTipo     Subtipo
  Punto p = new PuntoCartesianos(1, 1);
  double p_angulo = p.getAngulo();
  System.out.println("• Angulo : " + p_angulo);
  double p_modulo = p.getModulo();
  System.out.println("• Modulo : " + p_modulo);
  double p_distancia = p.distancia(p);
  System.out.println("• Ver distancia : " + p_distancia);

  System.out.println("------------------------------------");

  PuntoCartesianos pc = new PuntoCartesianos(2, 2);
  double c_angulo = pc.getAngulo();
  System.out.println("• Angulo : " + c_angulo);
  double c_modulo = pc.getModulo();
  System.out.println("• Modulo : " + c_modulo);
  double ver_distancia = pc.distancia(pc);
  System.out.println("• Ver distancia : " + ver_distancia);

  System.out.println("------------------------------------");

  Punto pp = new PuntoCartesianos(4, 4);

  PuntoCartesianos pc1 = new PuntoCartesianos(3, 3);
  double c_angulo1 = pc1.getAngulo();
  System.out.println("• Angulo : " + c_angulo1);
  double c_modulo1 = pc1.getModulo();
  System.out.println("• Modulo : " + c_modulo1);
  double ver_distancia1 = pc1.distancia(pp);
  System.out.println("• Ver distancia : " + ver_distancia1);

 }
}
