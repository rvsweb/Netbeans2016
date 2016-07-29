/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaPolimorfismoLigaduraDinamica;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoHerenciaPolimorfismoLigaduraDinamica {

}

class Persona {

 private String nombre;
 private String apellidos;
 private int edad;

 public Persona() {
  this.nombre = null;
  this.apellidos = null;
  this.edad = 0;
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

}

class Profesor extends Persona {

 private String IdProfesor;

 public Profesor() {
  super();
  IdProfesor = "Unknown";
 }

 public Profesor(String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  this.IdProfesor = "Unknown";
 }

 public void setIdProfesor(String IdProfesor) {
  this.IdProfesor = IdProfesor;
 }

 public String getIdProfesor() {
  return IdProfesor;
 }

 public void mostrarDatos() {
  System.out.println("Datos Profesor - Nombre Profesor : " + getNombre() + " - " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
 }
}

class ProfesorInterino extends Profesor {

 private Calendar fechaComienzoInterinidad;

 public ProfesorInterino(Calendar fechaComienzo_Interinidad) {
  super();
  this.fechaComienzoInterinidad = fechaComienzo_Interinidad;
 }

 public ProfesorInterino(Calendar FechaComienzoInterinidad, String nombre, String apellidos, int edad) {
  super(nombre, apellidos, edad);
  this.fechaComienzoInterinidad = FechaComienzoInterinidad;
 }

 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }

 /**
  * Metodo sobreescrito de la clase Profesor : Añade tus propios datos
  */
 @Override
 public void mostrarDatos() {
  System.out.println("Datos Profesor Interino . Comienzo interinidad : " + fechaComienzoInterinidad.getTime().toString());
 }
}

class ListinProfesores {

// Atributo
 private ArrayList<Profesor> listinProfesores;

 /**
  * Constructor : hace que la variable apunte a un objeto de la clase ArrayList
  * de tipo Profesor
  */
 public ListinProfesores() {
  listinProfesores = new ArrayList<Profesor>();
 }

 /**
  * Metodos ArrayList para añadir objetos de la clase Profesor "SUPERCLASE" a la
  * "SUBCLASE" ListinProfesores
  *
  * @param profesor
  */
 public void addProfesor(Profesor profesor) {
  listinProfesores.add(profesor);
 }

 /**
  * Recorre la lista de objetos de tipo listinProfesores
  *
  * tmp.mostrarDatos() puede dar lugar a la ejecución del método de la clase
  * ProfesorInterino, ProfesorTitular o Profesor, dependiendo del tipo dinámico
  * al que apunte la variable.
  *
  *
  */
 public void listar() {
  System.out.println("Se procede a mostrar los datos de los profesores existentes en el listin ");
  for (Profesor tmp : listinProfesores) { // USO DE FOR EXTENDIDO 
   tmp.mostrarDatos();
  }
 }

}

/**
 * Si observamos el código de la clase ProfesorInterino vemos que el método
 * mostrarDatos() está sobreescrito respecto al de su superclase Profesor. El
 * método mostrarDatos() de la clase Profesor muestra nombre, apellidos e id de
 * profesor, mientras que el método mostrarDatos() de la clase ProfesorInterino
 * muestra la fecha de comienzo de la interinidad. En la clase ListinProfesores
 * definimos un tipo que almacena objetos de tipo Profesor y su método listar()
 * invoca el método mostrarDatos(). En la clase TestHerencia4 creamos un objeto
 * Profesor y un objeto ProfesorInterino e introducimos ambos en un objeto de
 * tipo ListinProfesores. ¿Qué ocurre cuando invocamos a listar() en el objeto
 * donde tenemos una colección con objetos de la superclase (Profesores) y
 * objetos de la subclase (ProfesoresInterinos)? Que según sea el tipo dinámico
 * del objeto, se usa el método mostrarDatos() con mayor cercanía. En el caso
 * del objeto ProfesorInterino, se usa el método propio de los profesores
 * interinos, aunque hayamos dicho que el ArrayList contiene objetos Profesor y
 * aunque el bucle que invoca al método mostrarDatos() indique que el tipo que
 * se usa es Profesor. Esto es debido a que toda variable de tipo Profesor es
 * polimórfica y admite objetos de distintos tipos
 *
 * A la hora de diseñar y dar nombres a las clases debes usar la lógica de la
 * herencia y evitar nombres o relaciones entre clases que resulten
 * contradictorios o contrarios a lo que sería lógico en el mundo real.
 *
 *
 * Los objetos heredan los métodos de abajo hacia arriba, es decir, siempre
 * tienen preferencia los métodos sobreescritos. Java hace una búsqueda dinámica
 * del método aplicable empezando por el más próximo al tipo y escalando
 * sucesivamente los supertipos hasta encontrar un método con la denominación
 * especificada.
 *
 * @author Portatil
 */
class TestHerencia4 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-387-11");
  Calendar fecha1 = Calendar.getInstance();

  fecha1.set(2019, 10, 22);

  ProfesorInterino interino1 = new ProfesorInterino(fecha1, "Jose Luis", "Morales Perez", 54);
  ListinProfesores listin1 = new ListinProfesores();
  listin1.addProfesor(profesor1);
  listin1.addProfesor(interino1);
  listin1.listar();

 }
}
