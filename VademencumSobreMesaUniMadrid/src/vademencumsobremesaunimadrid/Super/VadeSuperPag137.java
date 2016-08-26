/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Super;

/**
 * @see - 159
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSuperPag137 {

}

class A {

}

/**
 * Subclase B extiende a otra Superclase A
 *
 * Los miembros (valores/metodos) No privados de la SuperClase A son accesibles
 * en Subclase B usando el prefijo 'super' incluso si el metodo ha sido
 * redefinido en la Subclase 'B'
 *
 * @author remoto
 */
class B extends A {

}

/**
 * Ejemplo
 *
 * @author remoto
 */
class Punto2D {

 private double x, y;

 /**
  * Metodo Superclase
  *
  * @param coordenadas
  */
 public void set(double[] coordenadas) {
  this.x = coordenadas[0];
  this.y = coordenadas[1];
 }
}

class Punto3D extends Punto2D {

 private double z;

 /**
  * Metodo Subclase - Sobreescribe el metodo principal
  *
  * @param coordenadas
  */
 @Override
 public void set(double[] coordenadas) {
  super.set(coordenadas);
  this.z = coordenadas[2];
 }
}

class Main {

 public static void main(String[] args) {
  double[] coordenadas = new double[]{1.1, 2.2, 3.3};

  Punto2D p2d = new Punto2D();
  p2d.set(coordenadas);

  for (int i = 0; i < coordenadas.length; i++) {
   System.out.print(coordenadas[i] + " | ");
  }
  System.out.println("");

  Punto3D p3d = new Punto3D();
  p3d.set(coordenadas);

  for (int i = 0; i < coordenadas.length; i++) {
   System.out.print(coordenadas[i] + " | ");
  }
  System.out.println("");

 }
}
