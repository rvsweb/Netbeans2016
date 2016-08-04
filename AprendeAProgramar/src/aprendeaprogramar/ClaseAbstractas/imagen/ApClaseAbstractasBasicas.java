/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseAbstractas.imagen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 * En este diagrama de clases vemos cómo hemos definido una clase abstracta
 * denominada Profesor.
 *
 * Identifica señalando <<abstract>> en la parte superior del icono de la clase.
 *
 * Sin embargo, hereda de la clase Persona que no es abstracta, lo cual
 * significa que puede haber instancias de Persona pero no de Profesor.
 *
 * El test que hemos diseñado se basa en lo siguiente:
 *
 * ProfesorTitular y ProfesorInterino son subclases de la clase abstracta
 * Profesor.
 *
 * ListinProfesores sirve para crear un ArrayList de profesores que pueden ser
 * tanto interinos como titulares y realizar operaciones con esos conjuntos.
 *
 * El listín se basa en el "tipo estático Profesor", pero su contenido dinámico
 * siempre será a base de instancias de ProfesorTitular o de ProfesorInterino ya
 * que Profesor es una clase abstracta, no instanciable.
 *
 * En la clase de test creamos profesores interinos y profesores titulares y los
 * vamos añadiendo a un listín.
 *
 * Posteriormente, invocamos el método imprimirListin, que se basa en los
 * métodos toString de las subclases y de sus superclases mediante invocaciones
 * sucesivas a super.
 *
 * La clase ListinProfesores hemos definido el método
 * importeTotalNominaProfesorado() que se basa en un bucle que calcula la nómina
 * de todos los profesores que haya en el listín (sean interinos o titulares)
 * mediante el uso de un método abstracto: importeNomina().
 *
 * Este método está definido como abstract public float importeNomina (); dentro
 * de la clase abstracta profesor, e implementado en las clases ProfesorInterino
 * y ProfesorTitular.
 *
 * El aspecto central de este ejemplo es comprobar cómo una clase abstracta como
 * Profesor nos permite realizar operaciones conjuntas sobre varias clases,
 * ahorrando código y ganando en claridad para nuestros programas.
 *
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=668:clases-y-metodos-abstractos-en-java-abstract-class-clases-del-api-ejemplos-codigo-y-ejercicios-cu00695b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApClaseAbstractasBasicas {

}

/**
 * SuperClase
 *
 * @author Portatil
 */
class Persona {

 private String nombre;
 private String apellidos;
 private int edad;

 /**
  * Constructor
  */
 public Persona() {
  nombre = null;
  apellidos = null;
  edad = 0;
 }

 /**
  *
  * @param nombre
  * @param apellidos
  * @param edad
  */
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

 /**
  * ORIGINAL
  *
  * @return
  */
 @Override
 public String toString() {
  Integer datoEdad = edad;
  return " - Nombre: ".concat(nombre).concat(" - Apellidos:").concat(apellidos).concat(" - Edad:").concat(datoEdad.toString());
 }
}
/////////////////////////////////////FIN DE LA CLASE ///////////////////////////////////////////

/**
 * DEFINIDO POR MI
 *
 * @return
 * @Override public String toString() { return "Nombre :
 * ".concat(getNombre().concat(" Apellidos : ").concat(getApellidos()).concat("
 * Edad : ").concat(String.valueOf(this.edad))); } }
 */
//
////////////////////////////////////////////////////////////////////////////////
//
/**
 * clase Profesor como abstracta.
 *
 * Tenemos un método abstracto (definido como abstract y sin cuerpo), nos obliga
 * a declarar la clase como abstracta.
 *
 * El método sobreescrito 'toString' llama al método toString de la superclase y
 * lo concatena con nuevas cadenas.
 *
 * Como clases que heredan de Profesor tenemos a ProfesorTitular y
 * ProfesorInterino:
 *
 * Clase Abstracta que hereda de SuperClase
 *
 * @author Portatil
 */
