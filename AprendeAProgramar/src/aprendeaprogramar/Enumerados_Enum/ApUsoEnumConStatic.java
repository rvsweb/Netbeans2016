/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum;

import java.util.Arrays;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoEnumConStatic {

 public static void main(String[] args) {
//  Vehiculo.tipoVehiculoPublic.FORD.toString();
//  Vehiculo.tipoVehiculoPublic.TOYOTA.toString();
//  Vehiculo.tipoVehiculoPublic.SUZUKI.toString();
//  Vehiculo.tipoVehiculoPublic.RENAULT.toString();
//  Vehiculo.tipoVehiculoPublic.SEAT.toString();

  for (int i = 0; i < 1; i++) {
   System.out.println("Pasar Enum a Array de String : \n " + Arrays.toString(Vehiculo.tipoVehiculoPublic.values()));
   System.out.println("Numero de vehiculos : " + Vehiculo.tipoVehiculoPublic.values().length);
  }

 }
}

class Vehiculo {

 /**
  * Usamos este
  */
 public static enum tipoVehiculoPublic {
  FORD, TOYOTA, SUZUKI, RENAULT, SEAT
 };

 private enum tipoVehiculoPrivate {
  FORD, TOYOTA, SUZUKI, RENAULT, SEAT
 };

}
