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
public abstract class SuperClaseAbstracta {

 public abstract double getX();

 public abstract double getY();

 public abstract String ver();

 public double resultadoTotal(SuperClaseAbstracta x, SuperClaseAbstracta y) {
  return x.getX() + x.getY();
 }

}

class SubClase extends SuperClaseAbstracta {

 private double x;
 private double y;

 public SubClase() {
  this.x = 0;
  this.y = 0;
 }

 public SubClase(double x, double y) {
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
 public String toString() {
  return "Valores : " + " x " + getX() + " y " + getY();
 }

 @Override
 public String ver() {
  return "• Ver  : " + getX() + " - " + getY();
 }

 public String sumar() {
  double sumar = getX() + getY();
  return "La suma es : " + sumar;
 }

}

class Test2 {

 public static void main(String[] args) {
// Que un método sea abstracto tiene otra implicación adicional:
// Que podamos invocar el método abstracto sobre una variable de la superclase que apunta a un objeto de una subclase de modo que el método que se ejecute sea el correspondiente al tipo dinámico de la variable. 
// En cierta manera, podríamos verlo como un método sobreescrito para que Java comprenda que debe buscar dinámicamente el método adecuado según la subclase a la que apunte la variable.
  SuperClaseAbstracta ca2 = new SubClase();
  ca2.resultadoTotal(ca2, ca2);
  ca2.ver();

  SuperClaseAbstracta ca2_2 = new SubClase(1, 2);
  ca2_2.resultadoTotal(ca2_2, ca2_2);
  ca2_2.ver();

  SubClase sc1 = new SubClase(2, 3);
  double x = sc1.getX();
  System.out.println("Valor x : " + x);
  double y = sc1.getY();
  System.out.println("Valor y : " + y);
  String ver = sc1.ver();
  System.out.println("Ver Valor : " + ver);
  String sumar = sc1.sumar();
  System.out.println("Sumar : " + sumar);
 }
}
