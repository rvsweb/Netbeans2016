/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicreflectividad;

/**
 *
 * @author TED
 */
public class Trabajador extends Persona {

 int dinero;
 String empresa;

 /**
  * Constructor Subclase hereda atributos SuperClase
  */
 Trabajador() {
  super(0, null);
 }

 /**
  * Constructor SubClase hereda e instancia atributos Superclase
  *
  * @param dni
  * @param nombre
  * @param dinero
  */
 Trabajador(int dni, String nombre, int dinero, String empresa) {
  super(dni, nombre);
  this.dinero = dinero;
  this.empresa = empresa;
 }

 /**
  * Metodo de la superclase sobreescrito
  *
  * para añadirle nueva funcionalidad
  *
  * @return
  */
 @Override
 String a() {
  String s = this.b() + " <-> " + super.a();
  return s;
 }

 /**
  * metodo subClase Trabajador
  *
  * Devuelve el valor de los atributos de instancia
  *
  * @return this.empresa + this.dinero
  */
 String b() {
  return this.empresa + " <-> " + this.dinero;
 }

}
