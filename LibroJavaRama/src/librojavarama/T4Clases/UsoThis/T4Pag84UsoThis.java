/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoThis;

/**
 *
 * @author Portatil
 */
public class T4Pag84UsoThis {

 public static void main(String[] args) {

  Rectangulo r = new Rectangulo(1, 2);
  r.incrementarAncho();
  r.incrementarAlto();
  int ver = r.getter_ancho();
  int ver2 = r.getter_alto();
  System.out.println("alto : " + ver);
  System.out.println("ancho : " + ver2);
  int total = ver + ver2;
  System.out.println("Total : " + total);

 }
}

class Rectangulo {

 private int ancho = 0;
 private int alto = 0;

 public Rectangulo(int alto, int ancho) {
  this.alto = alto;
  this.ancho = ancho;
 }

 public int getter_ancho() {
  return this.ancho;
 }

 public int getter_alto() {
  return this.alto;
 }

 /**
  * Hace referencia a un objeto de la clase Rectangulo
  *
  * @return regresa un objeto del tipo Rectangulo
  */
 public Rectangulo incrementarAncho() {
  this.ancho++;
  return this;
 }

 /**
  * Hace referencia a un objeto de la clase Rectangulo
  *
  * @return regresa un objeto del tipo Rectangulo
  */
 public Rectangulo incrementarAlto() {
  alto++;
  return this;
 }

}
