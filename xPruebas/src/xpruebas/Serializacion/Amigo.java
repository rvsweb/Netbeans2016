package xpruebas.Serializacion;

import java.io.Serializable;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class Amigo implements Serializable {

 protected String nombre;
 protected long telefono;

 public Amigo() {
  nombre = null;
  telefono = 0;
 }

 public Amigo(String nombre, long telefono) {
  this.nombre = nombre;
  this.telefono = telefono;
 }

 public void print() {
  System.out.println(nombre + " -> " + telefono);
 }

}
