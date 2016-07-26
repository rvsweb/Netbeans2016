/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class UsoArrayList_ConObjetos {

}

class Persona {

 private String nombre;
 private int edad;
 private boolean casado;

 public Persona() {
  nombre = null;
  edad = 0;
  casado = true;
 }

 public Persona(String nombre, int edad, boolean casado) {
  this.nombre = nombre;
  this.edad = edad;
  this.casado = casado;
 }

 public String getNombre() {
  return nombre;
 }

 public int getEdad() {
  return edad;
 }

 public boolean getCasado() {
  return casado;
 }

 @Override
 public String toString() {
  return " Nombre " + getNombre() + " - " + getEdad() + " - " + getCasado();
 }

 public static void main(String[] args) {

  System.out.println("Sin Instancia - Sacar Valores NULL y Errores a proposito ");
// 1º Creamos ArrayList Tipo Persona
  ArrayList<Persona> aniadir0 = new ArrayList<Persona>();
// 2º Con variable referencia de objeto aniadir0 : llamamos al metodo para añadir objetos e invocamos al constructor para pasarle los parametros
  aniadir0.add(new Persona("Pepe 0 ", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir0.add(new Persona("Pepe 1 ", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir0.add(new Persona("Pepe 2 ", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir0.add(new Persona("Pepe 3 ", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir0.add(new Persona("Pepe 4 ", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir0.add(new Persona()); // Este constructor creara una excepcion si no se controla con el if(siguienteObjeto.getNombre() == null)

// 3º Creamos el Iterator para copiar el ArrayList de objetos y poderlo modificar en tiempo de ejecucion 
  Iterator<Persona> it = aniadir0.iterator();
// 4º Recorremos la referencia ArrayList mediante el metodo hasNext
  while (it.hasNext()) {
// 5º Almacenamos en la variable de referencia , el objetos iterator con el metodo siguiente para recorrer la lista de datos  
   Persona siguienteObjeto = it.next();
// 6º Con la variable de referencia hacemos una comprobacion 
   if (siguienteObjeto.getNombre() == null) {
    System.out.println("♦♦♦♦♦ Soy Null ♦♦♦♦♦ ");
    System.out.println("♦♦♦♦♦ Analizando elementos - " + siguienteObjeto);
   }
   System.out.println("Analizando elementos - " + siguienteObjeto);
  }

  ////////////////////////////////////////////////////////////////////
  System.out.println("Sin Instancia v2 ");
  ArrayList<Persona> aniadir1 = new ArrayList<Persona>();
  aniadir1.add(new Persona("Doll 0", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir1.add(new Persona("Doll 1", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir1.add(new Persona("Doll 2", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir1.add(new Persona("Doll 3", (int) (Math.random() * (Math.max(10, 100))), true));
  aniadir1.add(new Persona("Doll 4", (int) (Math.random() * (Math.max(10, 100))), true));

  Iterator<Persona> it0 = aniadir1.iterator();
  while (it0.hasNext()) {
   Persona siguienteObjeto2 = it0.next();
   System.out.println(siguienteObjeto2);
  }

///////////////////////////////////////////////////////////////////  
  Persona a1 = new Persona("Jaan 1", 11, true);
  Persona a2 = new Persona("Jaan 2", 21, true);
  Persona a3 = new Persona("Jaan 3", 31, true);
  Persona a4 = new Persona("Jaan 4", 41, true);
  Persona a5 = new Persona("Jaan 5", 51, true);

  ArrayList<Persona> aniadir2 = new ArrayList<Persona>();
  aniadir2.add(a1);
  aniadir2.add(a2);
  aniadir2.add(a3);
  aniadir2.add(a4);
  aniadir2.add(a5);

  System.out.println("-------------------");

  System.out.println("Con Instancia ");
  Iterator<Persona> it2 = aniadir2.iterator();
  while (it2.hasNext()) {
   Persona siguienteObjeto2 = it2.next();
   System.out.println("Analizando elementos 2 : " + siguienteObjeto2);
   if (siguienteObjeto2.getNombre().equals("Jaan 4")) {
    System.out.println("Encontrado : " + siguienteObjeto2.getNombre());
   }
  }

 }
}
