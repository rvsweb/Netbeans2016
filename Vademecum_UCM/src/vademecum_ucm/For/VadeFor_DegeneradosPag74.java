/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_DegeneradosPag74 {

 public static void main(String[] args) {

  /**
   * for ( ; condicion ; actualizacion)
   */
  System.out.println("------------ for (NO INICIALIZACION; i < 10; i++) ------------------");
  int i = 0;
  for (/*No INICIALIZACION*/; i < 10; i++) {
   System.out.println("• Variable externa :  " + i);
  }

  System.out.println("♦ La condicion de terminacion es interna tipicamente con un 'break' o un 'return' ");
  /**
   * for ( inicializacion ; ; actualizacion )
   */
  System.out.println("------------ for (int j = 0; NO CONDICION; j++) ");
  for (int j = 0; /*No CONDICION*/; j++) {
   System.out.println("• Sin condicion : " + j);
   if (j == 10) {
//    return; // DETIENE EL FLUJO DE EJECUCION : NO PERMITE MAS CODIGO POR ABAJO
    break; // DETIENE EL FLUJO DE EJECUCION : PERMITE QUE SIGA EJECUTANDOSE MAS CODIGO POR DEBAJO del BREAK
   }
  }
  System.out.println("----------- for (int j = 0; j < 10; NO INCREMENTO) -------------------");

  /**
   * for ( inicializacion ; condicion ; )
   */
  for (int j = 0; j < 10;) {
   System.out.println("• Sin incremento : " + ++j);
  }
  System.out.println("------------ for (;;) ------------------");

  /**
   * for (;;)
   */
  int fi = 0;
  for (;;) {
   System.out.println(" -> " + ++fi);
   if (fi == 10) {
    break;
   }
  }
 }
}
