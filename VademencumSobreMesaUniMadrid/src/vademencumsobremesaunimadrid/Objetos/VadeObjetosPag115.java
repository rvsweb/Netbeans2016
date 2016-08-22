/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Objetos;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeObjetosPag115 {

 public static void main(String[] args) {

  Punto p = new Punto(3, 4);
  Punto2D q = Punto2D.polares(1.0, 3.14159265);
  System.out.println(q.getX() + "\n" + q.getY());
 }
}

/**
 * Diferentes materializaciones de una clase
 *
 * A partir de una clase se crean objetos usando sentencias 'new' bien
 * directamente , bien indirectamente por medio de Fabricas
 *
 * 'new' invoca el 'constructor' de la clase que inicializa las variables de un
 * objeto y a la vez almacena en la variable de referencia , la posicion en la
 * memoria donde esta ubicado el objeto con los datos
 *
 * @author remoto
 */
class Objectos {

}

class Punto {

 private double x;
 private double y;

 public Punto() {
  this.x = 0;
  this.y = 0;
 }

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public double getY() {
  return y;
 }

}

class Punto2D {

 private double x;
 private double y;

 public Punto2D() {
  this.x = 0;
  this.y = 0;
 }

 /**
  * Fabrica
  *
  * Metodos 'static' que crean objetos
  *
  * Diferencia metodos 'Constructores'
  *
  * 1- Pueden tener cualquier nombre
  *
  * 2- Pueden existir con mismo num argumentos y tipo , cambia el nombre
  *
  * 3- Pueden no crear ningun objeto ( devuelve null )
  *
  *
  * @param modulo
  * @param angulo
  * @return
  */
 public static Punto2D polares(double modulo, double angulo) {
  double x = modulo * Math.cos(angulo);
  double y = modulo * Math.sin(angulo);
  return new Punto2D(x, y);
 }

 /**
  * Factoria 'static' crea objetos
  *
  * @param x
  * @param y
  * @return
  */
 public static Punto2D cartesianas(double x, double y) {
  return new Punto2D(x, y);
 }

 /**
  * Constructor
  *
  * @param x
  * @param y
  */
 public Punto2D(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public double getY() {
  return y;
 }
}
