/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Herencia2;

/**
 * * Herencia : En la 'subclase' se puede usar metodos de la 'SUBclase' y
 * metodos de la 'SUPERClase' teniendo en cuenta que cuando un metodo de la
 * 'SUPERclase' ha sido redefinido , el acceso directo es a la redefinicion en
 * la 'SUBclase'
 *
 * No obstante , todos los metodos de la 'SUPERClase' son accesibles por medio
 * de 'SUPER'
 *
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeHerencia_Ejemplo2Pag125 {

 public static void main(String[] args) {
  int x = 2;
  int y = 3;
  Punto2D punto_cartesiano = Punto2D.cartesianas(x, y);
  Punto2D coordenadas_polares = Punto2D.polares(90, 90);
  Punto2D desplaza = Punto2D.desplazado(y, x);

  Rectangulo r = new Rectangulo(desplaza, x, y);
  System.out.println("Perimetro Rectangulo : " + r.getPerimetro());

 }
}

class Punto2D {

// Representacion Interna: coordenadas cartesianas
 private double x, y;

 /**
  * Constructor interno: Coordenadas cartesianas
  *
  * @param x
  * @param y
  */
 private Punto2D(double x, double y) {
  this.x = x;
  this.y = y;
 }

 /**
  * Factoria : crea objetos de tipo Punto2D
  *
  * Señala en el plano cartesiano las coordenadas 'x' e 'y' de un punto concreto
  *
  * @param x
  * @param y
  * @return
  */
 public static Punto2D cartesianas(double x, double y) {
  return new Punto2D(x, y);
 }

 /**
  * Factoria : crea objetos de tipo Punto2D
  *
  * Mide el grado inclinacion de los angulos
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
  *
  * @param eje1
  * @param eje2
  * @return
  */
 public static Punto2D desplazado(double eje1, double eje2) {
  double x = eje1;
  double y = eje2;
  return new Punto2D(x, y); // esta invocando a los atributos de clase
 }

 /**
  *
  * @param p2
  * @return
  */
 public double getDistancia(Punto2D p2) {
  return p2.getX() + p2.getY();
 }

 /**
  *
  * @return
  */
 public double getX() {
  return this.x;
 }

 /**
  *
  * @return
  */
 public double getY() {
  return this.y;
 }

}

/**
 *
 * Se Redefinen los metodos por razones de EFICIENCIA ( mas rapidez )
 *
 * @author remoto
 */
class Poligono {

// Creo una variable array final de objetos de tipo Punto2D
 private final Punto2D[] vertices;

 /**
  * Constructor : recibe referencias de objetos de tipo Punto2D
  *
  * Crea los puntos necesarios del 'Poligono' y el numero de lados que tendra
  *
  * @param vertices
  */
 public Poligono(Punto2D... vertices) {
  this.vertices = vertices;
 }

 /**
  * Metodo obtener perimetro
  *
  * -----------Perimetro||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  * -----------◘◘◘◘◘◘◘||||||||||||||||||||||||||||||||||||||||||||||||||||||
  * -Perimetro-◘________◘||Perimetro|||||||||||||||||||||||||||||||||||||||||||
  * -----------◘◘◘◘◘◘◘|||||||||||||||||||||||||||||||||||||||||||||||||||||
  * -----------Perimetro
  *
  * @return
  */
 public double getPerimetro() {
  double p = 0;
//Crea una referencia 'p1' de tipo Punto2D y almacena la longitud del Array de objetos de tipo Punto2D
  Punto2D p1 = vertices[vertices.length - 1];
  for (Punto2D p2 : vertices) { // crea una referencia de tipo Punto2D para recorrer todos los objetos
   p += p1.getDistancia(p2); // en cada referencia recorrida a los objetos de tipo 'p1' , obtiene el valor de la distancia
  }
  return p;
 }
}

class Triangulo extends Poligono {

 /**
  *
  * @param A
  * @param B
  * @param C
  */
 public Triangulo(Punto2D A, Punto2D B, Punto2D C) {
  super(A, B, C);
 }
}

class Cuadrilatero extends Poligono {

 /**
  *
  * @param A
  * @param B
  * @param C
  * @param D
  */
 public Cuadrilatero(Punto2D A, Punto2D B, Punto2D C, Punto2D D) {
  super(A, B, C, D);
 }
}

class Rectangulo extends Cuadrilatero {

 private final double base;
 private final double altura;

 /**
  *
  * @param centro
  * @param base
  * @param altura
  */
 public Rectangulo(Punto2D centro, double base, double altura) {
  super(centro.desplazado(-base / 2, altura / 2),
          centro.desplazado(base / 2, altura / 2),
          centro.desplazado(base / 2, -altura / 2),
          centro.desplazado(-base / 2, -altura / 2));
  this.base = base;
  this.altura = altura;
 }

 /**
  * ---------------Perimetro-------------------------------------------------------------------
  * ----------------◘◘◘◘---------------------------------------------------------------------
  * -----Perimetro--◘___◘-Perimetro------------------------------------------------------------
  * ----------------◘◘◘◘---------------------------------------------------------------------
  * ---------------Perimetro
  *
  * @return
  */
 @Override
 public double getPerimetro() {
  return 2 * base + 2 * altura;
 }
}

/**
 *
 * @author remoto
 */
class Rombo extends Cuadrilatero {

 private final double eje1;
 private final double eje2;

 /**
  *
  * @param centro
  * @param eje1
  * @param eje2
  */
 public Rombo(Punto2D centro, double eje1, double eje2) {
  super(centro.desplazado(0, eje2 / 2),
          centro.desplazado(eje1 / 2, 0),
          centro.desplazado(0, -eje2 / 2),
          centro.desplazado(-eje1 / 2, 0));
  this.eje1 = eje1;
  this.eje2 = eje2;
 }

 /**
  *
  * @return
  */
 @Override
 public double getPerimetro() {
  double sx = eje1 / 2;
  double sy = eje2 / 2;
  return 4 * Math.sqrt(sx * sx + sy * sy);
 }

}
