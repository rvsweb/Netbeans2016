/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.CompararReferenciasObjetos;

import java.util.Objects;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=629:asignacion-de-igualdad-en-java-referencias-a-objetos-diferencia-entre-igualdad-e-identidad-cu00663b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1 Resumen: Entrega nº63 del curso "Aprender programación Java desde
 * cero".
 * @author Raul Vela Salas
 */
public class xEjAsignarMismoContenidoEntreObjetosConMetodos {

 public static void main(String[] args) {

  System.out.println("---- Clase Cadena ---- ");

  Cadena c1 = new Cadena();
  Cadena c2 = new Cadena("Cadena 1 ", "Cadena 2 ");

  System.out.println("Ver valor :  " + c1);
  System.out.println("Ver valor :  " + c2);

  System.out.println("- Para compartir Contenidos distintos objetos :   c1.setcadena1(c2.getcadena2()) ");
  c1.setcadena1(c2.getcadena2());

  System.out.println("Valor : " + c1.getcadena1());

  System.out.println("- Usar metodo - if (Objects.equals(c1, c2)) ");
  if (Objects.equals(c1, c2)) {
   System.out.println("Si son iguales");
  } else {
   System.out.println("No son iguales");
  }

  c1 = c2;

  System.out.println("Ver valor :  " + c1);
  System.out.println("Ver valor :  " + c2);

  System.out.println("----- Clase Persona -----  ");
  Persona p1 = new Persona("Andrés Hernández Suárez", 32, "54221893-D", "Economista");
  Persona p2 = new Persona("Andrés Hernández Suárez", 32, "54221893-D", "Abogado");

  if (p1.equals(p2)) {
   System.out.println("Son iguales los objetos p1 y p2");
  } else {
   System.out.println("NO Son iguales los objetos p1 y p2");
  }

 }
}

class Cadena {

 private String cadena1;
 private String cadena2;

 private static String static_cadena1;
 private static String static_cadena2;

 public Cadena() {
  this.cadena1 = null;
  this.cadena2 = null;
 }

 public Cadena(String cadena1, String cadena2) {
  this.cadena1 = cadena1;
  this.cadena2 = cadena2;
 }

 public void setcadena1(String cadena) {
  this.cadena1 = cadena;
 }

 public String getcadena2() {
  return cadena2;
 }

 public String getcadena1() {
  return cadena1;
 }

}

class Persona {

 private String nombre;
 private int edad;
 private String DNI;
 private String profesion;

 public Persona() {
  this.nombre = null;
  this.edad = 0;
  this.DNI = null;
  this.profesion = null;

 }

 public Persona(String nombre, int edad, String DNI, String profesion) {
  this.nombre = nombre;
  this.edad = edad;
  this.DNI = DNI;
  this.profesion = profesion;
 }

}
