/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaConPolimorfismoMetodos;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=666:sobreescribir-metodos-tostring-y-equals-en-java-ejemplos-y-ejercicios-resueltos-comparar-objetos-cu00694b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestHerencia5 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-387-11");
  Profesor profesor2 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor2.setIdProfesor("Prof 22-387-11");
  Profesor profesor3 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor3.setIdProfesor("Prof 11-285-22");

  Persona persona1 = new Persona("Jose", "Hernandez Lopez", 28);
  Persona persona2 = new Persona("Jose", "Hernandez Lopez", 28);
  Persona persona3 = new Persona("Jose", "Hernandez Lopez", 19);

  System.out.println("¿ Son iguales la persona1 y la persona2 ? " + persona1.equals(persona2));
  System.out.println("¿ Son el mismo objeto la persona1 y la persona2 ? " + (persona1 == persona2));
  System.out.println("¿ Son iguales la persona1 y la persona3 ? " + persona1.equals(persona3));
  System.out.println("¿ Son iguales la persona1 y la persona2 ? " + persona1.equals(persona2));
  System.out.println("¿ Son iguales la persona1 y la persona3 ? " + persona1.equals(persona3));

 }
}
