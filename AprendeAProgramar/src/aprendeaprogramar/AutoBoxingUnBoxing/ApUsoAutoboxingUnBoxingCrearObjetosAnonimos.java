/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.AutoBoxingUnBoxing;

import java.util.ArrayList;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoAutoboxingUnBoxingCrearObjetosAnonimos {

}

/**
 * El objetivo es crear un ArrayList de objetos de TIPO PERSONA
 *
 * @author Portatil
 */
class Persona {

 private ArrayList<Persona> personas = null;
 private static ArrayList<Persona> personas2 = null;

 private String nombre;
 private int edad;
 private boolean asociado;

 public Persona() {
  this.nombre = "";
  this.edad = 0;
  this.asociado = false;
  personas = new ArrayList<>();
 }

 public Persona(String nombre, int edad, boolean asociado) {
  this.nombre = nombre;
  this.edad = edad;
  this.asociado = asociado;
  personas = new ArrayList<>();
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

// Al ser ArrayList<Persona> Solo admite objetos TIPO PERSONA 
 public void setAniadirPersona(String nombre, int edad, boolean asociado) {
// Esta almacenando ArrayList<Persona> Objeto TIPO PERSONA
  personas.add(new Persona(nombre, edad, asociado));
 }

//
// Al ser ArrayList<Persona> Solo admite objetos TIPO PERSONA 
 public void setAniadirPersona2(Persona p) {
// Esta almacenando ArrayList<Persona> Objeto TIPO PERSONA
  personas.add(p);
 }

 public ArrayList<Persona> getDevolverPersona() {
  return personas;
 }

 public static void main(String[] args) {

  Persona p1 = new Persona();
  p1.setNombre("Pepe");
  p1.setAsociado(true);
  p1.setEdad(22);

// Variable de referencia apunta
  p1.setAniadirPersona2(p1);

  for (Persona indice : p1.getDevolverPersona()) {
   System.out.println("Persona es : " + indice.getNombre() + " - ");
  }

  Persona p2 = new Persona("Anto", 32, false);

  p2.personas.add(p2);

  for (Persona p : p2.personas) {
   System.out.println("Persona : " + p.getNombre());
  }

  Persona p0 = new Persona("Juan", 22, true);

//  Esta es la verdadera funcionalidad -> CREAR UNA COLECCION DE OBJETOS
  personas2 = new ArrayList<>();
  personas2.add(p0);
  personas2.add(p1);
  personas2.add(p2);

  for (Persona recorrer_persona : personas2) {
   System.out.println(recorrer_persona.getNombre());
  }

 }
}
