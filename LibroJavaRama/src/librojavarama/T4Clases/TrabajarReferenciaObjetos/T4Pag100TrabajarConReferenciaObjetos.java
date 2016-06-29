/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.TrabajarReferenciaObjetos;

/**
 * @see libro rama
 * @since 29/5/2016
 * @version 1º
 * @author Raul Vela Salas
 */
public class T4Pag100TrabajarConReferenciaObjetos {

 public static void main(String[] args) {

  Rectangulo r1 = new Rectangulo(7, 5);
  Rectangulo r2 = new Rectangulo();
  r2 = r1; // Las 2 referencias apuntan al mismo sitio
  r2.incrementaAlto();
  r2.incrementaAncho();
  System.out.println("");
  System.out.println("Alto : " + r1.getAlto());
  System.out.println("Ancho : " + r1.getAncho());
  System.out.println("");
  System.out.println("Alto : " + r2.getAlto());
  System.out.println("Ancho : " + r2.getAncho());

 }
}

class Rectangulo {

 private int ancho;
 private int alto;

 public Rectangulo() {

 }

 public Rectangulo(int ancho, int alto) {
  this.ancho = ancho;
  this.alto = alto;
 }

 public Rectangulo(int dato) {
  this.ancho = alto = dato;
 }

 public int getAncho() {
  return this.ancho;
 }

 public int getAlto() {
  return this.alto;
 }

 public Rectangulo incrementaAncho() {
  ancho++;
  return this;
 }

 public Rectangulo incrementaAlto() {
  alto++;
  return this;
 }
}
