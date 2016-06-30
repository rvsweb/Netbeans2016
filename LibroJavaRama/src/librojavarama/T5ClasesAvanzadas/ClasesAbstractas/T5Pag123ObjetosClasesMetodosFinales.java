/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.ClasesAbstractas;

/**
 *
 * @author Portatil
 */
public class T5Pag123ObjetosClasesMetodosFinales {

 public static void main(String[] args) {
//   Objeto final : Solo tiene una referencia que no es compartida por otros objetos
  final Cuadrado c1 = new Cuadrado(5);
  Cuadrado c2 = new Cuadrado(15);
  c1.setPerimetro(5);
  System.out.println("Perimetro : " + c1.getPerimetro());

  Triangulo t1 = new Triangulo(3, 8);
  double area = t1.getBase();
  System.out.println("area total del triangulo " + area);
 }
}

class Cuadrado {

 private int valor_perimetro;

 public Cuadrado() {
 }

 public Cuadrado(int v) {
  this.valor_perimetro = v;
 }

 public final void setPerimetro(int arista) {
  this.valor_perimetro = 4 * arista;
 }

 public final int getPerimetro() {
  return this.valor_perimetro;
 }

}

final class Triangulo {

 private double base;
 private double altura;
 private double area;

 Triangulo() {
  base = 0;
  altura = 0;
  area = 0;
 }

 Triangulo(double base, double altura) {
  this.base = base;
  this.altura = altura;
 }

 public double getBase() {
  return this.base;
 }

 public double getAltura() {
  return this.altura;
 }

 public double getArea() {
  return this.area;
 }

 public void setBase(int base) {
  this.base = base;
 }

 public void setAltura(int altura) {
  this.altura = altura;

 }

 public void setArea(int area) {
  this.area = ((this.base * this.altura) / 2);
 }

}
