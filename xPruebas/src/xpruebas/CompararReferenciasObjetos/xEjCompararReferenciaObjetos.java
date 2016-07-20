/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.CompararReferenciasObjetos;

import java.util.Objects;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEjCompararReferenciaObjetos {

 public static void main(String[] args) {

  Prueba p1 = new Prueba();
  Prueba p2 = new Prueba();
  System.out.println("Referencias de Clases propias p1 = " + p1);
  System.out.println("Referencias de Clases propias p2 = " + p2);

  System.out.println("• Asignacion de variables de referencia : Creamos 2 referencia apunta distintos objetos ");

  String s1 = new String("Objeto 1");
  System.out.println("Referencia s1 : " + s1);

  String s2 = new String("Objeto 2");
  System.out.println("Referencia s2 : " + s2);

  System.out.println("• Comparacion de las referencias : s1 == s2 ");
  if (s1 == s2) {
   System.out.println("@ Si tienen la misma referencia -> s1 == s2  ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println("*** Creamos asignacion s1 = s2; ***");
  s1 = s2;

  System.out.println("• Comparacion de las referencias : s1 == s2 ");
  if (s1 == s2) {
   System.out.println("@ Si tienen la misma referencia -> s1 == s2  ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println("• Uso de Constructores Integer - i1 , i2");
  Integer i1 = new Integer(1);
  System.out.println("Referencia i1 : " + i1);
  Integer i2 = new Integer(2);
  System.out.println("Referencia i2 : " + i2);

  System.out.println("• Comparar ambas referencias i1 , i2 mediante i1 == i2 ");
  if (i1 == i2) {
   System.out.println("@ Si tienen la misma referencia ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println("*** Creamos asignacion s1 = s2; ");
  i1 = i2;

  System.out.println("• Volvemos a comparar ambas referencias i1 , i2 mediante i1 == i2 ");
  if (i1 == i2) {
   System.out.println("@ Si tienen la misma referencia ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println("• Otra forma de comparar : (Objects.equals(i1, i2)) ");
  if (Objects.equals(i1, i2)) {
   System.out.println("@ Si tienen la misma referencia ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println("• Asignacion usando el Constructor : Integer ii2 = new Integer(ii1) ");
  Integer ii1 = new Integer(10);
  System.out.println("- Referencia ii1 apunta a : " + ii1);
  Integer ii2 = new Integer(ii1);
  System.out.println("- Referencia ii2 tiene valor : " + ii2);

  System.out.println("  if (ii1 == ii2) ");
  if (ii1 == ii2) {
   System.out.println("@ Si tienen la misma referencia ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

  System.out.println(" Creamos asignacion :  ii1 = ii2; ");
  ii1 = ii2;

  System.out.println("  if (ii1 == ii2) ");
  if (ii1 == ii2) {
   System.out.println("@ Si tienen la misma referencia ");
  } else {
   System.out.println("# No tienen la misma referencia ");
  }

 }
}

class Prueba {

 public Prueba() {
 }

}
