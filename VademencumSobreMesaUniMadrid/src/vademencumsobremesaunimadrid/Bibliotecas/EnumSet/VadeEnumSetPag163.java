/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.EnumSet;

import java.util.EnumSet;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
enum Dias {

 Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
}

public class VadeEnumSetPag163 {

 public static void main(String[] args) {

  EnumSet<Dias> todos = EnumSet.allOf(Dias.class);
  EnumSet<Dias> ningun = EnumSet.noneOf(Dias.class);
  EnumSet<Dias> festivos = EnumSet.of(Dias.Sabado, Dias.Domingo);
  EnumSet<Dias> laborales = EnumSet.range(Dias.Lunes, Dias.Viernes);
  EnumSet<Dias> conR = EnumSet.of(Dias.Lunes);
  EnumSet<Dias> conR1 = EnumSet.of(Dias.Martes, Dias.Miercoles, Dias.Viernes);
  EnumSet<Dias> sinR = EnumSet.complementOf(conR1);

  for (Dias dia : laborales) {
   System.out.println(dia);
  }

  System.out.println("EnumSet.allOf : " + todos);
  System.out.println("EnumSet.noneOf : " + ningun);
  System.out.println("EnumSet.range : " + festivos);
  System.out.println("EnumSet.of - conR : " + conR);
  System.out.println("EnumSet.of - conR1 : " + conR1);
  System.out.println("EnumSet.complementOf : " + sinR);

 }
}
