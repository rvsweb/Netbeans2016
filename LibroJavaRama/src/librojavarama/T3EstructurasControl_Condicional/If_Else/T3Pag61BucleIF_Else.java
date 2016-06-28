/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Condicional.If_Else;

/**
 *
 * @author Portatil
 */
public class T3Pag61BucleIF_Else {

  public static void main(String[] args) {

    BasicIf_Else.ifelse((int) (Math.random() * 10));

    BasicAnidado.ifelse_anidado(2);
  }
}

class BasicIf_Else {

  public static void ifelse(int valor) {
    int a = valor;
    System.out.println(a);

    if (a == 4) {
      System.out.println("La variable es igual a " + a);
    }
    if (a > 5) {
      System.out.println("La variable es ♠ mayor a 5 = " + a);
    } else {
      System.out.println("La variable es ♠ menor a 5 = " + a);
    }

    if (a > 5) {
      System.out.println("La variable es ♦ mayor a 5 = " + a);
    } else if (a == 5) {
      System.out.println("La variable es ♦ igual a " + a);
    } else {
      System.out.println("La variable es menor a 5 = " + a);
    }
  }
}

class BasicAnidado {

  public static void ifelse_anidado(int... numero) {

    int n[] = {(int) (Math.random() * (1 + 10)), (int) (Math.random() * (1 + 10))};

    System.out.println(
            "valores : " + n[0]);
    System.out.println(
            "valores : " + n[1]);

    numero = n;

//    numero[0] = (int) (Math.random() * 1 + (10));
//    numero[1] = (int) (Math.random() * 1 + (10));
    if (numero[0] >= 5) {
      if (numero[1] >= 5) {
        System.out.println("Enhorabuena");
      } else {
        System.out.println("No has aprobado todas las asignaturas • ");
      }
    } else {
      System.out.println("No has aprobado toda las asignaturas ♦");
    }
  }

}
