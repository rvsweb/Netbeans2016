/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=653:ejemplo-de-herencia-en-java-uso-de-palabras-clave-extends-y-super-constructores-con-herencia-cu00686b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Profesor2 extends Persona2 {

// Campos Especificos de la Subclase
 private String IdProfesor;

 /**
  *
  */
 public Profesor2() {
  super();
  this.IdProfesor = null;
 }

 /**
  * Constructor de la Subclase : Incluimos como parametros al menos los del
  * Constructor de la Superclase
  *
  *
  * @param nombre
  * @param apellidos
  * @param edad
  */
 public Profesor2(String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad); // campos Heredados de Superclase "Clase Normal" SuperTipo : Persona2
  IdProfesor = "Unknown";
 }

// Metodos especificos de la Subclase
 public void setIdProfesor(String idProfesor) {
  this.IdProfesor = idProfesor;
 }

 public String getIdProfesor() {
  return IdProfesor;
 }

 /**
  * Metodo propio de la clase
  */
 public void mostrarNombreApellidosYCarnet() {
  System.out.println("• Nombre de Profesor : " + getNombre() + " Apellidos : " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
 }

}
