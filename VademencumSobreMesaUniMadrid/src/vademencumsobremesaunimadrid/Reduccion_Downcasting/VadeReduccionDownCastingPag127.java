/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Reduccion_Downcasting;

/**
 * @see - 127
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeReduccionDownCastingPag127 {

 public static void main(String[] args) {

 }
}

/**
 * Conversion forzada de valores de tipos primitivos
 *
 * Contrario a la promocion , convirtiendo de un formato 'mas rico' en un
 * formato 'mas pobre'
 *
 * DownCasting de tipos Primitivos
 *
 * @author remoto
 */
class DownCasting {

 /**
  * Al contrario de Promocion : Compilador se niega a reducir valores salvo que
  * se le ordene explicitamente
  *
  * @param args
  */
 public static void main(String[] args) {
//  byte <- short <- int <- long <- double
//  char <- int <- long <- float <- double

// CONVERSION HACIA ABAJO DE TIPOS PRIMITIVOS
  int x = (int) 3.5; // 'x' carga el valor 3

//•  Cuando un valor real se reduce a un valor entero , nos quedamos 
//  exclusivamente con la parte entera , sin realizar ningun tipo de redondeo
//  
//•  Si el formato destino de la conversion es incapaz de contener el valor , el 
//  resultado es imprevisible 
 }
}
