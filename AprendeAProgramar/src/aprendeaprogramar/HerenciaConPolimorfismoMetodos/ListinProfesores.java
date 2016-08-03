/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaConPolimorfismoMetodos;

import java.util.ArrayList;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=662:ejemplo-ejercicio-resuelto-con-polimorfismo-sobreescritura-de-metodos-y-herencia-en-java-codigo-cu00691b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ListinProfesores {

// Atributo de Instancia (Tipo) Profesor Tipo -> ( SuperTipo ) Contiene Subtipos
 private ArrayList<Profesor> listinProfesores;
 private static int i = 1;

 /**
  * Constructor - apunta la variable de referencia al Objeto
  */
 public ListinProfesores() {
  listinProfesores = new ArrayList<Profesor>();
 }

 /**
  * Añade objetos a la lista
  *
  * @param profesor
  */
 public void addProfesor(Profesor profesor) {
  listinProfesores.add(profesor);
 }

 /**
  * Recorre toda la lista de variables de referencia
  */
 public void listar() {
  System.out.println("Se procede a mostrar los datos de los profesores existentes en el listin ");
  for (Profesor tmp : listinProfesores) {
   tmp.mostrarDatos();
   System.out.println("Numero profesor : " + i++);
  }

 }

}
