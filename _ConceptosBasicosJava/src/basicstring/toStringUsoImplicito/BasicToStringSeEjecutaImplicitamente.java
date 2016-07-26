/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicstring.toStringUsoImplicito;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicToStringSeEjecutaImplicitamente {

 public static void main(String[] args) {

  System.out.printf("\u001B[35m METODO \u001B[33m toString \u001B[35m VA IMPLICITO EN CADA Variable de Referencia 'OBJETO' que se declare en esa CLASE \n");

  Persona p = new Persona();
  System.out.println(" - Lanzar objeto implicitamente sin invocar el metodo toString : Constructor sin Parametros ");
  System.out.println(p);

  System.out.println("--------------------");

  Persona p1 = new Persona("Pepe", 22, true);
  System.out.println(" - Lanzar objeto implicitamente sin invocar el metodo toString : Constructor con Parametros");
  System.out.println(p1);

  Persona p2 = new Persona("Pepa", 44, true);
  System.out.println(" - Lanzar objeto invocando metodo toString : Constructor con Parametros");
  System.out.println(p2.toString());
 }
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
   return "Nombre: " + getNombre() + " - Edad: " + getEdad() + " - Casado: " + getCasado();
  }
}
