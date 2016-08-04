/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.HerenciaConPolimorfismoMetodos;

import java.util.Calendar;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=662:ejemplo-ejercicio-resuelto-con-polimorfismo-sobreescritura-de-metodos-y-herencia-en-java-codigo-cu00691b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestHerencia4 {

 public static void main(String[] args) {
  ListinProfesores listin1 = new ListinProfesores();
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("Prof 22-387-11");
  Calendar fecha1 = Calendar.getInstance();
  fecha1.set(2019, 10, 22);

  ProfesorInterino interino1 = new ProfesorInterino("Jose Luis", "Morales Perez", 54, fecha1);
  listin1.addProfesor(profesor1);
  listin1.addProfesor(interino1);
  listin1.listar();

 }
}
