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
public class Profesor extends Persona {
 //Campos específicos de la subclase.

 private String IdProfesor;
 //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

 public Profesor() {
  super(null, null, 0);
  IdProfesor = "Unknown 0";
 }

 public Profesor(String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  IdProfesor = "Unknown 1 ";
 }

 public void setIdProfesor(String IdProfesor) {
  this.IdProfesor = IdProfesor;
 }

 public String getIdProfesor() {
  return IdProfesor;
 }

 public void mostrarNombreApellidosYCarnet() {
  // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error
  // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
  System.out.println("Profesor de nombre: " + getNombre() + " " + getApellidos()
          + " con Id de profesor: " + getIdProfesor());
 }
} //Cierre de la clase
