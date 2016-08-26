/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Calendar;

import java.util.Calendar;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class VadeCalendarEjemploMarcarFechaPag157 {

 public static void main(String[] args) {

  System.out.println("----------------- Navidad --------------------");
  Calendar navidad = Calendar.getInstance();
  navidad.set(Calendar.MONTH, Calendar.DECEMBER);
  navidad.set(Calendar.DAY_OF_MONTH, 25);
  System.out.println("Dia de navidad : " + navidad.getTime());

  System.out.println("--- Navidad - 2000 --- ");
  Calendar navidad2000 = Calendar.getInstance();
  navidad2000.set(Calendar.YEAR, 2000);
  navidad2000.set(Calendar.MONTH, Calendar.DECEMBER);
  navidad2000.set(Calendar.DAY_OF_MONTH, 25);
  System.out.println(navidad2000.getTime());

  System.out.println("--- Año que viene --- ");
  Calendar navidad2001 = Calendar.getInstance();
  navidad2001.add(Calendar.YEAR, 1);
  navidad2001.set(Calendar.MONTH, Calendar.DECEMBER);
  navidad2001.set(Calendar.DAY_OF_MONTH, 25);
  System.out.println(navidad2001.getTime());

  System.out.println("----- Ejemplo : Codigo Calcular la distancia entre 2 fechas ");
  Calendar record = Calendar.getInstance();
  record.set(1983, Calendar.JULY, 28);
  System.out.println("• Fecha pasada : " + record.getTime());
  Calendar hoy = Calendar.getInstance();
  System.out.println("• Hoy : " + hoy.getTime());
  long deltaMS = hoy.getTimeInMillis() - record.getTimeInMillis();
  long deltaDIAS = deltaMS / 1000 / 60 / 60 / 24;
  System.out.println("• Hace " + deltaDIAS + " dias ");

  System.out.println("----- Ejemplo 2 : Codigo Calcular la distancia entre 2 fechas ");
  Calendar nace1 = Calendar.getInstance();

  nace1.set(1990, Calendar.OCTOBER, 13);
  System.out.println("-♦ Persona nacio : " + nace1.getTime());
  System.out.println("-♦ Anio persona nacida  : " + nace1.get(Calendar.YEAR));

  System.out.println("--------------------------------");

  Calendar hoy1 = Calendar.getInstance();
  System.out.println("♦- Fecha de hoy : " + hoy1.getTime());
  System.out.println("♦- Anio de hoy : " + hoy1.get(Calendar.YEAR));

  int cumplidos = hoy1.get(Calendar.YEAR) - nace1.get(Calendar.YEAR);
//  Calculamos la fecha de su cumpleaños este año
  nace1.add(Calendar.YEAR, cumplidos);

  if (hoy1.before(nace1)) {
//      cumplidos -= -1;
   cumplidos = cumplidos - -1;
   System.out.println("Tiene " + cumplidos + " anios ");
  }
 }
}
