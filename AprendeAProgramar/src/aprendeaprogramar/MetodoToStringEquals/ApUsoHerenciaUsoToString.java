/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.MetodoToStringEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoHerenciaUsoToString {

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

 @Override
 public String toString() {
  return "♦ " + nombre.concat(" ").concat(apellidos);
 }

// public void mostrarDatos() {
//  System.out.println("Los datos disponibles son : " + toString());
// }
//
// 
 public void mostrarDatos() {
  System.out.println("Los datos disponibles son : " + this.toString());
 }

 /**
  * SobreEscribir el metodo equals para que pueda comparar objetos distintos al
  * String el cual esta configurado por defecto
  *
  * Ahora comparara objetos de la clase Principal Persona
  *
  * Strings los comparamos usando el método equals del API de Java para los
  * objetos de tipo String, mientras que la edad la comparamos con el operador
  * == por ser un tipo primitivo.
  *
  * Otra cuestión relevante es el tratamiento de tipos: el método equals
  * requiere como parámetro un tipo Object y no un tipo Persona.
  *
  * Así hemos de escribirlo para que realmente sea una redefinición del método
  * de la clase Object. Si usáramos otra signatura, no sería una redefinición o
  * sobreescritura del método, sino un nuevo método.
  *
  * En primer lugar comprobamos si el objeto pasado como parámetro es un tipo
  * Persona. Si no lo es, devolvemos como resultado del método false: los
  * objetos no son iguales (no pueden serlo si ni siquiera coinciden sus tipos).
  *
  *
  * En segundo lugar, una vez verificado que el objeto es portador de un tipo
  * Persona, creamos una variable de tipo Persona a la que asignamos el objeto
  * pasado como parámetro valiéndonos de casting (enmascaramiento).
  *
  * Esta variable la creamos para poder invocar campos y métodos de la clase
  * Persona, ya que esto no podemos hacerlo sobre un objeto de tipo Object.
  *
  * Con esta variable, realizamos las comparaciones oportunas y devolvemos un
  * resultado.
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) { // Usamos Object obj para que haga referencia al metodos de la SuperClase Object
  if (obj instanceof Persona) {
   Persona tmpPersona = (Persona) obj;
//   if (this.nombre.equals(tmpPersona.nombre) && this.apellidos.equals(tmpPersona.apellidos) && this.edad == tmpPersona.edad) {
   if (this.getNombre().equals(tmpPersona.getNombre()) && this.getApellidos().equals(tmpPersona.getApellidos()) && this.getEdad() == tmpPersona.getEdad()) {
    return true;
   } else {
    return false;
   }
  } else {
   return false;
  }
 }

 /**
  * Generacion automatica del metodos HashCode
  *
  * @return hash
  */
 @Override
 public int hashCode() {
  int hash = 3;
  hash = 67 * hash + Objects.hashCode(this.nombre);
  hash = 67 * hash + Objects.hashCode(this.apellidos);
  hash = 67 * hash + this.edad;
  return hash;
 }
}

/**
 *
 */
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

// public void mostrarDatos() {
//  System.out.println("Datos Profesor - Nombre Profesor : " + getNombre() + " - " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
// }
 @Override
 public void mostrarDatos() {
  System.out.println("Los datos disponibles son : " + this.toString());
 }

 @Override
 public String toString() {
  return super.toString().concat(" • con Id de profesor : ").concat(getIdProfesor());
 }

 /**
  * Metodo SobreEscrito de la SuperClase Persona
  *
  * Hemos sobreescrito el método equals con un tratamiento de tipos y uso de
  * casting similar.
  *
  * Invocamos el método equals de la superclase Persona, con lo que decimos que
  * para que dos profesores sean iguales han de coincidir nombre, apellidos y
  * edad.
  *
  * Además establecemos otro requisito para considerar a dos profesores iguales:
  * que coincida su IdProfesor.
  *
  * Esto lo hacemos a nuestra conveniencia.
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) { // Usamos Object obj para que haga referencia al metodos de la SuperClase Object
  if (obj instanceof Profesor) {
   Profesor tmpProfesor = (Profesor) obj;
//   if (super.equals(tmpProfesor) && this.IdProfesor.equals(tmpProfesor.IdProfesor)) {
   if (super.equals(tmpProfesor) && this.getIdProfesor().equals(tmpProfesor.getIdProfesor())) {
    return true;
   } else {
    return false;
   }
  } else {
   return false;
  }
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 41 * hash + Objects.hashCode(this.IdProfesor);
  return hash;
 }
}

/**
 *
 */
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

/**
 *
 */
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
class TestHerenci5 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-387-11");

  Profesor profesor2 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor2.setIdProfesor("Prof 22-387-11");

  Profesor profesor3 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor3.setIdProfesor("Prof 11-285-22");

  Persona persona1 = new Persona("Jose", "Hernandez Lopez", 28);
  Persona persona2 = new Persona("Jose", "Hernandez Lopez", 28);
  Persona persona3 = new Persona("Ramiro", "Suarez Rodriguez", 19);

  System.out.println("------------------------------------------------------------------------");
  System.out.println("♦ Son iguales la persona1 y la persona2 ? " + persona1.equals(persona2));
  System.out.println("♦ Son el mismo objeto persona1 y la persona2 ? " + (persona1 == persona2));
  System.out.println("------------------------------------------------------------------------");
  System.out.println("♦ Son iguales la persona1 y la persona3 ? " + persona1.equals(persona3));
  System.out.println("♦ Son iguales la persona1 y la persona2 ? " + persona1.equals(persona2));
  System.out.println("♦ Son iguales la persona1 y la persona3 ? " + persona1.equals(persona3));
  System.out.println("------------------------------------------------------------------------");

 }
}
