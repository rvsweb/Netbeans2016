/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Super;

/**
 * @see - 137
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSuperConstructorPag137 {

}

class Punto {

 private double x;
 private double y;

 public Punto() {
  x = 0;
  y = 0;
 }

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public void setX(double x) {
  this.x = x;
 }

 public void setY(double y) {
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public double getY() {
  return y;
 }

}

class Poligono {

 private Punto[] vertices;

 public Poligono(Punto... vertices) {
  this.vertices = new Punto[vertices.length];
  for (int i = 0; i < vertices.length; i++) {
   this.vertices[i] = vertices[i];
  }
 }

 public Punto[] getVertices() {
  return vertices;
 }

 public void setVertices(Punto[] vertices) {
  this.vertices = vertices;
 }

}

class Cuadrado extends Poligono {

 /**
  *
  * @param centro
  * @param lado
  */
 public Cuadrado(Punto centro, double lado) {
  super(new Punto(centro.getX() - lado / 2, centro.getY() + lado / 2),
          new Punto((centro.getX() + lado / 2), centro.getY() + lado / 2),
          new Punto((centro.getX() + lado / 2), centro.getY() - lado / 2),
          new Punto((centro.getX() - lado / 2), centro.getY() - lado / 2));
 }

 public static void main(String[] args) {

  Punto p1 = new Punto(3, 3);
  Punto p2 = new Punto(3, 3);
  Punto p3 = new Punto(3, 3);
  Punto p4 = new Punto(3, 3);

  Poligono po1 = new Poligono(p1, p2, p3, p4);

  Punto[] vertices = po1.getVertices();
  for (int i = 0; i < vertices.length; i++) {
   System.out.println(vertices[i].getX() + vertices[i].getY());
  }

  System.out.println("------------------------");
  System.out.println("p1 - x : " + p1.getX());
  System.out.println("p1 - y : " + p1.getY());
  System.out.println("------------------------");

  Cuadrado c1 = new Cuadrado(p1, 3);
  Punto[] vertices1 = c1.getVertices();

  for (int i = 0; i < vertices1.length; i++) {
   System.out.println(vertices1[i].getX() + " - " + vertices1[i].getY());
   System.out.println("------------------------");
  }

 }
}
