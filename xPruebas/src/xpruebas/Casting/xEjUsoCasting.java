/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Casting;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjUsoCasting {

 public static void main(String[] args) {

  ProfesorSuplente prs = new ProfesorSuplente("Almeria", 300, true);
  prs.setAsignatura("Lenguaje");
  prs.setCasado(true);
  prs.setEdad(44);
  String ver = prs.toString();
  System.out.println(ver);

  Profesor pr = new Profesor("Matematicas", 100, true);
  String ver_Profesor = pr.toString();
  System.out.println("ver : " + ver_Profesor);
  System.out.println("-------------------------");

  pr = prs;
  String valor_prs = prs.toString();
  System.out.println("ver : " + valor_prs);
  System.out.println("-------------------------");
  String valor_pr = pr.toString();
  System.out.println("ver : " + valor_pr);
  System.out.println("-------------------------");

  System.out.println("-------- Conversion hacia abajo ----------");
  Persona p_arriba = null;
  ProfesorSuplente p_abajo = new ProfesorSuplente("Madrid", 99, true);
//  p_arriba = p_abajo; // sin problemas
  p_abajo = (ProfesorSuplente) p_arriba;
  
 }
}

class Persona {

 private int edad;
 private String nombre;
 private boolean casado;

 /**
  *
  */
 public Persona() {
  edad = 0;
  nombre = null;
  casado = false;
 }

 /**
  *
  * @param edad
  * @param nombre
  * @param casado
  */
 public Persona(String nombre, int edad, boolean casado) {
  this.edad = edad;
  this.nombre = nombre;
  this.casado = casado;
 }

 public int getEdad() {
  return edad;
 }

 public String getNombre() {
  return nombre;
 }

 public boolean getCasado() {
  return casado;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setCasado(boolean casado) {
  this.casado = casado;
 }

 @Override
 public String toString() {
  return " ○ Persona : " + "Nombre : " + getNombre() + "Edad : " + getEdad() + " Casado : " + getCasado();
 }

}

class Profesor extends Persona {

 private String asignatura;
 private int id_profesor = 0;
 private boolean trabaja = false;

 /**
  * Constructor por defecto de la clase
  *
  */
 public Profesor() {
  super();
  asignatura = null;
  id_profesor = 0;
  trabaja = false;

 }

 /**
  * Constructor propio de la clase
  *
  * @param asignatura
  * @param id_profesor
  * @param trabaja
  */
 public Profesor(String asignatura, int id_profesor, boolean trabaja) {
  super(asignatura, id_profesor, trabaja);
  this.asignatura = asignatura;
  this.id_profesor = id_profesor;
  this.trabaja = trabaja;
 }

 /**
  * Define atributos Profesor
  *
  * @param asignatura
  * @param nombre
  * @param edad
  * @param casado
  */
 public Profesor(String asignatura, String nombre, int edad, boolean casado) {
  super(nombre, edad, casado);
  this.asignatura = asignatura;
 }

 /**
  * Define la clase completa de Profesor
  *
  * @param asignatura
  * @param nombre
  * @param edad
  * @param casado
  * @param id_profesor
  * @param trabaja
  */
 public Profesor(String nombre, int edad, boolean casado, String asignatura, int id_profesor, boolean trabaja) {
  super(nombre, edad, casado);
  this.asignatura = asignatura;
  this.id_profesor = id_profesor;
  this.trabaja = trabaja;
 }

 public String getAsignatura() {
  return asignatura;
 }

 public int getId_profesor() {
  return id_profesor;
 }

 public boolean isTrabaja() {
  return trabaja;
 }

 public void setAsignatura(String asig) {
  this.asignatura = asig;
 }

 public void setId_prof(int id_prof) {
  this.id_profesor = id_prof;
 }

 public void setTrabaja(boolean trab) {
  this.trabaja = trab;
 }

 @Override
 public String toString() {
  return " • Profesor " + "Asignatura : " + getAsignatura() + " Id_profesor : " + id_profesor + " Trabaja : " + trabaja;
 }

}

class ProfesorSuplente extends Profesor {

 private String localidad;
 private int horas;
 private boolean ingresado;

 public ProfesorSuplente() {
  super();
  this.localidad = null;
  this.horas = 0;
  this.ingresado = false;
 }

 public ProfesorSuplente(String localidad, int horas, boolean ingresado) {
  super(localidad, horas, ingresado, localidad, horas, ingresado);
  this.localidad = localidad;
  this.horas = horas;
  this.ingresado = ingresado;
 }

 public String getLocalidad() {
  return localidad;
 }

 public int getHoras() {
  return horas;
 }

 public boolean isIngresado() {
  return ingresado;
 }

 public void setLocalidad(String localidad) {
  this.localidad = localidad;
 }

 public void setHoras(int horas) {
  this.horas = horas;
 }

 public void setIngreso(boolean ingreso) {
  this.ingresado = ingreso;
 }

 @Override
 public String toString() {
  return " ♦ ProfesorSuplente : " + "Localidad : " + getLocalidad() + " Horas : " + getHoras() + " Ingreso : " + isIngresado();
 }

}
