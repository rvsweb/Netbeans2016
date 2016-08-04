/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

import java.util.Calendar;
import java.util.Date;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=654:ejercicio-resuelto-ejemplo-de-herencia-simple-extends-y-super-en-java-constructores-con-herencia-cu00687b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestHerencia2 {

 public static void main(String[] args) {
  Profesor2 profesor2 = new Profesor2("Juan", "Hernandez Garcia", 33); // Hereda Constructor de la SuperClase
  profesor2.setIdProfesor("Prof 22-387-11");
  profesor2.mostrarNombreApellidosYCarnet();
  System.out.println("---------------------------------------------------------------------------------------");

//  Hemos creado una variable referencia de tipo fecha
  Calendar fecha2 = Calendar.getInstance();
  fecha2.set(2019, 10, 22);

  ProfesorInterino2 interino2 = new ProfesorInterino2("Jose Luis", "Morales Perez", 55, fecha2);
  System.out.println("♦ Nombre : " + interino2.getNombre() + " - Apellidos :  " + interino2.getApellidos() + " - Edad : " + interino2.getEdad());
  System.out.println("♦ El profesor interino 1 se incorpora en la fecha : " + fecha2.getTime().toString());
  System.out.println("---------------------------------------------------------------------------------------");
  interino2.mostrarNombreApellidosYCarnet(); // metodo propio de la clase ProfesorInterino2 sin sobreEscribir

  ProfesorInterino2 pi2 = new ProfesorInterino2("Antonio", "Freer Pêrez", 42, fecha2);
  pi2.mostrarNombreApellidosYCarnet();

  ProfesorInterino2 pi3 = new ProfesorInterino2(fecha2);
  Date ver_fecha = pi3.getFechaComienzoInterinidad().getTime();
  System.out.println("" + ver_fecha.toString());

  Profesor2 p2 = new Profesor2("Objeto p2 - Pepe 1 ", "Wert 1", 33);
  p2.mostrarNombreApellidosYCarnet();
  ProfesorInterino2 interino3 = new ProfesorInterino2("Objeto interino3 - Pepe 2 ", "Wert 2", 43, fecha2);
  p2 = interino3; // Ahora el objeto p2 almacena un nuevo Objeto
  System.out.println("-------- La referencia SuperClase contiene 1 referencia al objeto de la SubClase ");
  p2.mostrarNombreApellidosYCarnet();

  System.out.println("\n Hacia Arriba - SIN PROBLEMAS ");
  interino3 = (ProfesorInterino2) p2;
  System.out.println("-------- La referencia SubClase contiene 1 referencia al objeto de la SuperClase ");
  interino3.mostrarNombreApellidosYCarnet();

  System.out.println("\n Hacia Abajo ");
  System.out.println("Profesor p3 NO TIENE una referencia a un Objeto ");
  System.out.println(" ------ Referencia Subclase apunta a una Referencia de la SuperClase sin Constructor 'no apunta a ningun objeto' ");

  ProfesorInterino2 p44 = new ProfesorInterino2("Pepe 3", "Wert 3", 34, fecha2);
  Profesor2 p3 = p44; // Aquí se resuelve el problema - Asignacion directa del objeto p4 sobre interino5
  p44 = (ProfesorInterino2) p3;
  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  p44.mostrarNombreApellidosYCarnet();

  
  
  
  if (p3 instanceof Profesor2) {
   System.out.println("p3 es Profesor2 ");
  } else {
   System.out.println("p3 NO ES Profesor2 ");
  }

  if (p3 instanceof ProfesorInterino2) {
   System.out.println("p3 es ProfesorInterino2");
  } else {
   System.out.println("p3 NO ES ProfesorInterino2");
  }

  System.out.println("");
  System.out.println("\n Hacia Abajo ");
  System.out.println(" ------ Referencia Subclase apunta a una Referencia de la SuperClase sin Constructor 'no apunta a ningun objeto' ");
  ProfesorInterino2 interino5 = new ProfesorInterino2("Pepe 4", "Wert 4", 34, fecha2);
  Profesor2 p4 = interino5; // Aquí se resuelve el problema - Asignacion directa del objeto p4 sobre interino5
  interino5 = (ProfesorInterino2) p4;

  System.out.println("\n ---- p4 ----- ");
  if (p4 instanceof Profesor2) {
   System.out.println("p4 es Profesor2 ");
  } else {
   System.out.println("p4 NO ES Profesor2 ");
  }

  if (p4 instanceof ProfesorInterino2) {
   System.out.println("p4 es ProfesorInterino2");
  } else {
   System.out.println("p4 NO ES ProfesorInterino2");
  }

  System.out.println("\n ---- interino5 ----- ");
  if (interino5 instanceof Profesor2) {
   System.out.println("interino5 es Profesor2 ");
  } else {
   System.out.println("interino5 NO ES Profesor2 ");
  }

  if (interino5 instanceof ProfesorInterino2) {
   System.out.println("interino5 es ProfesorInterino2");
  } else {
   System.out.println("interino5 NO ES ProfesorInterino2");
  }

 }
}
