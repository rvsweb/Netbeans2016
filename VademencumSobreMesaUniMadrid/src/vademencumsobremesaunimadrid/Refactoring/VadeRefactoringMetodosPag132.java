/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Refactoring;

/**
 * @see - 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeRefactoringMetodosPag132 {

 public static void main(String[] args) {
  ExtraccionMetodos em = new ExtraccionMetodos();
  double diagonalMayor_una_linea = em.getDiagonalMayor_una_linea(1, 2, 3);
  System.out.println("" + diagonalMayor_una_linea);
  double diagonalMayor_extraccion = em.getDiagonalMayor_extraccion(1, 2, 3);
  System.out.println("" + diagonalMayor_extraccion);
 }
}

/**
 * Extraccion de metodos
 *
 * Consiste en la identificacion de una serie de lineas de codigo que se llevan
 * a un metodo aparte , reemplazando las lineas originales por una llamada al
 * nuevo metodo
 *
 * Es util :
 *
 * 1º Para extraer codigo comun que se repite en varios sitios
 *
 * 2º Para hacer mas legible un programa , dandole un nombre a unas lineas de
 * codigo
 *
 * 3º Para evitar el uso del breakd
 *
 * @author remoto
 */
class ExtraccionMetodos {

 /**
  *
  * Refactoring : Extraccion de metodos
  *
  * Identificacion serie de lineas de codigo que se llevan a un metodo aparte
  * reemplazando lineas originales por una llamada al nuevo metodo
  *
  * @param a
  * @param b
  * @param c
  * @return
  */
 public double getDiagonalMayor_una_linea(double a, double b, double c) {
  return Math.sqrt(Math.sqrt(a * a + b * b) * Math.sqrt(a * a + b * b) + c * c);
 }

 public double getDiagonalMayor_extraccion(double a, double b, double c) {
  return hipotenusa(hipotenusa(a, b), c);
 }

 private double hipotenusa(double x, double y) {
  return Math.sqrt(x * x + y * y);
 }
}