//    Subclase abstract         Superclase 
abstract class Profesor extends Persona {

// Campo de la clase ejemplo 
 private String IdProfesor;

// Constructores
 public Profesor() {
  super(); // Constructor heredado de la Superclase Persona
  IdProfesor = "Unknown"; // atributo propio de clase 
 }

 /**
  * Constructor
  *
  * @param nombre
  * @param apellidos
  * @param edad
  * @param id
  */
 public Profesor(String nombre, String apellidos, int edad, String id) {
  super(nombre, apellidos, edad); // Constructor Superclase Persona
  IdProfesor = id; // atributo propio de clase 
 }

 /**
  * Metodo // fija atributo propio de clase
  *
  * @param IdProfesor
  */
 public void setIdProfesor(String IdProfesor) {
  this.IdProfesor = IdProfesor;
 }

 /**
  * Metodo // devuelve atributo propio de clase
  *
  * @return
  */
 public String getIdProfesor() {
  return IdProfesor;
 }

 /**
  * Metodo para mostrar datos
  */
 public void mostrarDatos() {
  System.out.println("Datos Profesor : Profesor de nombre : " + getNombre() + " Apellidos :  " + getApellidos() + " con Id de Profesor : " + getIdProfesor());
 }

 /**
  * Metodo abstracto
  *
  * Este es el unico elemento que hace que la clase sea abstracta
  *
  * @return
  */
 abstract public float importeNomina();

}
/////////////////////////////////////FIN DE LA CLASE ///////////////////////////////////////////

/**
 * Subclase ProfesorTitular
 *
 * @author Portatil
 */
class ProfesorTitular extends Profesor {

 /**
  * Invoca al Constructor de la Clase Abstracta Profesor que este a la vez
  * hereda los parametros del constructor de la clase Persona mediante super
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
  * Metodo abstracto sobreEscrito en esta clase
  *
  * @return
  */
 @Override
 public float importeNomina() {
  return 30f * 43.20f;
 }

}
/////////////////////////////////////FIN DE LA CLASE ///////////////////////////////////////////

/**
 * Subclase ProfesorTitular
 *
 * @author Portatil
 */
//     SubClase                Superclase
class ProfesorInterino extends Profesor {

// atributo de instancia tipo Calendar
 private Calendar fechaComienzoInterinidad;

 /**
  * Constructor : Inicializa objetos que se creen de tipo Calendar
  *
  * Invoca al constructor por defecto de la Superclase
  *
  * @param fechaInicioInterinidad
  */
 public ProfesorInterino(Calendar fechaInicioInterinidad) {
  super();
  fechaComienzoInterinidad = fechaInicioInterinidad;
 }

 /**
  * Constructor : Inicializa objetos de tipo
  *
  * Invoca al constructor de la Superclase
  *
  * @param fechaComienzoInterinidad
  * @param nombre
  * @param apellidos
  * @param edad
  * @param id
  */
 public ProfesorInterino(Calendar fechaComienzoInterinidad, String nombre, String apellidos, int edad, String id) {
  super(nombre, apellidos, edad, id);
  this.fechaComienzoInterinidad = fechaComienzoInterinidad;
 }

 /**
  *
  * @return
  */
 public Calendar getFechaComienzoInterinidad() {
  return fechaComienzoInterinidad;
 }

 /**
  * SobreEscribimos el metodo de la Superclase Object
  *
  * @return
  */
 @Override
 public String toString() {
  return super.toString().concat(" Fecha comienzo interinidad: ").concat(fechaComienzoInterinidad.getTime().toString());
 }

 /**
  * Metodo abstracto heredado e implementado de la Superclase
  *
  * @return el sueldo del profesor Interino
  */
 @Override
 public float importeNomina() {
  return 30f * 35.60f;
 }
}

/////////////////////////////////////FIN DE LA CLASE ///////////////////////////////////////////
/**
 *
 * @author Portatil
 */
class ListinProfesores {

 /**
  * Campo de la clase
  */
 private ArrayList<Profesor> listinProfesores;

 /**
  * Constructor
  */
 public ListinProfesores() {
  listinProfesores = new ArrayList<Profesor>();
 }

