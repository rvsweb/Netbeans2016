/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ArrayList;

import java.util.ArrayList;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class ClaseArrayList {

 public static void main(String[] args) {

  ArrayList<Empleados> listaEmpleados = new ArrayList<>(); // Constructs an empty list with an initial capacity of ten.
  listaEmpleados.ensureCapacity(3); // indicar la capacidad del array
  listaEmpleados.add(/*Esta creando un objeto*/new Empleados("Pepe", 32, true));
  listaEmpleados.add(/*Esta creando un objeto*/new Empleados("Juan", 42, false));
  listaEmpleados.add(/*Esta creando un objeto*/new Empleados("Maria", 32, true));

  for (Empleados indice : listaEmpleados) {
   System.out.println("Nombre : " + indice.getNombre() + " edad : " + indice.getEdad() + " ");
   if (indice.isContratado() == true) {
    System.out.println("Trabajador en plantilla : " + indice.getNombre());
   } else if (indice.isContratado() != true) {
    System.out.println("Trabajador NO en plantilla : " + indice.getNombre());
   }
  }

  System.out.println("--------------------------");

  System.out.println(listaEmpleados.get(2).getNombre());
  System.out.println(listaEmpleados.set(0, new Empleados("Anto", 33, true)));

  for (Empleados indice : listaEmpleados) {
   System.out.println("Nombre : " + indice.getNombre() + " | edad : " + indice.getEdad() + " ");
   if (indice.isContratado() == true) {
    System.out.println("Trabajador en plantilla : " + indice.getNombre());
   } else if (indice.isContratado() != true) {
    System.out.println("Trabajador NO en plantilla : " + indice.getNombre());
   }
  }
 }
}

class Empleados {

 private String nombre;
 private int edad;
 private boolean contratado;

 public Empleados() {
  this.nombre = null;
  this.edad = 0;
  this.contratado = false;

 }

 public Empleados(String Nombre, int edad, boolean contratado) {
  this.nombre = Nombre;
  this.edad = edad;
  this.contratado = contratado;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setContratado(boolean contratado) {
  this.contratado = contratado;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public boolean isContratado() {
  return contratado;
 }

}
