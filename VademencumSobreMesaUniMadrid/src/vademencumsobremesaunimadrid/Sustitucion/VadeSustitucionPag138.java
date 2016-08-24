/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Sustitucion;

import java.util.ArrayList;

/**
 * @see - 138
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSustitucionPag138 {

}

/**
 * Sustitucion
 *
 * Capacidad de utilizar un objeto de una 'Subclase' en una variable de una
 * 'SuperClase'
 *
 * @author remoto
 */
class Sustitucion {

}

class Punto {

 private int x;
 private int y;

 public Punto() {
  this.x = 0;
  this.y = 0;
 }

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public int getY() {
  return y;
 }

 public void setX(int x) {
  this.x = x;
 }

 public void setY(int y) {
  this.y = y;
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

}

class Cuadrado extends Poligono {

 public Cuadrado() {
 }

 public Cuadrado(Punto centro, double lado) {
  super(new Punto(centro.getX(), centro.getY()),
          new Punto(centro.getX(), centro.getY()),
          new Punto(centro.getX(), centro.getY()),
          new Punto(centro.getX(), centro.getY()));
 }
}

/**
 * Sustitucion Upcasting
 *
 * @author remoto
 */
class Main {

 public static void main(String[] args) {

// Sustitucion Upcasting
  Poligono poligono = new Cuadrado();

  ArrayList<Poligono> dibujo = new ArrayList<>();
  dibujo.add(new Cuadrado());

 }
}
