/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaConPolimorfismoMetodos;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=662:ejemplo-ejercicio-resuelto-con-polimorfismo-sobreescritura-de-metodos-y-herencia-en-java-codigo-cu00691b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Profesor extends Persona {

 private String IdProfesor;

 /**
  *
  */
 public Profesor() {
  super();
  IdProfesor = "Unknown";
 }

 /**
  *
  * @param nombre
  * @param apellidos
  * @param edad
  */
 public Profesor(String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  IdProfesor = "Unknown";
 }

 public void setIdProfesor(String IdProfesor) {
  this.IdProfesor = IdProfesor;
 }

 public String getIdProfesor() {
  return IdProfesor;
 }

// public void mostrarDatos() {
//  System.out.println("• Datos Profesor -> Nombre Profesor : " + getNombre() + " - Apellidos " + getApellidos() + " - con Id de Profesor : " + getIdProfesor() + " - Numero Profesor : " + getIdProfesor());
// }
 @Override
 public String toString() {
  return super.toString().concat(" con Id de Profesor : ").concat(getIdProfesor());
 }

 public void mostrarDatos() {
  System.out.println(" ○ Los datos disponibles son : " + this.toString());
 }

 /**
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) {
  if (obj instanceof Profesor) {// Comprobamos si el objeto pasado como parámetro es un tipo Persona.
// Compara el objeto entrado por parametro con el objeto que tiene la superclase
   Profesor tmpProfesor = (Profesor) obj; // Creamos una variable tipo Persona asignamos objeto pasado como parámetro 
// Variable la creamos para poder invocar campos , métodos de la clase Persona, ya que esto no podemos hacerlo sobre un objeto de tipo Object
   if (super.equals(tmpProfesor) && this.IdProfesor.equals(tmpProfesor.IdProfesor)) {
    return true;
   } else {
    return false;
   }
  } else {
   return false;
  }
 }

}