 /**
  * Metodo para añadir
  */
 public void addProfesor(Profesor profesor) {
  listinProfesores.add(profesor);
 }

 /**
  * Metodo para imprimir todos los datos del listin telefonico
  */
 public void imprimirListin() {
// Objeto : String temporal que usamos como auxiliar
  String tmpStr1 = null;
  System.out.println("\n- Se procede a mostrar los datos de los profesores existentes en el listin ");
  for (Profesor tmp : listinProfesores) {
   System.out.println(tmp.toString());
   if (tmp instanceof ProfesorTitular) {
    tmpStr1 = "Interino";
   } else {
    tmpStr1 = "Titular";
   }
   System.out.println("- Tipo de este profesor : "
           + tmpStr1 + " - Nomina de este profesor : "
           + (tmp.importeNomina()) + "\n");
  }
 }

 /**
  * Calcular la nomina de los Distintos Profesores
  *
  * Ligadura Dinamica :
  *
  * @return importeTotal
  */
 public float importeTotalNominaProfesorado() {
// Variable temporal que usamos como auxiliar
  float importeTotal = 0f;
  Iterator<Profesor> it = listinProfesores.iterator();
  while (it.hasNext()) {
   importeTotal = importeTotal + it.next().importeNomina();
  }
  return importeTotal;
 }

}

/*
ProfesorTitular y ProfesorInterino se han definido como 'clases concretas' que heredan de la clase abstracta Profesor. 

Ambas clases redefinen (obligatoriamente han de hacerlo) el método abstracto importeNomina() de la superclase Abstracta Profesor. 

El método sobreescrito toString() de la clase ProfesorInterino llama al método toString() de la superclase abstracta y lo concatena con nuevas cadenas. 

El cálculo de importeNomina en ambas clases es una trivialidad: hemos incluido un cálculo sin mayor interés excepto que el de ver el funcionamiento de la implementación de métodos abstractos.

ProfesorTitular lo hemos dejado con escaso contenido porque aquí lo usamos solo a modo de ejemplo de uso de clases abstractas y herencia. 

Su único cometido es mostrar que existe otra subclase de Profesor. 

Por otro lado, en la clase ListinProfesores tenemos un ejemplo de uso de 'instanceof' para determinar qué tipo (ProfesorInterino o ProfesorTitular) es el que porta una variable Profesor. 

Iteramos con la Superclase Abstracta Profesor y Subclase dinámicas ProfesorTitular y ProfesorInterino. 

Dinámicamente se determina de qué tipo es cada objeto y al invocar el método abstracto importeNomina() Java determina si debe utilizar el método propio de un subtipo u otro. 

En imprimirListin llegamos incluso a mostrar por pantalla de qué tipo es cada objeto usando la sentencia instanceof para determinarlo. 
 */
/////////////////////////////////////FIN DE LA CLASE ///////////////////////////////////////////
class TestAbstract {

 public static void main(String[] args) {
  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22);

  ProfesorInterino pi1 = new ProfesorInterino(fecha1, "Jose", "Hernandez Lopez", 45, "45221887-K");
  ProfesorInterino pi2 = new ProfesorInterino(fecha1, "Jose", "Hernandez Lopez", 45, "45221887-K");
  ProfesorInterino pi3 = new ProfesorInterino(fecha1, "Jose", "Hernandez Lopez", 45, "45221887-K");

  ProfesorTitular pt1 = new ProfesorTitular("Juan", "Perez Perez", 23, "73-K");
  ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Mota", 49, "73-K");
  ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa Mota", 49, "81-F");

  ListinProfesores listinProfesores = new ListinProfesores();

  listinProfesores.addProfesor(pi1);
  listinProfesores.addProfesor(pi2);
  listinProfesores.addProfesor(pi3);

  listinProfesores.addProfesor(pt1);
  listinProfesores.addProfesor(pt2);
  listinProfesores.addProfesor(pt3);

  listinProfesores.imprimirListin();

  System.out.println("El importe de las nominas del profesorado que consta en el listin es : "
          + listinProfesores.importeTotalNominaProfesorado() + " euros ");

 }
}
