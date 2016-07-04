/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.SobreescribirMetodos;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T5Pag127SobreescribirMetodos {

}

class Pajaro {

 protected String nombre;
 protected String color;

 public String getDetalles() {
  return "Nombre: " + nombre + " \n " + "Color: " + color;
 }
}

class Loro extends Pajaro {

 protected String pedigri;

 @Override
 public String getDetalles() {
  return "Nombre " + nombre + "\n " + "Color: " + color + " \n " + "pedigri";
 }
}
