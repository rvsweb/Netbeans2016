/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Factoria;

/**
 * @see 74
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFactoriaPag67 {

}

/**
 * CREAR UN CONSTRUCTOR STATIC
 *
 * @author Portatil
 */
class Punto2D {

// Representacion interna : coordenadas cartesianas
 private double x, y;

 /**
  * Constructor PRIVATE interno : coordenadas cartesianas
  *
  * @param x
  * @param y
  */
 private Punto2D(double x, double y) {
  this.x = x;
  this.y = y;
 }

 /**
  * Fabrica : Coordenadas cartesianas
  *
  * @param x
  * @param y
  * @return Un objeto de tipo Punto2D
  */
 public static Punto2D cartesianas(double x, double y) {
  return new Punto2D(x, y);
 }

 /**
  * Fabrica : Coordenadas polares
  *
  * @param modulo
  * @param angulos
  * @return Un objeto de tipo Punto2D
  */
 public static Punto2D polares(double modulo, double angulos) {
  double x = modulo * Math.cos(angulos);
  double y = modulo * Math.sin(angulos);
  return new Punto2D(x, y);
 }

 public static void main(String[] args) {
  Punto2D cartesianas = cartesianas(3, 3);
  System.out.println("Fabrica Punto2D : " + cartesianas.x);
  System.out.println("Fabrica Punto2D : " + cartesianas.y);

  Punto2D polares = polares(3, 3);
  System.out.println("Fabrica Punto2D : " + polares.x);
  System.out.println("Fabrica Punto2D : " + polares.y);

 }
}
