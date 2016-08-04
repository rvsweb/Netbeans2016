/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

import java.util.Calendar;

/**
 * @see http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=654:ejercicio-resuelto-ejemplo-de-herencia-simple-extends-y-super-en-java-constructores-con-herencia-cu00687b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ProfesorInterino2 extends Profesor2 {

 private Calendar fechaComienzaInterinidad;

 /**
  * Constructor propio
  *
  * @param fechaInicioInterinidad
  */
 public ProfesorInterino2(Calendar fechaInicioInterinidad) {
  super();
  fechaComienzaInterinidad = fechaInicioInterinidad;
 }

 /**
  *
  * @param nombre SuperClase
  * @param apellidos SuperClase
  * @param edad SuperClase
  * @param fechaInicioInterinidad Propia Clase
  */
 public ProfesorInterino2(String nombre, String apellidos, int edad, Calendar fechaInicioInterinidad) {
  super(nombre, apellidos, edad); // Hereda Constructor de la Superclase Persona
  fechaComienzaInterinidad = fechaInicioInterinidad;
 }

 ProfesorInterino2() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 /**
  *
  * @return
  */
 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzaInterinidad;
 }

}
