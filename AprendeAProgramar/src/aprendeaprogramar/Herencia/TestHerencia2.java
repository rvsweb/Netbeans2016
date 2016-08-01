/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

import java.util.Calendar;

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
 }
}
