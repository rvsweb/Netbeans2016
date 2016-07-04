package xpruebas.InicializarObjetos;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class IniPersona {

// Clase objeto
 String nombre;
 Integer edad;

 public IniPersona() {
  nombre = null;
  edad = null;
 }

 public IniPersona(String nombre, Integer edad) {
  this.nombre = nombre;
  this.edad = edad;
 }

 public Integer getEdad() {
  return edad;
 }

 public String getNombre() {
  return nombre;
 }

 public void setEdad(Integer edad) {
  this.edad = edad;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public static void main(String[] args) {

  IniPersona ip = new IniPersona();
  System.out.println("edad : " + ip.getEdad());
  System.out.println("nombre : " + ip.getNombre());

  IniPersona ip1 = new IniPersona("PEPE", 32);
  ip1.getEdad();
  ip1.getNombre();

  System.out.println("edad : " + ip1.getEdad());
  System.out.println("nombre : " + ip1.getNombre());
 }
}
