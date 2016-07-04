/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Condicional.Switch;

/**
 *
 * @author Portatil
 */
public class T3Pag61BucleSwitch {

  public static void main(String[] args) {

    boolean posicion = Posicion.valorBoolean(2);
    if (posicion == false) {
      System.out.println("soy : " + posicion);
    } else {
      System.out.println("soy : " + posicion);
    }
  }
}

class Posicion {

  public static boolean valorBoolean(int valor) {

    switch (valor) {
      case 0:
        System.out.println(" ♦ : " + valor);
        return true;
      case 1:
        System.out.println(" • : " + valor);
        return false;
      case 2:
        System.out.println("- Soy el 2 y tengo break ");
        break;
      default:
        System.out.println("- Soy default y tengo asignado true ");
        return true;
    }
    return false;
  }
}
