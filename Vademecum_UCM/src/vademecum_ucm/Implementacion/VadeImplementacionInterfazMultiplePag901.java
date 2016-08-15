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
public class VadeImplementacionInterfazMultiplePag901 {

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
interface Funcion1 {

 double y(double x) throws Exception;

}

class Seno1 implements Funcion1 {

 @Override
 public double y(double x) {
  return Math.sin(x);
 }
}

class Coseno1 implements Funcion1 {

 @Override
 public double y(double x) {
  return Math.cos(x);
 }
}

class Tangente1 implements Funcion1 {

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

class Suma1 implements Funcion1 {

 private final Funcion1 f1;
 private final Funcion1 f2;

 public Suma1() {
  this.f1 = null;
  this.f2 = null;
 }

 public Suma1(Funcion1 f1, Funcion1 f2) {
  this.f1 = f1;
  this.f2 = f2;
 }

 @Override
 public double y(double x) throws Exception {
  return f1.y(x) + f2.y(x);
 }
}

interface Trazo {

 double longitud();
}

interface Area {

 double superfice();
}

class Main1 {

 public static void main(String[] args) throws Exception {
  Funcion1 f1 = new Seno1();
  Funcion1 f2 = new Coseno1();
  Funcion1 f3 = new Suma1(f1, f2);
  double ver = f3.y(5);
  System.out.println(ver);
 }
}

class Rectangulo implements Trazo, Area {

 private double base, altura;

 public Rectangulo() {
  this.base = 0;
  this.altura = 0;
 }

 /**
  *
  * @param base
  * @param altura
  */
 public Rectangulo(double base, double altura) {
  this.base = base;
  this.altura = altura;
 }

 /**
  *
  * @return
  */
 @Override
 public double longitud() {
  return 2 * base + 2 * altura;
 }

 /**
  *
  * @return
  */
 @Override
 public double superfice() {
  return base * altura;
 }

}
