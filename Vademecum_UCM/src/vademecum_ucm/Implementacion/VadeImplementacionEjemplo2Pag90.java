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
public class VadeImplementacionEjemplo2Pag90 {

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
interface Funcion {

 double y(double x) throws Exception;

}

class Seno implements Funcion {

 @Override
 public double y(double x) {
  return Math.sin(x);
 }
}

class Coseno implements Funcion {

 @Override
 public double y(double x) {
  return Math.cos(x);
 }
}

class Tangente implements Funcion {

 @Override
 public double y(double x) throws Exception {
  double seno = Math.sin(x);
  double coseno = Math.cos(x);
  if (Math.abs(coseno) < 1e-6) {
   throw new Exception();
  }
  return seno / coseno;
 }

}

class Suma implements Funcion {

 private final Funcion f1;
 private final Funcion f2;

 public Suma() {
  this.f1 = null;
  this.f2 = null;
 }

 public Suma(Funcion f1, Funcion f2) {
  this.f1 = f1;
  this.f2 = f2;
 }

 @Override
 public double y(double x) throws Exception {
  return f1.y(x) + f2.y(x);
 }

}

class Main {

 public static void main(String[] args) throws Exception {
  Funcion f1 = new Seno();
  Funcion f2 = new Coseno();
  Funcion f3 = new Suma(f1, f2);
  double ver = f3.y(3);
  System.out.println(ver);
 }
}
