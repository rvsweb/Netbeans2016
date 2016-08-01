/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Herencia;

import java.util.Calendar;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=658:ejemplos-conversion-de-tipos-en-java-enmascaramiento-casting-classcastexceptions-instanceof-cu00689b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xTestHerencia3 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  Calendar fecha1 = Calendar.getInstance();

  fecha1.set(2019, 10, 22);

  ProfesorInterino interino1 = new ProfesorInterino(fecha1, "Jose Luis", "Morales Perez", 54);

//  Objeto profesor apunta directamente a interino1
  Profesor profesor73 = interino1; // Aqui se muestra la asignacion directa

  if (profesor73 instanceof ProfesorInterino) {
   System.out.println("*** profesor73 es un objeto de tipo ProfesorInterino - ES POLIMORFICO  ");
  } else {
   System.out.println("*** profesor73 NO es un objeto de tipo ProfesorInterino - ES POLIMORFICO  ");

  }
  if (profesor73 instanceof Profesor) {
   System.out.println("*** profesor73 es un objeto de tipo Profesor - ES POLIMORFICO ");
  } else {
   System.out.println("*** profesor73 NO es un objeto de tipo ProfesorInterino - ES POLIMORFICO  ");
  }

  if (interino1 instanceof Profesor) {
   System.out.println("*** interino1 es un objeto de tipo Profesor - ES POLIMORFICO ");
  } else {
   System.out.println("*** interino1 NO es un objeto de tipo Profesor - ES POLIMORFICO ");
  }

  if (interino1 instanceof ProfesorInterino) {
   System.out.println("*** interino1 es un objeto de tipo Profesor - ES POLIMORFICO ");
  } else {
   System.out.println("*** interino1 NO es un objeto de tipo ProfesorInterino - Nunca ha sido un Interino ");
  }

 }
}
