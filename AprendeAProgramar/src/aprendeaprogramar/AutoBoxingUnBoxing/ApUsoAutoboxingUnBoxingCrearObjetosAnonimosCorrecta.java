/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.AutoBoxingUnBoxing;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoAutoboxingUnBoxingCrearObjetosAnonimosCorrecta {

}

/**
 * El objetivo es crear un ArrayList de objetos de TIPO PERSONA
 *
 * @author Portatil
 */
class Persona3 {

 private ArrayList<Persona3> tipoPersona;
 private String nombre;
 private int edad;
 private boolean asociado;

 public Persona3() {
  this.nombre = null;
  this.edad = 0;
  this.asociado = false;
  tipoPersona = new ArrayList<>();
 }

 public Persona3(String nombre, int edad, boolean asociado) {
  this.nombre = nombre;
  this.edad = edad;
  this.asociado = asociado;
  tipoPersona = new ArrayList<>();
 }

 public String getNombre() {
  return this.nombre;
 }

 public int getEdad() {
  return this.edad;
 }

 public boolean isAsociado() {
  return this.asociado;
 }

 public void setNombre(String nom) {
  this.nombre = nom;
 }

 public void setEdad(int num) {
  this.edad = num;
 }

 public void setAsociado(boolean asoc) {
  this.asociado = asoc;
 }

 @Override
 public String toString() {
  return "Nombre : " + getNombre() + " -  Edad : " + getEdad() + " - Soltero :  " + isAsociado();
 }

 public static void main(String[] args) {

  Persona3 p = new Persona3();
  Persona3 p0 = new Persona3("pepe", 21, true);
  Persona3 p1 = new Persona3("anto", 31, false);
  Persona3 p2 = new Persona3("prie", 41, true);

//  Instanciar Objetos de Clase principal mediante una variable de referencia que invoca un atributo de instancia clase ArrayList y usa su metodo add 
  Persona3 añadir = new Persona3();
  añadir.tipoPersona.add(p);
  añadir.tipoPersona.add(p0);
  añadir.tipoPersona.add(p1);
  añadir.tipoPersona.add(p2);

//  Forma Mediante Autoboxing
  añadir.tipoPersona.add(new Persona3("Newton", 34, true));
  añadir.tipoPersona.add(new Persona3("Einstein", 44, false));
  añadir.tipoPersona.add(new Persona3("Tesla", 54, true));
  añadir.tipoPersona.add(new Persona3("Ada", 64, false));

  System.out.println("------------- For-each : Basico sin toString ---------------------");
  for (Persona3 persona3 : añadir.tipoPersona) {
   System.out.println("Datos : " + "Nombre : " + persona3.getNombre() + " Edad : " + persona3.getEdad() + " Asociado : " + persona3.isAsociado());
  }

  System.out.println("------------- For-each : Basico con toString ---------------------");
  for (Persona3 persona3 : añadir.tipoPersona) {
   System.out.println("Datos : " + persona3.toString());
  }

  System.out.println("------------- Usando Functional Operation ---------------------");
  añadir.tipoPersona.stream().forEach((persona3) -> {
   System.out.println("Datos : " + persona3.toString());
  }
  );

  System.out.println("------------ Iterator : Copia aparte de los objetos para trabajar con ellos -----------");
// Añadir = ArrayList<Persona3> 
  for (Iterator<Persona3> it = añadir.tipoPersona.iterator(); it.hasNext();) {
   Persona3 persona3 = it.next();
   System.out.println("• Datos : " + persona3.toString());
   System.out.println("---------------------------------");
   System.out.println("$ Datos : " + "Nombre : " + persona3.getNombre() + " Edad : " + persona3.getEdad() + " Asociado : " + persona3.isAsociado());
  }
 }
}
