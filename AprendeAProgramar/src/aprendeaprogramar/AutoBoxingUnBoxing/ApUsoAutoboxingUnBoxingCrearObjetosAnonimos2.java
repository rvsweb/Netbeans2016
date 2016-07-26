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
public class ApUsoAutoboxingUnBoxingCrearObjetosAnonimos2 {

}

/**
 * El objetivo es crear un ArrayList de objetos de TIPO PERSONA
 *
 * @author Portatil
 */
class Persona2 {

 private ArrayList<Persona2> tipoPersona;
 private String nombre;
 private int edad;
 private boolean asociado;

 public Persona2() {
  this.nombre = null;
  this.edad = 0;
  this.asociado = false;
  tipoPersona = new ArrayList<>();
 }

 public Persona2(String nombre, int edad, boolean asociado) {
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

 /**
  * !!!! Los metodos de instancia NO NECESITAN OBJETO PARA SER INVOCADOS !!!!
  *
  * @return
  */
 public int calcular() {
  return getEdad() + 2;
 }

 /**
  * !!!! Se ejecuta automaticamente en cada instanciacion
  *
  * @return
  */
 @Override
 public String toString() {
  return " NombrE : " + getNombre() + " EdaD " + getEdad() * calcular() + " AsociadO " + isAsociado();
 }

 public static void main(String[] args) {

  Persona2 p = new Persona2();
  Persona2 p0 = new Persona2("pepe", 22, true);
  Persona2 p1 = new Persona2("anto", 31, false);
  Persona2 p2 = new Persona2("prie", 41, true);

  p.tipoPersona.add(p);
  p.tipoPersona.add(p0);
  p.tipoPersona.add(p1);
  p.tipoPersona.add(p2);

  System.out.println("Mostrar los datos mediante variable referencia 'indice' e invocando metodos de instancia ");
  for (Persona2 indice : p.tipoPersona) {
   System.out.println(" - " + indice.getNombre() + " - " + indice.getEdad() + " - " + indice.isAsociado());
  }

  System.out.println("Mostrar los datos mediante variable referencia 'indice' invocando metodo ToString explicitamente ");
  for (Persona2 indice : p.tipoPersona) {
   System.out.println(" - " + indice.toString());
  }

  System.out.println("Mostrar los datos mediante variable referencia 'indice' invocando metodo ToString implicitamente ");
  for (Persona2 indice : p.tipoPersona) {
   System.out.println(" - " + indice);
  }

 }
}
