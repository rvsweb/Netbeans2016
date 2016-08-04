/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniMadrid.ClaseAbstractas;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ClaseAbstractas_Conceptos_UniMadrid {

 public static void main(String[] args) {

// Supuestamente : No se puede instanciar una clase abstracta 
  Figura fig;
  Triangulo tri;
  Cuadrado cua;

  fig = new Figura() {
   /**
    * Metodo abstracto que al instanciar un objeto esta sobreEscribiendo el
    * metodo de la SuperClase
    *
    * @return
    */
   @Override
   public double area() {
    System.out.println("Redefine los metodos abstractos");
    return 0;
   }

   /**
    * Metodo abstracto que al instanciar un objeto esta sobreEscribiendo el
    * metodo de la SuperClase
    */
   @Override
   public void mostrarNombre() {
    System.out.println("Redefine los metodos abstractos");
   }
  };

  System.out.println(" fig.mostrarNombre(); -> metodo abstracto redefinido en la subclase Main ");
  fig.mostrarNombre();
  System.out.println(" fig.mostrarOrigen(); -> metodo abstracto redefinido en la subclase Main ");
  fig.mostrarOrigen();

  System.out.println("   tri = new Triangulo(4, 3); ");
  tri = new Triangulo(4, 3);
  tri.mostrarOrigen();
  tri.mostrarNombre();

  fig = tri;
  fig.mostrarNombre();
  System.out.println("Area triangulo : " + fig.area());

  System.out.println("  cua = new Cuadrado(5); ");
  cua = new Cuadrado(5);
  fig = cua;
  System.out.println("Area cuadrado : " + fig.area());

 }
}

abstract class Figura {

 int x, y;

 public void mostrarOrigen() {
  System.out.println("x = " + x + " y = " + y);
 }

 public abstract double area();

 public abstract void mostrarNombre();

}

class Triangulo extends Figura {

 protected int base, altura;

 public Triangulo(int ba, int al) {
  base = ba;
  altura = al;
 }

 @Override
 public double area() {
  return (base * altura) / 2;
 }

 @Override
 public void mostrarNombre() {
  System.out.println("Triangulo");
 }

}

class Cuadrado extends Figura {

 protected int lado;

 public Cuadrado(int lado) {
  this.lado = lado;
 }

 @Override
 public double area() {
  return lado * lado;
 }

 @Override
 public void mostrarNombre() {
  System.out.println("Cuadrado");
 }

}
