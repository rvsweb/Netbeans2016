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
 private static int i = 0;

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
  IdProfesor = " Numero : " + ++i;
 }

 public void setIdProfesor(String IdProfesor) {
  this.IdProfesor = IdProfesor;
 }

 public String getIdProfesor() {
  return IdProfesor;
 }

 public void mostrarDatos() {
  System.out.println("Datos Profesor -> Nombre Profesor : " + getNombre() + " - Apellidos " + getApellidos() + " - con Id de Profesor : " + getIdProfesor());
 }

}
