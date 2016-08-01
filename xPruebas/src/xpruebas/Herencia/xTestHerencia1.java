/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Herencia;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=653:ejemplo-de-herencia-en-java-uso-de-palabras-clave-extends-y-super-constructores-con-herencia-cu00686b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xTestHerencia1 {

 public static void main(String[] args) {
  Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", 33);
  profesor1.setIdProfesor("xProf 22-387-11");
  profesor1.mostrarNombreApellidosYCarnet();
  
 }
}
