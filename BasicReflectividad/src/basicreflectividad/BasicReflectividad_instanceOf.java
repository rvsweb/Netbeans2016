/*
Formas de hacer referencia a una clase
Utilizara instaceof tratamiento unico y estatico para cada clase 
Utilizara isIntance(Object) para uno dinamico y aplicable a un conjunto de clases
 */
package basicreflectividad;

/**
 * Operador que devuelve un valor booleano
 *
 * Se ejecuta sobre objetos devolviendo si es de un determinado tipo o no
 *
 * Sintaxis : objeto instanceof nombreClase
 *
 * NombreClase : Persona , String
 *
 * @author TED
 */
public class BasicReflectividad_instanceOf {

 public static void main(String[] args) {

  Persona p = new Persona();
// Mismo funcionamiento isIntance(Object)
  boolean b = p instanceof Persona;

 }
}
