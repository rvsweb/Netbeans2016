/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Equals;

/**
 * @see - 63
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEqualsPag52 {

 /**
  * Metodo Redefinido
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) {
  return (this == obj);
 }

// Cuando el metodo no se redefine se crea : 
// a.equals(b) <=> a == b;
// 
// 
 /**
  * Metodo equals() va ligado al metodo 'hashCode()' que "devuelve un entero"
  * que caracteriza el "objeto"
  *
  * Cumpliendo la propiedad de que 2 "objetos" que sean equals() "Deben devolver
  * el mismo hashCode()"
  *
  * Permite que se puedan escribir codigo para buscar objetos iguales "iguales
  * referencias" que primero miran el HashCode (si es igual) se mira el equals
  *
  * @return
  */
 @Override
 public int hashCode() {
  int hash = 5;
  return hash;
 }

}

/**
 * @author Portatil
 */
class Main {

 public static void main(String[] args) {

  A a = new A();
  B b = new B();

  System.out.println("• Codigo HashCode ");
  int va = a.hashCode();
  System.out.println("a.hashCode() : " + va);
  int vb = b.hashCode();
  System.out.println("b.hashCode() : " + vb);
  boolean primera_igualdad = a.equals(b);
  System.out.println("a.equals(b) -> " + primera_igualdad);

  System.out.println("♦ Asignacion / Comparacion ");
  System.out.println("a = b; ");
  a = b;
  va = a.hashCode();
  System.out.println("a.hashCode() -> : " + va);
  vb = b.hashCode();
  System.out.println("b.hashCode() -> : " + vb);
  primera_igualdad = a.equals(b);
  System.out.println("a.equals(b) -> " + primera_igualdad + " : Ahora los objetos tienen la misma referencia ");

  System.out.println("♦ Comprueba el HashCode 'SI ES IGUAL' comprueba el metodo EQUALS ");
  if (a.hashCode() == b.hashCode() && a.equals(b)) {
   System.out.println("♦ (a.hashCode() == b.hashCode() && a.equals(b)) -> Son iguales ");
  }

  System.out.println("\n♦ Las clases que hacen esta discriminacion previa de hashCode() simplemente funcionan mal"
          + "\n si se redefine equals() pero no se redefine hashCode()."
          + "\n Ocurre por ejemplo : En las clases HashMap y HashSet de la libreria estandar de Java ");

  System.out.println("\n♦ 'equals()' define una relacion de equivalencia "
          + "\nmientras que 'comparetTo()' define una relacion de orden"
          + "\nConviene que sean 'Coherentes' ");

  A a1 = new A();
  B b1 = new B();
  C c1 = new C();

  System.out.println("\n♦ Patron Basico -\n"
          + "El metodo equals define una relacion de equivalencia sobre objetos diferentes de null");
  System.out.println("○ Reflexiva ");
  boolean valor_Reflexivo = b1.equals(b1);
  System.out.println("-> b.equals(b) : " + valor_Reflexivo);
  System.out.println("○ Simetrica ");
  boolean valor_Simetrico = a1.equals(b1);
  System.out.println("-> a1.equals(b1) : " + valor_Simetrico);
  System.out.println("○ Transitiva ");
  boolean valor_Transitiva = (a1.equals(b1) && b1.equals(c1));
  System.out.println("1º -> a1.equals(b1) : " + valor_Transitiva);
  boolean valor_Transitiva2 = a1.equals(null) == false;
  System.out.println("2º -> a1.equals(null) == false : " + valor_Transitiva2);
  boolean valor_Transitiva3 = a1 == null == false;
  System.out.println("3º -> a1 == null == false : " + valor_Transitiva3);
 }
}

class A {

 private int x;
 private int y;

 public A() {
  this.x = 0;
  this.y = 0;
 }

 public A(int x, int y) {
  this.x = x;
  this.y = y;
 }

}

class B extends A {

 private int z;

 public B() {
 }

 public B(int z) {
  this.z = z;
 }

 public B(int z, int x, int y) {
  super(x, y);
  this.z = z;
 }

}

class C extends B {

 private int w;

 public C() {
 }

 public C(int w) {
  this.w = w;
 }

 public C(int w, int z) {
  super(z);
  this.w = w;
 }

 public C(int w, int z, int x, int y) {
  super(z, x, y);
  this.w = w;
 }

}
