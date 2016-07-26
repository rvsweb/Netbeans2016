/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Array;

import java.util.Scanner;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ClaseArray {

 public static void main(String[] args) {

  byte b[] = new byte[5];
  System.out.println("Soy byte " + b.length);
  for (int i = 0; i < b.length; i++) {
   System.out.println("Valor : " + b.toString());
  }

  short s[] = new short[5];
  System.out.println("Soy short " + s.length);
  for (int i = 0; i < s.length; i++) {
   System.out.println("Valor : " + s.toString());
  }

  int ii[] = new int[5];
  System.out.println("Soy int " + ii.length);
  for (int i = 0; i < ii.length; i++) {
   System.out.println("Valor : " + ii.toString());
  }

  long l[] = new long[5];
  System.out.println("Soy long " + l.length);
  for (int i = 0; i < l.length; i++) {
   System.out.println("Valor : " + l.toString());
  }

  double d[] = new double[5];
  System.out.println("Soy double " + d.length);
  for (int i = 0; i < d.length; i++) {
   System.out.println("Valor : " + d.toString());
  }

  float f[] = new float[5];
  System.out.println("Soy float " + f.length);
  for (int i = 0; i < f.length; i++) {
   System.out.println("Valor : " + f.toString());
  }

  boolean bo[] = new boolean[5];
  System.out.println("Soy boolean " + bo.length);
  for (int i = 0; i < bo.length; i++) {
   System.out.println("Valor : " + bo.toString());
  }

  char c[] = new char[5];
  System.out.println("Soy char " + c.length);
  for (int i = 0; i < c.length; i++) {
   System.out.println("Valor : " + c.toString());
  }

  String st[] = new String[5];
  System.out.println("Soy String " + st.length);
  for (int i = 0; i < st.length; i++) {
   System.out.println("Valor : " + st.toString());
  }

  Persona pe[] = new Persona[5];
  System.out.println("Nº Persona " + pe.length);
  pe[0] = new Persona("Mario", 13, true);
  pe[1] = new Persona("Ramon", 23, true);
  pe[2] = new Persona("Tomas", 33, false);
  pe[3] = new Persona("Emilio", 43, true);
  pe[4] = new Persona("Juan", 53, false);
  for (Persona pe1 : pe) {
   System.out.println("Nombre : " + pe1.getNombre() + " -  edad : " + pe1.getEdad() + " - soltero : " + pe1.isSoltero());
  }

  Scanner sc = new Scanner(System.in);

  Persona pe1[] = new Persona[5];
  System.out.println("Nº Persona " + pe1.length);

  for (int i = 0; i < pe1.length; i++) {
   System.out.println("Intro nombre: ");
   String nombre = sc.next();

   System.out.println("Intro num : ");
   int num = sc.nextInt();

   System.out.println("Intro soltero ? : ");

   boolean soltero;
   switch (sc.next()) {
    case "si":
     soltero = true;
     break;
    case "no":
     soltero = false;
     break;
    default:
     System.out.println("Por defecto : soltero");
     soltero = false;
     break;
   }

   pe1[i] = new Persona(nombre, num, soltero);
  }

  for (int i = 0; i < pe1.length; i++) {
   String es_soltero = null;
   if (pe1[i].isSoltero() == true) {
    es_soltero = "si";
   } else if (pe1[i].isSoltero() == false) {
    es_soltero = "no";
   }
   System.out.println("Nombre : " + pe1[i].getNombre() + " Edad : " + pe1[i].getEdad() + " Soltero : " + es_soltero);
  }

 }
}

class Persona {

 private String nombre;
 private int edad;
 private boolean soltero;

 public Persona() {
  nombre = null;
  edad = 0;
  soltero = true;
 }

 public Persona(String nombre, int edad, boolean soltero) {
  this.nombre = nombre;
  this.edad = edad;
  this.soltero = soltero;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setSoltero(boolean soltero) {
  this.soltero = soltero;
 }

 public int getEdad() {
  return edad;
 }

 public String getNombre() {
  return nombre;
 }

 public boolean isSoltero() {
  return soltero;
 }

 @Override
 public String toString() {
  return this.nombre + " - " + this.edad + " - " + this.soltero;
 }

}
