/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.CopiarObjetosMedianteConstructores;

import java.lang.annotation.Annotation;
import java.util.Objects;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=629:asignacion-de-igualdad-en-java-referencias-a-objetos-diferencia-entre-igualdad-e-identidad-cu00663b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApCopiarObjetosUsandoConstructores implements Cloneable {

 public static void main(String[] args) {

  Estudiante e1 = new Estudiante("Pepe Grillo", 22, false);
  System.out.println(e1.toString());
  Estudiante e2 = new Estudiante(e1);
  System.out.println(e2.toString());
  Estudiante e3 = new Estudiante();
  System.out.println(e3.toString());
  Estudiante e4 = new Estudiante("Sin Nombre", 35, true);
  Estudiante e5 = (Estudiante) e4.clone();
//  e5 = e4;

  System.out.println("-- Objects.equals(e1, e2) ");
  if (Objects.equals(e1, e2)) {
   System.out.println("Son iguales ");
  } else {
   System.out.println("No Son iguales " + e1);
   System.out.println("No Son iguales " + e2);
  }

  System.out.println("-- e1.equals(e2) ");
  if (e1.equals(e2)) {
   System.out.println("Son iguales ");
  } else {
   System.out.println("No Son iguales " + e1);
   System.out.println("No Son iguales " + e2);
  }

  System.out.println("-- Clonar Objetos -- ");
  if (e4.equals(e5)) {
   System.out.println("Son iguales " + e4);
   System.out.println("Son iguales " + e5);
  } else {
   System.out.println("No Son iguales " + e4);
   System.out.println("No Son iguales " + e5);
  }

 }
}

class Estudiante {

 private String nombre;
 private int edad;
 private boolean aprueba;

 public Estudiante() {
  nombre = null;
  edad = 0;
  aprueba = false;
 }

 public Estudiante(Estudiante estu) {
  nombre = estu.getNombre();
  edad = estu.getEdad();
  aprueba = estu.getAprueba();
 }

 public Estudiante(String nombre, int edad, boolean repite) {
  this.nombre = nombre;
  this.edad = edad;
  this.aprueba = repite;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public boolean getAprueba() {
  return aprueba;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setAprueba(boolean aprueba) {
  this.aprueba = aprueba;
 }

 @Override
 public Object clone() {
  Object obj = null;
  try {
   obj = super.clone();
  } catch (CloneNotSupportedException ex) {
   System.out.println("No se puede duplicar");
  }
  return obj;
 }

 /*
 @Override
 public String toString() {
  return "Nombre : " + this.nombre + " edad : " + this.edad + " aprueba : " + this.aprueba;
 }
  */
}
