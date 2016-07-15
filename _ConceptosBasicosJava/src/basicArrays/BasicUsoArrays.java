/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicArrays;

/**
 * @see -> PDF Uni Cantabria
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class BasicUsoArrays {

 public static void main(String[] args) {
  Persona[] lista = new Persona[5];
  lista[0] = new Persona(11, "juan1");
  lista[1] = new Persona(12, "juan2");
  lista[2] = new Persona(13, "juan3");
  lista[3] = new Persona(14, "juan4");
  lista[4] = new Persona(15, "juan5");

  System.out.println("Edad maxima : " + ListasPersonas.edadMaxima(lista));

 }
}

class Persona {

 private int edad;
 private String nombre;

 public Persona(int edad, String nombre) {
  this.edad = edad;
  this.nombre = nombre;
 }

 public int edad() {
  return edad;
 }

 public String nombre() {
  return nombre;
 }

}

class ListasPersonas {

 public static int edadMaxima(Persona[] person) {
  int max = person[0].edad();
  int i = 1;
  while (i < person.length) {
   if (person[i].edad() > max) {
    max = person[i].edad();
   }
   i++;
  }
  return max;
 }

}
