/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Herencia;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Persona {

 private String nombre;
 private String apellidos;
 private int edad;

 //Constructor completo
 public Persona(String nombre, String apellidos, int edad) {
  this.nombre = nombre;
  this.apellidos = apellidos;
  this.edad = edad;
 }

 //Métodos
 public String getNombre() {
  return nombre;
 }

 public String getApellidos() {
  return apellidos;
 }

 public int getEdad() {
  return edad;
 }
}
