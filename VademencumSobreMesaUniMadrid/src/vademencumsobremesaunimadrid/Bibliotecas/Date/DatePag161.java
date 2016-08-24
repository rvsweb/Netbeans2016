/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Date;

import java.util.Date;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class DatePag161 {

 public static void main(String[] args) {
  int milisegundos = 10;

  Date dia_pasado_1 = new Date(milisegundos);
  System.out.println("• Dia pasado : " + dia_pasado_1);
  Date fecha_pasado = new Date();
  System.out.println("• Dia pasado 2 : " + fecha_pasado);

  Date fecha_actual = new Date(System.currentTimeMillis());
  System.out.println("♦ Ver : " + fecha_actual);

  boolean antes = fecha_actual.before(fecha_pasado);
  System.out.println("Antes : " + antes);

  boolean antes2 = fecha_pasado.before(fecha_actual);
  System.out.println("Antes : " + antes2);

  boolean despues = fecha_actual.after(fecha_pasado);
  System.out.println("Despues : " + despues);

  boolean despues2 = fecha_pasado.after(fecha_actual);
  System.out.println("Despues : " + despues2);

  long milisegundosActuales = System.currentTimeMillis();
  System.out.println(milisegundosActuales);

  Date tiempo = new Date();
  long obtener_Tiempo = tiempo.getTime();
  System.out.println("♦ Obtener Tiempo transcurrido en milisegundos desde 1970 : " + obtener_Tiempo);

  Date fijar_tiempo = new Date();
  fijar_tiempo.setTime(147197919);
  long ver_tiempo_fijado = fijar_tiempo.getTime();
  System.out.println("♦ Ver tiempo fijado : " + ver_tiempo_fijado);
  System.out.println("♦ Ver tiempo fijado toString : " + fijar_tiempo.toString());

 }
}
