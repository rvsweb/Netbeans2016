/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3Bucles.EtiquetasContinueBreak;

/**
 *
 * @author Portatil
 */
public class T3UsoEtiquetasContinueBreak {

  public static void main(String[] args) {

    EtiquetaContinue.uso_continue();
    EtiquetaBreak.uso_break();
    EtiquetaBreakContinue.etiquetabreakcontinue();
  }
}

class EtiquetaContinue {

  public static void uso_continue() {

    int i = 0;
    while (i < 10) {
      i++;
      if (i == 5) {
        continue;
      }
      System.out.println(i);
    }
  }
}

class EtiquetaBreak {

  public static void uso_break() {
    int i = 0;
    bucleext:
    while (i < 100) {
      i++;
      for (int j = 0; j < i; j++) {
        System.out.print("*");
        if (i == 5) {
          break bucleext;
        }
      }
      System.out.println("");
    }
    System.out.println("");
  }
}

class EtiquetaBreakContinue {

  public static void etiquetabreakcontinue() {
    int i = 0;
    bucleext:
    while (i < 20) {
      i++;
      for (int k = 1; k < (20 - i); k++) {
        if (i % 2 == 0) {
          continue bucleext;
        }
        System.out.print("_");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
      if (i == 19) {
        break bucleext;
      }
    }
  }

}
