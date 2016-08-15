/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Herencia.Ocultar;

/**
 * @see - 84
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeHerenciaPag84Ocultar {

}

class Madre {

 public static String getClase() {
  return "clase Madre";
 }

 public String getObjeto() {
  return "objeto de clase Madre";
 }

}

class Hija extends Madre {

 /**
  *
  * @return
  */
 public static String getClase() {
  return "clase Hija";
 }

 /**
  *
  * @return
  */
 @Override
 public String getObjeto() {
  return "objeto de clase Hija";
 }
}

class Madres_Hijas {

 public static void main(String[] args) {
  Madre madre = new Madre();
  System.out.println("--------------------------------------");
  System.out.println("madre.getClase() -> " + madre.getClase()); // metodo STATIC ( Usa Clase No objeto )
  System.out.println("madre.getClase() -> " + Madre.getClase()); // metodo STATIC ( Usa Clase No objeto )
  System.out.println("madre.getObjeto() -> " + madre.getObjeto());

  System.out.println("--------------------------------------");
  Hija hija = new Hija();
  System.out.println("hija.getClase() -> " + hija.getClase());
  System.out.println("hija.getClase() -> " + Hija.getClase());
  System.out.println("hija.getObjeto() -> " + hija.getObjeto());

  System.out.println("------------- UPCASTING ----------------");
//SuperClase          Subclase
  Madre confusa = new Hija();                   // UPCASTING
  System.out.println("confusa.getClase() -> " + Madre.getClase());
  System.out.println("confusa.getClase() -> " + confusa.getClase());
  System.out.println("confusa.getObjeto() -> " + confusa.getObjeto());
  System.out.println("--------------------------------------");

 }
}
