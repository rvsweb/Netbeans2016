/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.Polimorfismo;

/**
 *
 * @author Portatil
 */
public class T5Pag124EjemploPolimorfismo {

 public static void main(String[] args) {
  Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 1999, 7, 23);
  jefe_RRHH.establecerIncentivo(2570);

//  Atencion
  Empleado misempleados[] = new Empleado[2];
  misempleados[0] = new Empleado("Ana ", 30000, 2000, 7, 12); //dentro arrays Objetos de tipo Empleado almaceno los datos 
  misempleados[1] = jefe_RRHH;

  for (Empleado e : misempleados) {
   System.out.println("Nombre : " + e.getNombre() + " Sueldo : " + e.getSueldo() + " Anio Ingreso : " + e.getAnioIngreso());
  }
 }

}

class Empleado {

 private String nombre;
 private double sueldo;
 private int anioIngreso;
 private int mesIngreso;
 private int diaIngreso;

 public Empleado() {
  this.nombre = "";
  sueldo = 0;
  anioIngreso = 0;
  mesIngreso = 0;
  diaIngreso = 0;
 }

 public Empleado(String nombre, double sueldo, int anioIngreso, int mesIngreso, int diaIngreso) {
  this.nombre = nombre;
  this.sueldo = sueldo;
  this.anioIngreso = anioIngreso;
  this.mesIngreso = mesIngreso;
  this.diaIngreso = diaIngreso;
 }

 public String getNombre() {
  return this.nombre;
 }

 public double getSueldo() {
  return this.sueldo;
 }

 public int getAnioIngreso() {
  return anioIngreso;
 }

 public int getDiaIngreso() {
  return diaIngreso;
 }

 public int getMesIngreso() {
  return mesIngreso;
 }

}

class Jefatura extends Empleado {

 private double sueldo_total;
 private double incentivo;

 public Jefatura() {
  super();
  this.sueldo_total = 0;
 }

 public Jefatura(String nom, double sueldo, int anioIngreso, int mesIngreso, int diaIngreso) {
  super(nom, sueldo, anioIngreso, mesIngreso, diaIngreso);
  this.sueldo_total = sueldo + incentivo;
 }

 public double establecerIncentivo(int incentivo) {
  return (this.sueldo_total + incentivo);
 }

}
