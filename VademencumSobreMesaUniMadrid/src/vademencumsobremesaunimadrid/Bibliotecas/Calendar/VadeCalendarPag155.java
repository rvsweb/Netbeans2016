/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Calendar;

import com.sun.org.apache.bcel.internal.generic.LoadClass;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @see - 155
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeCalendarPag155 {

}

/**
 * Una clase muy general para manejar fechas y horas
 *
 * En parte reemplaza las funciones de Date , ademas añade muchisima
 * flexibilidad
 *
 * La clase carece de constructores publicos , asi que la forma de crear objetos
 * de esta clase es por medio de una factoria
 *
 * @author remoto
 */
class UsoCalendar {

 public static void main(String[] args) {

  Locale aqui = Locale.getDefault();
  Locale spanish = new Locale("es");
  Locale spanish1 = new Locale("es", "ES");
  Locale mexico = new Locale("es", "MX");

  Calendar ahora0 = Calendar.getInstance(aqui);
  System.out.println("" + ahora0);
  System.out.println("---------------------------");
  Calendar ahora1 = Calendar.getInstance(spanish);
  System.out.println("" + ahora1);
  System.out.println("---------------------------");
  Calendar ahora2 = Calendar.getInstance(spanish1);
  System.out.println("" + ahora2);
  System.out.println("---------------------------");
  Calendar ahora3 = Calendar.getInstance(mexico);
  System.out.println("" + ahora3);
  System.out.println("---------------------------");

  TimeZone aqui1 = TimeZone.getDefault();
  System.out.println(aqui1);

  int ver_get1 = ahora0.get(1);
  int ver_get2 = ahora0.get(2);
  int ver_get3 = ahora0.get(3);
  int ver_get4 = ahora0.get(4);
  int ver_get5 = ahora0.get(5);
  System.out.println("• metodo get 1 : " + ver_get1);
  System.out.println("• metodo get 2 : " + ver_get2);
  System.out.println("• metodo get 3 : " + ver_get3);
  System.out.println("• metodo get 4 : " + ver_get4);
  System.out.println("• metodo get 5 : " + ver_get5);

  Date fecha = ahora0.getTime();
  System.out.println(fecha);

  long fecha1 = ahora0.getTimeInMillis();
  System.out.println(fecha1);

  GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
  System.out.println("• Calendario : " + cal.getTime());

  int anio = cal.get(GregorianCalendar.YEAR);
  System.out.println("• Anio : " + anio);

  boolean anioBisiesto = cal.isLeapYear(cal.get(GregorianCalendar.YEAR));
  System.out.println("• Es anio " + anio + " Bisiesto : " + anioBisiesto);

  anioBisiesto = cal.isLeapYear(2013);
  System.out.println("• Es Bisiesto : " + anioBisiesto);
 }
}
