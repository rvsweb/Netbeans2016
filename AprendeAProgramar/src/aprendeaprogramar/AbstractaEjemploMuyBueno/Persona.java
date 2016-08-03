/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.AbstractaEjemploMuyBueno;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 * @see -
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=668:clases-y-metodos-abstractos-en-java-abstract-class-clases-del-api-ejemplos-codigo-y-ejercicios-cu00695b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
/**
 * SuperClase por excelencia
 *
 * @author Portatil
 */
public class Persona {

 private String nombre;
 private String apellidos;
 private int edad;

 public Persona() {
  nombre = "";
  apellidos = "";
  edad = 0;
 }

 public Persona(String nombre, String apellidos, int edad) {
  this.nombre = nombre;
  this.apellidos = apellidos;
  this.edad = edad;
 }

 public String getNombre() {
  return nombre;
 }

 public String getApellidos() {
  return apellidos;
 }

 public int getEdad() {
  return edad;
 }

 @Override
 public String toString() {
  Integer datoEdad = getEdad();
  return "• Nombre : ".concat(getNombre()).concat(" - Apellidos : ").concat(getApellidos()).concat(" - Edad : ").concat(datoEdad.toString());
 }

}

/**
 * Clase abstract que hereda de SuperClase Persona
 *
 * @author Portatil
 */
abstract class Profesor extends Persona {

 private String idProfesor;

 public Profesor() {
  super();
  idProfesor = "Unknown";
 }

 public Profesor(String nombre, String apellidos, int edad, String id) {
  super(nombre, apellidos, edad);
  this.idProfesor = id;
 }

 public void setIdProfesor(String IdProfesor) {
  this.idProfesor = IdProfesor;
 }

 public String getIdProfesor() {
  return idProfesor;
 }

 /**
  *
  */
 public void mostrarDatos() {
  System.out.println(" ◘ Datos Profesor . nombre : " + getNombre() + " - " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
 }

 /**
  * SobreEscribimos el metodo toString y añadimos el atributo
  *
  * @return
  */
 @Override
 public String toString() {
  return super.toString().concat("- IdProfesor : ").concat(idProfesor);
 }

 /**
  * Metodo abstract
  *
  * @return
  */
 abstract public float importeNomina();

}

/**
 * Clase Concreta hereda de clase abstracta Profesor
 *
 * @author Portatil
 */
class ProfesorTitular extends Profesor {

 /**
  *
  * @param nombre
  * @param apellidos
  * @param edad
  * @param id
  */
 public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
  super(nombre, apellidos, edad, id);
 }

 /**
  * Metodo abstracto sobreEscrito
  *
  * @return
  */
 @Override
 public float importeNomina() {
  return 30f * 43.20f;
 }

}

/**
 * Clase Concreta hereda de clase abstracta Profesor
 *
 * @author Portatil
 */
class ProfesorInterino extends Profesor {

// Campo de la clase 
 private Calendar fechaComienzoInterinidad;

 /**
  *
  * @param fechaIncioInterinidad
  */
 public ProfesorInterino(Calendar fechaIncioInterinidad) {
  super();
  this.fechaComienzoInterinidad = fechaIncioInterinidad;
 }

 /**
  *
  * @param fechaIncioInterinidad
  * @param nombre
  * @param apellidos
  * @param edad
  * @param id
  */
 public ProfesorInterino(Calendar fechaIncioInterinidad, String nombre, String apellidos, int edad, String id) {
  super(nombre, apellidos, edad, id);
  this.fechaComienzoInterinidad = fechaIncioInterinidad;
 }

 /**
  * Metodo get : Devuelve un objeto de tipo Calendar
  *
  * @return
  */
 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }

 /**
  *
  * @return
  */
 @Override
 public String toString() {
  return super.toString().concat(" : Fecha comienzo interinidad : ").concat(fechaComienzoInterinidad.getTime().toString());
 }

 /**
  *
  * @return
  */
 @Override
 public float importeNomina() {
  return 30f * 35.60f;
 }

}

/**
 * Clase Genera ArrayList almacenar todos Objetos del Tipo Profesors
 *
 * @author Portatil
 */
class ListinProfesores {

// Atributo de ArrayList
 private ArrayList<Profesor> listinProfesores;

// Constructor : Instancia el objeto de la clase ArrayList
 public ListinProfesores() {
  listinProfesores = new ArrayList<Profesor>();
 }

 /**
  * Añade objetos de tipo Profesor al ArrayList<Profesor>
  *
  * @param profesor
  */
 public void addProfesor(Profesor profesor) {
  listinProfesores.add(profesor);
 }

 /**
  * Mostrar por pantalla de qué tipo es cada objeto usando la sentencia
  * instanceof para determinarlo
  */
 public void imprimirListin() {
  String tmpStr1 = null; // String temporal que usamos como auxiliar
  System.out.println("- Se procede a mostrar los datos de los profesores existentes en el listin \n");

  for (Profesor tmp : listinProfesores) {
   System.out.println(tmp.toString());
   if (tmp instanceof ProfesorInterino) {
    tmpStr1 = "- Interino";
   } else {
    tmpStr1 = "- Titular";
   }
   System.out.println("- Tipo de este profesor : " + tmpStr1 + " - Nomina de este profesor : " + (tmp.importeNomina()) + "\n");
  }
 }

 /**
  *
  * @return
  */
 public float importeTotalNominaProfesorado() {
  float importeTotal = 0f; // Variable temporal que usamos como auxiliar
// Iterador se utiliza para utilizar una copia de los objetos ( realizar modificaciones sin que esto al funcionamientos de los objetos principales
  Iterator<Profesor> it = listinProfesores.iterator(); // Iteramos con clase declarada Profesor/Clases Dinamicas ProfesorTitular/ProfesorInterino
//  Dinamicamente se determina que tipo es cada objeto
  while (it.hasNext()) {
   importeTotal = importeTotal + it.next().importeNomina(); // Java determina si debe utilizar metodo propio o de un subtipo
  }
  return importeTotal;
 }

}

class TestAbstract {

 public static void main(String[] args) {

// Var.Referencia indica la fecha actual
  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22);
  ProfesorInterino pi1 = new ProfesorInterino(fecha1, "Jose", "Hernandez Lopez", 45, "45221887-K");
  ProfesorInterino pi2 = new ProfesorInterino(fecha1, "Andres", "Molto Parra", 87, "72332634-L");
  ProfesorInterino pi3 = new ProfesorInterino(fecha1, "Jose", "Rios Mesa", 76, "34998128-M");

  ProfesorTitular pt1 = new ProfesorTitular("Juan", "Perez Perez", 23, "73-K");
  ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Monta", 49, "88-L");
  ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa Monta", 49, "81-F");

  ListinProfesores listinProfesores = new ListinProfesores();
  listinProfesores.addProfesor(pi1);
  listinProfesores.addProfesor(pi2);
  listinProfesores.addProfesor(pi3);

  listinProfesores.addProfesor(pt1);
  listinProfesores.addProfesor(pt2);
  listinProfesores.addProfesor(pt3);

  listinProfesores.imprimirListin();
  System.out.println("El importe de las nominas del profesorado que consta en el listin es " + listinProfesores.importeTotalNominaProfesorado());

 }
}
