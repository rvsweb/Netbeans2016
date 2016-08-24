/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacto;

/**
 *
 * Ordena primero por nombre , despues por telefono (si el nombre es el mismo) y
 * por ultimo por direccion ( si nombre y telefono son iguales )
 *
 * @author remoto
 * @see
 * @since
 * @version
 */
public class Contacto implements Comparable<Contacto> {

 private String nombre;
 private String telefono;
 private String direccion;

 public Contacto() {
  this.nombre = null;
  this.telefono = null;
  this.direccion = null;

 }

 public Contacto(String nombre, String telefono, String direccion) {
  this.nombre = nombre;
  this.telefono = telefono;
  this.direccion = direccion;
 }

 @Override
 public int compareTo(Contacto contacto) {
  int comparison = nombre.compareTo(contacto.getNombre());
  if (comparison != 0) {
   return comparison;
  }
  comparison = telefono.compareTo(contacto.getTelefono());
  if (comparison != 0) {
   return comparison;
  }
  return direccion.compareTo(contacto.getDireccion());
 }

 private String getNombre() {
  return nombre;
 }

 private String getTelefono() {
  return telefono;
 }

 private String getDireccion() {
  return direccion;
 }

 public static void main(String[] args) {
  Contacto c1 = new Contacto("pepe", "1111", "calle pepe");
  Contacto c2 = new Contacto("pepe1", "21111", "calle pepe2");
  Contacto c3 = new Contacto("pepe", "1111", "calle pepe");
  Contacto c4 = new Contacto("pepe", "0111", "calle pepe");

  int valor_comparacion = c1.compareTo(c2);
  System.out.println("•- : " + valor_comparacion);
  int valor_comparacion2 = c1.compareTo(c3);
  System.out.println("•- : " + valor_comparacion2);
  int valor_comparacion3 = c3.compareTo(c4);
  System.out.println("•- : " + valor_comparacion3);
 }
}
