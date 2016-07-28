/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum.ClaseEnum;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestClaseEnum {

 public static void main(String[] args) {

//  Llamada a la clase 'enum' donde esta definido el TipoDeMadera2
  TipoDeMadera2 maderaUsuario1 = TipoDeMadera2.ROBLE;
//  Usamos el Objeto maderaUsuario1
  System.out.println("• La madera elegida por el usuario es : " + maderaUsuario1.toString() + "\ncon color " + maderaUsuario1.getColor() + " y con un peso especifico de " + maderaUsuario1.getPesoEspecifico() + "kg/m3");

  System.out.println("• Un palet 2.27 m3 de volumen . \n Peso de los palets de las distintas madera : ");

// Convertimos el objeto maderaUsuario1 en un 'ARRAY' para sacar sus datos mediante metodos
  for (TipoDeMadera2 indice : maderaUsuario1.values()) {
   System.out.println("• " + indice.toString() + " el palet pesa : " + (2.27f * (float) indice.getPesoEspecifico()) + " kg");
  }
 }
}
