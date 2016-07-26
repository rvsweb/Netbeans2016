/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicMetodosInvocanDentroDeOtrosMetodosDeInstancia;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicMetodoInvocanDentroOtrosMetodos {
}

class Persona {

 private String nombre;
 private int edad;
 private boolean casado;

 public Persona() {
  nombre = null;
  edad = 0;
  casado = true;
 }

 public Persona(String nombre, int edad, boolean casado) {
  this.nombre = nombre;
  this.edad = edad;
  this.casado = casado;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public boolean getCasado() {
  return casado;
 }

 public int getEdadConObjeto() {
  Persona p = new Persona();
  p.calcula_Edad(11);
  return edad + p.getEdad();
 }

 public String getCasadoConNombre() {
  return " Casado " + casado + " Nombre : " + getNombre();
 }

 public void calcula_Edad(int edad) {
  this.edad = edad * 2;
 }

 public void invocarThis() {
  this.calcula_Edad(edad);
 }

 @Override
 public String toString() {
  return "Nombre: " + getNombre() + " - Edad: " + getEdadConObjeto() + " - Casado: " + getCasadoConNombre();
 }

 public static void main(String[] args) {

  Persona p = new Persona();
  System.out.println(p.getCasadoConNombre());
  int edadConObjeto = p.getEdadConObjeto();
  System.out.println(edadConObjeto);

 }
}
