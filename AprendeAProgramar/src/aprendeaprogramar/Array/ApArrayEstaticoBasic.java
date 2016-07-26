/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Array;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayEstaticoBasic {
}

class ArrayBasico {

// Declaracion : Reserva de espacio de memoria 
 private String[] cadenaPalabras;
 private int[] miArrayDeNumeros = {1, 2, 3, 4, 5, 6};

// Creacion del Array
 public ArrayBasico() {
  cadenaPalabras = new String[10];
 }

}

// Ejemplo de Uso de Tipos Objetos 
class Persona {

 private String[] nombre;
 private Persona[] Grupo3A;

 public Persona() {
  Grupo3A = new Persona[10];
  nombre = new String[10];
 }

 public Persona(Persona[] Grupo3A, String[] nombre) {
  this.Grupo3A = Grupo3A;
  this.nombre = nombre;
 }

 public Persona[] getGrupo3A() {
  return Grupo3A;
 }

}

class Coches {

 private static int[] cochesHorasDelDia;
 private static boolean[] superado;

 public static void main(String[] args) {

  int horas = (int) (Math.random() * (Math.max(0, 23)));

//  Creamos un Array de enteros con Indices entre el 0 y el 23
  cochesHorasDelDia = new int[24];
  cochesHorasDelDia[9] = 4521; // Ejemplo de asignacion
  cochesHorasDelDia[horas] = 4521; // Ejemplo de asignacion
  cochesHorasDelDia[23]++; // Se puede hacer asignaciones que equivalen a [23] += 1; 

  superado = new boolean[1000];
  superado[832] = false;

  int[] i /*Contiene un puntero o Referencia al Objeto en si es un ARRAY */ = new int[10];
  int[] ii = /*Contiene un puntero o Referencia al Objeto en si es un ARRAY */ {1, 2, 3, 4, 5, 6, 7, 8, 9};
  String[] s /*Contiene un puntero o Referencia al Objeto en si es un ARRAY */ = new String[10];
  Coches[] c /*Contiene un puntero o Referencia al Objeto en si es un ARRAY */ = new Coches[10];
  Persona[] p /*Contiene un puntero o Referencia al Objeto en si es un ARRAY */ = new Persona[10];

  Persona p0 = new Persona();
  p0.getGrupo3A();
  System.out.println(p0.getGrupo3A());

 }

}
