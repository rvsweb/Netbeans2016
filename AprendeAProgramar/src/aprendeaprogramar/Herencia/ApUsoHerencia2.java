/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

import java.util.Calendar;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=653:ejemplo-de-herencia-en-java-uso-de-palabras-clave-extends-y-super-constructores-con-herencia-cu00686b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoHerencia2 {

 public static void main(String[] args) {
  Profesor1 profesor1 = new Profesor1("Juan", "Hernadez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-387-11");
  profesor1.mostrarNombreApellidosYCarnet();

  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22); //Los meses van de 0 a 11, luego 10 representa noviembre
  ProfesorInterino1 interino1 = new ProfesorInterino1(fecha1, "Jose Luis", "Morales Perez", 54);
  System.out.println("El profesor interino1 " + interino1.toString() + "  se incorporo en la fecha : " + fecha1.getTime().toString());

 }
}

class Persona1 {

 private String nombre;
 private String apellidos;
 private int edad;

 public Persona1() {
  String nombre = null;
  String apellidos = null;
  int edad = 0;

 }

 public Persona1(String nombre, String apellidos, int edad) {
  this.nombre = nombre;
  this.apellidos = apellidos;
  this.edad = edad;
 }

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

class Profesor1 extends Persona1 {

 private String idProfesor;

 public Profesor1() {
  super();
  idProfesor = "Unknown";
 }

 public Profesor1(String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  idProfesor = "Unknown";
 }

 public void setIdProfesor(String idProfesor) {
  this.idProfesor = idProfesor;
 }

 public String getIdProfesor() {
  return idProfesor;
 }

 public void mostrarNombreApellidosYCarnet() {
  System.out.println("Nombre de Profesor : " + getNombre() + " Apellidos : " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
 }

}

class ProfesorInterino1 extends Profesor1 {

 private Calendar fechaComienzoInterinidad;

 public ProfesorInterino1(Calendar fechaInicioInterinidad) {
  super();
  this.fechaComienzoInterinidad = fechaInicioInterinidad;
 }

 public ProfesorInterino1(Calendar fechaInicioInterinidad, String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  this.fechaComienzoInterinidad = fechaInicioInterinidad;
 }

 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }
 
 

}
