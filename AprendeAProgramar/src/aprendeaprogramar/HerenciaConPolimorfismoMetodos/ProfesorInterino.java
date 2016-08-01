/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaConPolimorfismoMetodos;

import java.util.Calendar;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ProfesorInterino extends Profesor {

 private Calendar FechaComienzoInterinidad;

 public ProfesorInterino(Calendar fechaComienzoInterinidad) {
  super();
  FechaComienzoInterinidad = fechaComienzoInterinidad;
 }

 public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaComienzoInterinidad) {
  super(nombre, apellidos, edad);
  FechaComienzoInterinidad = fechaComienzoInterinidad;
 }

 public Calendar getFechaComienzoInterinidad() {
  return FechaComienzoInterinidad;
 }

 /**
  * Metodo SobreEscrito
  */
 @Override
 public void mostrarDatos() {
  System.out.println("Datos ProfesorInterino . Comienzo de interinidad : " + FechaComienzoInterinidad.getTime().toString());
 }

}
