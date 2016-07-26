/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.CopiarObjetosMedianteConstructores;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=629:asignacion-de-igualdad-en-java-referencias-a-objetos-diferencia-entre-igualdad-e-identidad-cu00663b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApCopiarObjetosUsandoConstructoresStatic {

 public static void main(String[] args) {

  Estudiante ee1 = new Estudiante("Juan Remar", 12, true);
  System.out.println(ee1.toString());
  Estudiante ee2 = new Estudiante(ee1);
  System.out.println(ee2.toString());
  Estudiante ee3 = new Estudiante(ee2);
  System.out.println(ee3.toString());

 }
}

class EstudianteStatic {

// Solo una copia del objeto por cada clase
// El mismo atributo para todos los objetos de la clase.
// Una sola posicion de memoria para todas las variables de referencias de los objetos de clase
 private static String nombre;
 private static int edad;
 private static boolean aprueba;

 public EstudianteStatic(Estudiante estu) {
  nombre = estu.getNombre();
  edad = estu.getEdad();
  aprueba = estu.getAprueba();
 }

 public EstudianteStatic(String nombre, int edad, boolean repite) {
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
 public String toString() {
  return "Nombre : " + this.nombre + " edad : " + this.edad + " aprueba : " + this.aprueba;
 }

}
