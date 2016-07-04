/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T5Pag121UsoTipoFechaBasico {

 public static void main(String[] args) {

  Date d = new Date();
  GregorianCalendar obj_calendario = new GregorianCalendar();
  obj_calendario.setTime(d);

  Date fecha = new Date();
  GregorianCalendar obj_calendario1 = new GregorianCalendar(1981, 2, 14);
  obj_calendario.setTime(fecha);

  System.out.println("----------------------");
  System.out.println("Dia del mes actual : " + obj_calendario.get(Calendar.DAY_OF_MONTH));
  System.out.println("----------------------");
  System.out.println("Mes actual - empieza en 0 : " + obj_calendario.get(Calendar.MONTH) + 1);
  System.out.println("----------------------");
  System.out.println("Anio : " + obj_calendario.get(Calendar.YEAR));
  System.out.println("----------------------");

  int get = obj_calendario.get(Calendar.MILLISECOND);
  System.out.println("milisegundos " + get);
  System.out.println("----------------------");
  int get1 = obj_calendario1.get(Calendar.MILLISECOND);
  System.out.println("milisegundos " + get1);
  System.out.println("----------------------");

  int diasdelasemana = GregorianCalendar.DAY_OF_WEEK;
  int formatoEstrecho = GregorianCalendar.NARROW_FORMAT;
  int semanasAnio = GregorianCalendar.WEEK_OF_YEAR;
  int semanasMes = GregorianCalendar.WEEK_OF_MONTH;
  System.out.println("dias semana : " + diasdelasemana);
  System.out.println("formato estrecho : " + formatoEstrecho);
  System.out.println("semana anio : " + semanasAnio);
  System.out.println("semana mes : " + semanasMes);

 }
}

class DeclaracionTipoCalendario {

 public static void main(String[] args) {

  Date d = new Date();
  GregorianCalendar c = new GregorianCalendar();
  c.setTime(d);

  int dia_semana = c.get(Calendar.DAY_OF_WEEK);
  System.out.println("dia semana : " + dia_semana);

  int martes = c.get(Calendar.TUESDAY);
  System.out.println("martes : " + martes);

 }
}
