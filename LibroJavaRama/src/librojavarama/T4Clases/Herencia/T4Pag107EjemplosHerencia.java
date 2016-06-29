/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Herencia;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag107EjemplosHerencia {

 public static void main(String[] args) {

 }
}

class Figura {

 public String color;
 public int x;
 public int y;

 Figura() {
  x = 0;
  y = 0;
 }

 Figura(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public int getX() {
  return this.x;
 }

 public int getY() {
  return this.y;
 }

 public void setX(int x) {
  this.x = x;
 }

 public void setY(int y) {
  this.y = y;
 }

 public void setColor(String s) {
  color = s;
 }

 public String getColor() {
  return color;
 }

 @Override
 public String toString() {
  return "Valor X es : " + this.x + " Valor Y es : " + this.y;

 }

}

class Rectangulo extends Figura {

 private int base;
 private int altura;
 private int area;

 public Rectangulo() {
  this.area = 0;
 }

 public Rectangulo(int base, int altura) {
  this.area = base * altura;
 }

 public Rectangulo(int lado, int x, int y) {
  super(x, y);
  this.base = x;
  this.altura = y;
 }
}

class Circulo extends Figura {

 public int diametro;

}

class Cuadrado extends Figura {

 private int lado;

 public Cuadrado(int l) {
  this.lado = l;
 }

 public int getArea() {
  return lado * lado;
 }
}

class TestFigura {

 public static void main(String[] args) {
  Cuadrado c = new Cuadrado(5);
  c.setColor("Verde");
  System.out.println(c.getColor());
  System.out.println(c.getArea());
 }
}
