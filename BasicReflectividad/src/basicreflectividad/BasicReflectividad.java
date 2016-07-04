/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicreflectividad;

/**
 * Obtener informacion de un objeto
 *
 * Saber que clase es una instancia , metodos o atributos
 *
 * @author TED
 */
public class BasicReflectividad {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {

  Persona p = new Persona();
  Class c = p.getClass();
  /**
   * Class no redefine el metodo equals La clase a la que pertenece una
   * ocurrencia sera igual a otra , solo cuando sea exactamente la misma No
   * tiene en cuenta la relacion de herencia entre ellas
   */
  boolean b = c.equals(Persona.class);
  if (b) {
   System.out.println("p : Es objeto de la clase Persona ? " + b);
  } else {
   System.out.println("p : NO Es objeto de la clase Persona ? " + b);
  }

  Trabajador t = new Trabajador();
  Class c1 = t.getClass();

  boolean b1 = c1.equals(Trabajador.class);
  if (b1) {
   System.out.println("t : Es objeto de la clase Trabajador ? " + b1);
  } else {
   System.out.println("t : NO Es objeto de la clase Trabajador ? " + b1);
  }

  Persona t1 = new Trabajador();
  Class c2 = t1.getClass();

  boolean b2 = c2.equals(Trabajador.class);
  if (b2) {
   System.out.println("t1 : Es objeto de la clase Trabajador ? " + b2);
  } else {
   System.out.println("t1 : NO es objeto de la clase Trabajador ? " + b2);
  }

//  ERROR !!! NO SE PUEDE CASTEAR 
//  OBJETO DE LA subClase no puede CASTEAR a la SuperClase
//  Trabajador t2 = (Trabajador) new Persona();
//  Class c3 = t2.getClass();
//  boolean b3 = c3.equals(Persona.class);
//  if (b3) {
//   System.out.println("t2 : Es Objeto de la clase Trabajador ? "+b3);
//  }else{
//   System.out.println("t2 : NO Es Objeto de la clase Trabajador ? "+b3);
//  }
 }
}
