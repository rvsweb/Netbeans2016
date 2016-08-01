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
public class ProfesorInterino extends Profesor {

 private Calendar fechaComienzoInterinidad;

 public ProfesorInterino(Calendar fechaInicioInterinidad) {
  super();
  fechaComienzoInterinidad = fechaInicioInterinidad;
 }

 public ProfesorInterino(Calendar fechaComienzoInterinidad, String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  this.fechaComienzoInterinidad = fechaComienzoInterinidad;
 }

 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }

}
