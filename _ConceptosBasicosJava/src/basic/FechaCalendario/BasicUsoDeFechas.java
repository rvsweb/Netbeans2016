/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.FechaCalendario;

import java.util.Calendar;
import java.util.Date;

/**
 * @see - Propio
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoDeFechas {

 public static void main(String[] args) {

  Calendar calendario = Calendar.getInstance();
  Date time = calendario.getTime();
  calendario.set(2010, 10, 3);

  Date time_antes = calendario.getTime();

  Date time_despues = calendario.getTime();

  System.out.println("• Objeto Date - " + time);
  System.out.println("• Objeto String - " + time.toString());
  System.out.println("Antes de 2010, 10, 3 - " + time.before(time_despues));
  System.out.println("Despues de 2010, 10, 3 - " + time.after(time_antes));
 }
}
