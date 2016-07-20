/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T9PersistenciaObjetosBDOO;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T9Pag267UsoBDOO {

 public static void main(String[] args) {
  ObjectContainer bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "alumnos.db4o");
  try {
   //   Realizar operaciones o metodos de llamada
   Alumno a1 = new Alumno("James Golsing", 61, 10.50);
   bd.store(a1);
   Alumno a2 = new Alumno("Dennis Ritchie", 7, 11.00);
   bd.store(a2);
   Alumno a3 = new Alumno("Alan Turing", 23, 10.50);
   bd.store(a3);

  } catch (Exception ex) {
   System.out.println("Error : " + ex);
  } finally {
   bd.close();
  }
 }
}

class Alumno {

 private String nombre;
 private int edad;
 private double nota;

 public Alumno() {
  this.nombre = null;
  edad = 0;
  nota = 0;
 }

 public Alumno(String nombre, int edad, double nota) {
  this.nombre = nombre;
  this.edad = edad;
  this.nota = nota;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setNota(int nota) {
  this.nota = nota;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public double getNota() {
  return nota;
 }

 @Override
 public String toString() {
  if (this.nota != -1) {
   return this.nombre + " ( " + this.edad + ") Nota : " + this.nombre;
  }
  return this.nombre + "(" + this.edad + ")";
 }
}
