/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicreflectividad;

/**
 *
 * @author TED
 */
public class Persona {

 int dni;
 String nombre;

 /**
  * Constructor basico
  */
 public Persona() {
 }

 /**
  * Constructor inicializa los atributos
  *
  * @param dni
  * @param nombre
  */
 public Persona(int dni, String nombre) {
  this.dni = dni;
  this.nombre = nombre;
 }

 /**
  * Metodo devuelve atributos de la clase
  *
  * @return
  */
 String a() {
  return this.nombre + " + " + this.dni;
 }
}
