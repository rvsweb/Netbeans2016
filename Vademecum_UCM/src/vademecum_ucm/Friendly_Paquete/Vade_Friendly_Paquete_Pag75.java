/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Friendly_Paquete;

/**
 * @detalle - Ambito de codigo en el que un elemento de Java puede referenciarse
 * por su nombre
 *
 * 'Friendly' cuando no es ni 'public' , 'protected' , 'private' es DE PAQUETE
 *
 * Elementos 'de paquete' pueden referenciarse desde cualqier punto del codigo
 * dentro del mismo paquete en el que se definen
 *
 * @see - 82
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Vade_Friendly_Paquete_Pag75 {

}

/**
 * La clase X puede referenciarse desde cualquier punto del codigo dentro del
 * mismo paquete en el que se define
 *
 * Se pueden definir clases ' de paquete ' dentro de otras clases o en ficheros
 * que contienen algunas otras clases 'publica'
 *
 * - Metodos(argumentos) -> metodo puede referenciarse (ejecutarse) desde
 * cualquier punto del codigo dentro del mismo paquete en el que se define
 *
 * - Metodos -> Se pueden definir metodos 'de paquete' dentro de cualquier clase
 *
 * - Variable -> puede referenciarse(leer o escribir) desde cualquier punto del
 * codigo dentro del mismo paquete en el que se define
 *
 * - Variable -> puede definir variables 'de paquete' como campos de cualquier
 * clase ( Se recomiendan poner varibles 'private' y crear metodos de acceso de
 * lectura como 'get' o escritura 'set'
 *
 *
 * @author Portatil
 */
class X {

 private int x;
 private int y;

 public X() {
  this.x = 0;
  this.y = 0;

 }

 public X(int x, int y) {
  this.x = x;
  this.y = y;
 }

 @Override
 public String toString() {
  return x + " - " + y;
 }

}
