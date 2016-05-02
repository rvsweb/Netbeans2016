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
public class Clases {
//  Identificacion de tipos en Tiempo de Ejecucion - RTTI 

 public static void main(String[] args) {

  Class clases[] = new Class[2];
  clases[0] = Persona.class;//dentro almacena una clase para ser instanciada
  clases[1] = Trabajador.class;//dentro almacena una clase para ser instanciada

  Persona lista[] = new Persona[2];
  lista[0] = new Persona(111, "David");
  lista[1] = new Trabajador(222, "Manolo", 3000, "Oracle");

  System.out.println("\nCon instanceof");
  for (int i = 0; i < lista.length; i++) {
   if (lista[i] instanceof Persona) {
    System.out.println(lista[i].a() + " es del tipo Persona •");
    if (lista[i] instanceof Trabajador) {
     System.out.println(lista[i].a() + " es del tipo Trabajador •");
    }
   }
  }

//  InstanceOf solo para comprobaciones individuales
  System.out.println("\n -> Con isInstance");
  for (int i = 0; i < lista.length; i++) {
   for (int j = 0; j < clases.length; j++) {
    if (clases[j].isInstance(lista[i])) {
     System.out.println(lista[i].a() + " es del tipo " + clases[j]);
    }
   }

   System.out.println("\n -> Con Class");
   for (int f = 0; f < lista.length; f++) {
    for (int j = 0; j < clases.length; j++) {
     if (lista[i].getClass().equals(clases[j])) {
      System.out.println(lista[i].a() + " es del tipo " + clases[j]);
     }
    }
   }
  }

  System.out.println("\n _____ Mostrar Valores _____ ");
  for (int i = 0; i < lista.length; i++) {
   for (int j = 0; j < clases.length; j++) {
    if (lista[i].getClass().equals(clases[j])) {
     System.out.println("\n Publicar datos ");
     System.out.println(lista[i].getClass().getName() + " --> " + lista[i].a());
    }
   }
  }

 }
}
