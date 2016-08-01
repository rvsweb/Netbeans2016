/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Herencia;

import java.util.Calendar;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=654:ejercicio-resuelto-ejemplo-de-herencia-simple-extends-y-super-en-java-constructores-con-herencia-cu00687b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xTestHerencia2 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-287-11");
  profesor1.mostrarNombreApellidosYCarnet();

  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22);

  ProfesorInterino interino1 = new ProfesorInterino(fecha1, "Jose Luis", "Morales Perez", 54);
  System.out.println("El profesor interino 1 se incorporo en la fecha : " + fecha1.getTime().toString());

 }
}
