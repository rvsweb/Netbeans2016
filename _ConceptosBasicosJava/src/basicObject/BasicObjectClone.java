/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicObject;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/clonico/clonico1.htm
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicObjectClone {

 public static void main(String[] args) {

// Crear Rectangulo en Punto 0,0 dimensiones 100,200
  Rectangulo rect1 = new Rectangulo(100, 200);
// Crear Rectangulo Punto 44,70  sin dimensiones
  Punto p = new Punto(44, 70);
  Rectangulo rect2 = new Rectangulo(p);
// Todos en una sola linea
  Rectangulo rect22 = new Rectangulo(new Punto(), 44, 70);
// Modificar las dimensiones
  rect1.desplazar(40, 20);
  System.out.println("Mostrar Area con desplazamiento : " + rect1.area());
// Hallar el area de un rectangulo de 100 unidades de largo y 50 de alto
// Guardar el resultado en la variable entera areaRect
  int areaRect = new Rectangulo(100, 50).area();
  System.out.println("Area total Rectangulo : " + areaRect);
////////////////////////////////////////////////////////////////////
  System.out.println("");
  System.out.println(".- Crear una copia del objeto mediante clone - ");
  Punto punto = new Punto(20, 30);
  Punto pCopia = (Punto) punto.clone(); // Promocion Casting 

  System.out.println("");
  System.out.println(".- Mostar valores de la copia ");
  System.out.println("punto : " + punto);
  System.out.println("pCopia : " + pCopia);

  System.out.println("");
  System.out.println("Comparar objetos ");
  boolean iguales = Objects.equals(punto, pCopia);
  System.out.println("Son iguales las referencias de las variables : " + iguales);

  System.out.println("");
  System.out.println("Comparar objetos asignacion variables de referencias -> pCopia = punto;");
// Ahora las 2 referencias apunta a la misma posicion de memoria 
  pCopia = punto;

  boolean iguales2 = Objects.equals(punto, pCopia);
  System.out.println("Son iguales las referencias de las variables : " + iguales2);

  System.out.println("");
  System.out.println("Clonar objetos de la clase Rectangulo");
  Rectangulo recta1 = new Rectangulo(punto, 100, 200);
  Rectangulo copia_recta = (Rectangulo) recta1.clone();

  System.out.println("Rectangulo : " + recta1);
  System.out.println("Rectangulo copia : " + copia_recta);

  System.out.println("");
  System.out.println("Son iguales ambos objetos -> (recta1, copia_recta) : " + Objects.equals(recta1, copia_recta));

  System.out.println("");
  copia_recta = rect1;
  boolean iguales3 = Objects.equals(copia_recta, rect1);
  System.out.println("Son iguales ambos objetos -> (copia_recta, rect1) : " + iguales3);

 }
}

class Punto implements Cloneable {

 private int x;
 private int y;

 /**
  * Constructor por defecto
  */
 public Punto() {
  int x = 0;
  int y = 0;
 }

 /**
  *
  * @param x1
  * @param y1
  */
 public Punto(int x1, int y1) {
  this.x = x1;
  this.y = y1;
 }

 /**
  *
  * @param dx
  * @param dy
  */
 public void desplazar(int dx, int dy) {
  x += dx;
  y += dy;
 }

 /**
  *
  * @param dx
  * @param dy
  */
 public void trasladar(int dx, int dy) {
  x += dx;
  y += dy;
 }

 /**
  * Redefinir el metodo toString
  *
  * @return
  */
 @Override
 public String toString() {
  String texto = "origen : ( " + x + " " + y + " )";
  return texto;
 }

 /**
  * Redefinicion del metodo clone
  *
  * @return
  */
 @Override
 public Object clone() {
  Object obj = null;
  try {
   obj = super.clone();
  } catch (CloneNotSupportedException cloneEx) {
   Logger.getLogger(Punto.class.getName()).log(Level.SEVERE, null, cloneEx);
   System.out.println("" + cloneEx.getLocalizedMessage() + " - " + cloneEx.getMessage());
  }
  return obj;
 }
}

class Rectangulo implements Cloneable {

// Miembro dato
// Objeto de la clase Punto 
 Punto origen; // Subobjeto de la clase Punto
 private int ancho;
 private int alto;

 /**
  * Constructor por defecto Crea un rectangulo situado punto 0,0
  *
  */
 public Rectangulo() {
  origen = new Punto(0, 0); // Subobjeto de la clase Punto
  ancho = 0;
  alto = 0;
 }

 /**
  * Constructor con parametro Objeto p
  *
  * @param p Es un SubObjeto de la clase Punto
  */
 public Rectangulo(Punto p) {
  this(p, 0, 0);
 }

 /**
  *
  * @param w
  * @param h
  */
 public Rectangulo(int w, int h) {
  this(new Punto(0, 0), w, h); // Subobjeto de la clase Punto
 }

 /**
  *
  * @param p Objeto Punto
  * @param w
  * @param h
  */
 public Rectangulo(Punto p, int w, int h) {
  this.origen = p; // Subobjeto de la clase Punto
  this.ancho = w;
  this.alto = h;
 }

 /**
  *
  * @param dx
  * @param dy
  */
 public void desplazar(int dx, int dy) {
  origen.desplazar(dx, dy);
 }

 /**
  *
  * @param dx
  * @param dy
  */
 public void mover(int dx, int dy) {
// origen -> Subobjeto de la clase Punto
  origen.trasladar(dx, dy);
 }

 /**
  *
  * @return
  */
 public int area() {
  return ancho * alto;
 }

// Duplicación de un objeto compuesto
 @Override
 public Object clone() {
  Rectangulo obj = null;
  try {
   obj = (Rectangulo) super.clone(); // llamada al metodo de la Superclase Object
  } catch (CloneNotSupportedException ex) {
   Logger.getLogger(Rectangulo.class.getName()).log(Level.SEVERE, null, ex);
  }
  obj.origen = (Punto) obj.origen.clone();
  return obj;
 }

 @Override
 public String toString() {
  String texto = origen + " ancho : " + ancho + " alto : " + alto;
  return texto;
 }

}
