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
public class VadeCalendarEjemploFechaHoraMinutosPag156 {

 public static void main(String[] args) throws InterruptedException {

  Calendar ahora = Calendar.getInstance();
  System.out.println(ahora.getTime());
  System.out.println(" anio : " + ahora.get(Calendar.YEAR));
  System.out.println(" mes : " + ahora.get(Calendar.MONTH));
  System.out.println(" dia del mes : " + ahora.get(Calendar.DAY_OF_MONTH));
  System.out.println(" dia del anio : " + ahora.get(Calendar.DAY_OF_YEAR));
  System.out.println(" dia de la semana : " + ahora.get(Calendar.DAY_OF_WEEK));
  System.out.println(" hora : " + ahora.get(Calendar.HOUR));
  System.out.println(" hora del dia: " + ahora.get(Calendar.HOUR_OF_DAY));
  System.out.println(" minutos : " + ahora.get(Calendar.MINUTE));
  System.out.println("-------------------------------------------");
  for (int i = 0; i < 10; i++) {
   Thread.sleep(1000);
   System.out.println(" segundos : " + ahora.get(Calendar.SECOND));
   System.out.println(" milisegundos : " + ahora.get(Calendar.MILLISECOND));
  }
 }
}
