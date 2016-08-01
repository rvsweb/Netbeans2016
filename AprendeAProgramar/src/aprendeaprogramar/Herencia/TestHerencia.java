/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Herencia;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=654:ejercicio-resuelto-ejemplo-de-herencia-simple-extends-y-super-en-java-constructores-con-herencia-cu00687b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestHerencia {

 public static void main(String[] args) {
  Profesor2 profesor2 = new Profesor2("Juan", "Hernandez", 33);
  profesor2.setIdProfesor("Prof 22-387-11");
  profesor2.mostrarNombreApellidosYCarnet();

 }
}
