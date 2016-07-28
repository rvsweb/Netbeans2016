/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

import java.util.Calendar;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoHerencia {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor('A', 211);
  profesor1.setNombre("Juan Hernández García");
  profesor1.getNombre();

  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22);
  ProfesorInterino interino1 = new ProfesorInterino(fecha1, 'B', 190);
  System.out.println("El profesor " + profesor1.toString() + " se incorporo en la fecha : " + fecha1.getTime().toString());

 }
}

class Persona {

 private String nombre;
 private boolean casado;
 private int edad;

 Persona() {
  nombre = null;
  casado = false;
  edad = 0;
 }

 public Persona(String nombre, boolean casado, int edad) {
  this.nombre = nombre;
  this.casado = casado;
  this.edad = edad;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nomb) {
  this.nombre = nomb;
 }

 public boolean getCasado() {
  return casado;
 }

 public void setCasado(boolean casado) {
  this.casado = casado;
 }

 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 @Override
 public String toString() {
  return getNombre() + " - " + getEdad() + " - " + getCasado();
 }

}

class Profesor extends Persona {

 private char curso;
 private int num_curso;

 Profesor() {
  curso = '\u0000';
  num_curso = 0;
 }

 Profesor(char curso, int num_curso) {
  this.curso = curso;
  this.num_curso = num_curso;
 }

 public char getCurso() {
  return curso;
 }

 public void setCurso(char curso) {
  this.curso = curso;
 }

 public int getNumero_Curso() {
  return num_curso;
 }

 public void setNombre_Curso(int num_curso) {
  this.num_curso = num_curso;
 }

 @Override
 public String toString() {
  return "Nombre: " + getNombre() + " Letra - " + getCurso() + " Num - " + getNumero_Curso();
 }

}

class ProfesorTitular extends Profesor {

 private byte num_Horas;
 private String asignatura;
 private String clase;

 ProfesorTitular() {
  this.num_Horas = 0;
  this.asignatura = null;
  this.clase = null;
 }

 ProfesorTitular(byte numh, String asign, String clase) {
  this.num_Horas = numh;
  this.asignatura = asign;
  this.clase = clase;
 }

 public byte getNum_Horas() {
  return num_Horas;
 }

 public void setNum_Horas(byte num_Horas) {
  this.num_Horas = num_Horas;
 }

 public String getAsignatura() {
  return asignatura;
 }

 public void setAsignatura(String asignatura) {
  this.asignatura = asignatura;
 }

 public String getClase() {
  return clase;
 }

 public void setClase(String clas) {
  this.clase = clas;
 }

 @Override
 public String toString() {
  return "Clase " + getClase() + " - " + getAsignatura() + " - " + getNum_Horas();
 }
}

class ProfesorInterino extends Profesor {

 private Calendar fechaComienzoInterinidad;

 public ProfesorInterino() {
  this.fechaComienzoInterinidad = null;
 }

 /**
  *
  * @param fechaInicioInterinidad
  */
 private ProfesorInterino(Calendar fechaInicioInterinidad) {
  super();
  fechaComienzoInterinidad = fechaInicioInterinidad;
 }

 /**
  *
  * @param fechaComienzoInterinidad
  * @param curso
  * @param num_curso
  */
 public ProfesorInterino(Calendar fechaComienzoInterinidad, char curso, int num_curso) {
  super(curso, num_curso);
  this.fechaComienzoInterinidad = fechaComienzoInterinidad;
 }

 /**
  *
  * @return
  */
 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }

 @Override
 public String toString() {
  return getNombre() + " - " + getFechaComienzoInterinidad();
 }
}
