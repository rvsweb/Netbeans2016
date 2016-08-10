/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Campos;

/**
 * @see Pag26
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeConceptoCamposPag26 {

 public static void main(String[] args) {
  System.out.println("Son contenedores (Variables) para los valores de las Clases / Objetos");
  System.out.println("- De Objeto : Cuando cada objeto de una clase tiene su propia copia");
  System.out.println("- Muchos objetos de la misma clase tienen cada uno su conjunto de campos privados");
  System.out.println("• De Clase (\"static\") : Cuando todos los objetos de una clase comparten una copia comun ");

 }
}

class Circulo {

 /**
  * PI campo de la clase
  *
  * Todos los objetos de la clase Circulo comparten el mismo valor de PI
  */
 private static final double PI = 3.14159265;

 /**
  * Campo de objeto
  *
  * Cada objeto de la clase Circulo tendra su propio radio
  */
 private double radio;

 public double area() {
  return PI * radio * radio;
 }

}
