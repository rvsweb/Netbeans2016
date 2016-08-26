/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Switch;

/**
 * @see - 163
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSwitchPag138 {

 public void setSwitch() {
  int mes = (int) (Math.random() * (1 + 13));
  switch (mes) {

   case 1:
    System.out.println(mes);
    break;
   case 2:
    System.out.println(mes);
    break;
   case 3:
    System.out.println(mes);
    break;
   case 4:
    System.out.println(mes);
    break;
   case 5:
    System.out.println(mes);
    break;
   case 6:
    System.out.println(mes);
    break;
   case 7:
    System.out.println(mes);
    break;
   case 8:
    System.out.println(mes);
    break;
   case 9:
    System.out.println(mes);
    break;
   case 10:
    System.out.println(mes);
    break;
   case 11:
    System.out.println(mes);
    break;
   case 12:
    System.out.println(mes);
    break;
   default:
    System.out.println(mes);
    break;
  }
 }

 /**
  * Solo funcionan sobre enteros , boolean , caracteres
  *
  * Chequean que no hay duplicados ( condiciones excluyentes )
  *
  * Mejor legibilidad
  *
  * Sin 'break' el programa no saltaria al final
  *
  * El 'default' es opcional , si no aparece , no se ejecuta nada
  *
  * 'break' provocan la terminacion de la sentencia condicional
  *
  * Si no se aperece , el codigo siguiente se sigue ejecutando
  *
  * @param args
  */
 public static void main(String[] args) {

  int m = Integer.parseInt(args[0]);
  int n = 0;
  switch (m) {
   case 0:
    n++;
   case 1:
    n++;
   case 2:
    n++;
   default:
    n++;
  }
  System.out.println(" n = " + n);
 }
}
