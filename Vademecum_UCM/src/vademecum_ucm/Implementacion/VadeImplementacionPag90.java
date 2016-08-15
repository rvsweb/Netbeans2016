/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Implementacion;

/**
 * @see - 90
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeImplementacionPag90 {

}

interface Coordenada {

 double x();

 double y();

 double distancia(Coordenada q);

}

/**
 * Punto - Clase Concreta
 *
 * Los metodos de la clase concreta implementan a sus homonimos en la interface
 * debiendo cumplir las siguientes condiciones
 *
 * Mismos argumentos (numero , clase y orden )
 *
 * Misma clase implica que no vale recurrir a argumentos de tipos que sean
 * superclase o subclases del prometido en la interface
 *
 * Misma clase de resultado ( vale que la implementacion devuelva una subclase )
 *
 * igual o mayor visibilidad "de paquete" < protected < public
 *
 * igual o menos capacidad de lanzar excepciones : el metodo que implementa
 * puede : No lanzar excepciones alguna.
 *
 * Lanzar excepciones que sean subclases de la del metodo implementado
 *
 * Lanzar las mismas excepciones que el metodo implementado
 *
 * De una interface puede derivarse multiples implementaciones
 *
 * @author Portatil
 */
class Punto implements Coordenada {

 private double x, y;

 public Punto() {
  this.x = 0;
  this.y = 0;

 }

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 @Override
 public double x() {
  return x;
 }

 @Override
 public double y() {
  return y;
 }

 @Override
 public double distancia(Coordenada q) {
  double dx = q.x() - x;
  double dy = q.y() - y;
  return Math.sqrt(dx * dx + dy * dy);
 }

}
