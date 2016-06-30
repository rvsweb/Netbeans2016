package librojavarama.T5ClasesAvanzadas.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag139EjemploClaseDate {

 public static void main(String[] args) {

  int edad = FechaNacimiento.edad("14/02/1981");
  System.out.println("Ver edad : " + edad);
 }
}

class FechaNacimiento {

 /**
  * Programa para calcular la edad
  *
  * @param fecha_nac
  * @return
  */
 public static int edad(String fecha_nac) {
// La fecha_nacimiento tiene que tener el formato dd/MM/yyyy
  java.util.Date hoy = new java.util.Date();
  String[] tokens = fecha_nac.split("/");
//  Se resta 1 porque los meses comienzan en 0
  Calendar cal = new GregorianCalendar(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]) - 1, Integer.parseInt(tokens[0]));
  java.util.Date fecha = new java.util.Date(cal.getTimeInMillis()); // convierte toda la fecha a milisegundos
  long diferencia = (hoy.getTime() - fecha.getTime()) / (24 * 60 * 60 * 1000);
  return (int) (diferencia / 365);
 }
}




