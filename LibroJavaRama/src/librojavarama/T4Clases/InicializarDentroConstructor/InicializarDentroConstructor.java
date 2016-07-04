/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.InicializarDentroConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class InicializarDentroConstructor {

 public static void main(String[] args) {
  Empleado em = new Empleado("pepe", 1000, 1991, 3, 4);
 }
}

class Empleado {

 private String nombre;
 private double sueldo;
 private Date altaContrato; // objeto de tipo fecha

 public Empleado() {
 }

 public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
  GregorianCalendar calendario = null;
  calendario = new GregorianCalendar(anio, mes - 1, dia);
  /*objeto de tipo fecha*/
  altaContrato = calendario.getTime();
 }
}
