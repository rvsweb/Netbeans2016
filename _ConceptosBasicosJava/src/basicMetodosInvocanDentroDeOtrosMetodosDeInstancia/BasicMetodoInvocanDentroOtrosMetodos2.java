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
public class BasicMetodoInvocanDentroOtrosMetodos2 {
}

class Persona0 {

 private String nombre;
 private int edad;

// public Persona0() {
//  this("AAA", 111);
//  nombre = getNombre();
//  edad = getEdad();
// }
// 
// public Persona0() {
//  nombre = this.getNombre();
//  edad = this.getEdad();
// }
// 
// 
// 
 /**
  * No tiene definido nada asi que no devuelve nada
  */
 public Persona0() {
  nombre = getNombre();
  edad = getEdad();
 }

 public Persona0(String nombre, int edad) {
  this.nombre = nombre;
  this.edad = edad;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 /**
  * Distintas asignaciones
  *
  * @param nombre
  */
 public void setNombre2(String nombre) {
  this.nombre = nombre;
  setNombre(nombre); // Asigna al atributo de instancia el parametro del metodo
  setNombre(this.nombre); // Invoca al atributo de instancia / dato miembro
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 /**
  * Pruebas LOCAS
  *
  * @param nombre
  */
 public void setNombreConParametros(String nombre) {
  this.setNombre("SATAN");
  Persona p = new Persona();
  String nombre1 = p.getNombre();
  this.nombre = nombre1;
  System.out.println("Aqui variable local : " + nombre1);
  System.out.println("Aqui atributo de instancia : " + this.nombre);
 }

 public static void main(String[] args) {

  Persona0 p = new Persona0();
  System.out.println(p.getNombre() + " " + p.getEdad());
  System.out.println("Nombre : " + p.nombre);
  p.setNombre("BBB");

  Persona0 p0 = new Persona0();
  System.out.println(p0.getNombre() + " " + p0.getEdad());

  Persona0 p1 = new Persona0("Juan", 2);
  System.out.println(p1.getNombre() + " " + p1.getEdad());

 }
}
