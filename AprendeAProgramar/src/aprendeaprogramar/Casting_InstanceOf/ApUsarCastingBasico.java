/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Casting_InstanceOf;

import java.util.Calendar;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsarCastingBasico {

}

class TestHerencia3 {

 public static void main(String[] args) {

  Profesor profesor1 = new Profesor('A', 112, "Dennis Ritchie", false, 56);
  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22); // LOS MEsES VAN 0 a 11

//  Subtipo
  ProfesorInterino interino1 = new ProfesorInterino(fecha1, 'C', 112, "Donald Knuth", true);
// SUPERTIPO 'profesor73' apunta al Subtipo 'interino1'
  Profesor profesor73 = interino1; // Ahora el 'SUPERTIPO' contiene un 'Subtipo' en principio con perdida de informacion

  if (profesor73 instanceof ProfesorInterino) {
   System.out.println("**** profesor73 es un objeto de tipo ProfesorInterino **** ");
  }
  if (profesor73 instanceof Profesor) {
   System.out.println("**** profesor73 es un objeto de tipo Profesor !ES POLIMORFICO ! ");
  }

  if (interino1 instanceof Profesor) {
   System.out.println("• Interino1 es un objeto de tipo Profesor ! ES POLIMORFICO TAMBIEN ");
  } else {
   System.out.println("• Interino1 no apunta a un objeto de tipo Profesor");
  }

  if (profesor1 instanceof ProfesorInterino) {
   System.out.println("♦ Profesor1 es un objeto de tipo ProfesorInterino");
  } else {
   System.out.println("♦ profesor1 no es un objeto de tipo ProfesorInterino , Nunca ha sido interino ");
  }

  System.out.println("--------------------------------------");
  System.out.println("----------- DE ABAJO ARRIBA : NO FUNCIONA ----------------");
  System.out.println("---------- ProfesorInterino interino0 =  (ProfesorInterino) profesor0; ---------------------------");
//  Profesor profesor0 = new Profesor('E', 231, "PEPE 1", true, 33);
//  ProfesorInterino interino0 = new ProfesorInterino(fecha1, 'G', 131, "PEPE 2", true);
//  interino0 = (ProfesorInterino) profesor0;
//  if (interino0 instanceof Profesor) {
//   System.out.println(" SI ");
//  } else {
//   System.out.println(" NO ");
//  }

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

 Profesor(char curso, int num_curso, String nombre_persona, boolean casado, int edad) {
  super(nombre_persona, casado, edad);
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
 public ProfesorInterino(Calendar fechaComienzoInterinidad, char curso, int num_curso, String nombre_persona, boolean casado) {
  super(curso, num_curso, nombre_persona, casado, num_curso);
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
