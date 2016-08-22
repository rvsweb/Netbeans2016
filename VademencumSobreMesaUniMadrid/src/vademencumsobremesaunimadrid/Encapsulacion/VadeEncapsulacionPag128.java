/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Encapsulacion;

/**
 * @see 147
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeEncapsulacionPag128 {

}

/**
 * Consiste en sustituir campos public por private y acceder por medio de
 * metodos public
 *
 * @author remoto
 */
class Encapsulacion {

 private String nombre;

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

}

/**
 * Una expresion imbuida en una expresion mas grande puede extraerse para
 * aclarar el significado de la sub_expresion
 *
 * Para ello se introducen variables auxiliares
 *
 * @author remoto
 */
class IntroduccionVariableExplicativas {

}

/**
 * Refactoring : variable Explicativas
 *
 * @author remoto
 */
class VariableExplicativas {

 /**
  * Metodo en una sola linea
  *
  * @param anio
  * @return
  */
 public boolean bisiesto(int anio) {
  return ((anio % 4 == 0) && (!(anio % 100 == 0)) || (anio % 400 == 0));
 }

 /**
  * Descomponemos la expresion booleana en expresiones mas sencillas y
  * explicativas
  *
  * @param anio
  * @return
  */
 public boolean bisiesto2(int anio) {
  boolean multiplo4 = (4 / anio == 0);
  boolean multiplo100 = (100 / anio == 0);
  boolean multiplo400 = (400 / anio == 0);
  return (multiplo4 && (!multiplo100)) || multiplo400;
 }
 
 

}
