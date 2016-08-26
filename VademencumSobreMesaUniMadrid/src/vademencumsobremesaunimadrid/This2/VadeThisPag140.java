/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.This2;

/**
 * @see - 140
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeThisPag140 {

}

/**
 * Todos los 'objetos' disponen de un campo que se llama 'this' y contiene una
 * referencia al propio objeto
 *
 * @author remoto
 */
class UsoThis {

}

/**
 *
 *
 * @author remoto
 */
class Punto {

//Uso del 'this' para acceder a campos del objeto
 private double x;
 private double y;

 /**
  *
  * @param x
  * @param y
  */
 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 @Override
 public String toString() {
  return "<" + x + ", " + y + ">";
 }

}

/**
 * Uso del 'this' para acceder a 'Constructores' de 'Objetos'
 *
 * @author remoto
 */
class Elipse {

 private double ancho, alto;

// Constructor basico
 public Elipse(double ancho, double alto) {
  this.ancho = ancho;
  this.alto = alto;
 }

// Construye un circulo
 public Elipse(double diametro) {
  this(diametro, diametro);
 }

// Construye un circulo de diametro 10
 public Elipse() {
  this(10);
 }

}

/**
 * Si no se programa el metodo en un cierto objeto , se heredan el de su
 * superior en la jerarquia de herencia , el definido en la clase Object que
 * imprime el nombre de la clase y el hashCode del objeto en hexadecimal
 *
 * @author remoto
 */
class Object {

 /**
  * Este seria el metodo de la clase Object para obtener el nombre de la clase y
  * el valor hexadecimal
  *
  * @return
  */
 @Override
 public String toString() {
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
 }

}

class Ejemplo {

 public static void main(String[] args) {
  Ejemplo ejemplo = new Ejemplo();
  System.out.println(ejemplo);
 }
}
