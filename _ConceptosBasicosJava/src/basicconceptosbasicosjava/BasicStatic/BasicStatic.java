package basicconceptosbasicosjava.BasicStatic;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class BasicStatic {

 public static void main(String[] args) {
  Persona p1 = new Persona("Tomas Navarra", 22);
  Persona p2 = new Persona("Jonas Estacio", 23);
  Persona p3 = new Persona("Esta Cio", 33);
  Persona pAnonima = new Persona();

  System.out.println("Se han creado " + Persona.getContadorPersonas() + " : Personas ");
 }
}

class Persona {

 private String nombre;
 private int edad;
 private static int contadorPersonas;

 public Persona() {
  this.nombre = null;
  this.edad = 0;
 }

 public Persona(String nombre, int edad) {
  this.nombre = nombre;
  this.edad = edad;
  contadorPersonas++;
 }

 public void setNombre(String nom) {
  nombre = nom;
 }

 public String getNombre() {
  return nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 } 

 public int setEdad() {
  return edad;
 }

 public static int getContadorPersonas() {
  return contadorPersonas;
 }

 public static void incrementarContador() {
  contadorPersonas++;
 }
}
