/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Igualdad.ObjetosMetodoEquals;

/**
 * @see - 89
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeIgualdadMetodoEqualsPag89 {

}

enum Palo {
 Baston, Copas, Espadas, Oros
}

class Carta {

 private Palo palo;
 private int valor;

 public Carta(Palo palo, int valor) {
  this.palo = palo;
  this.valor = valor;
 }

 /**
  *
  * @param x
  * @return
  */
 @Override                // c2
 public boolean equals(Object x) {
  if (x instanceof Carta) {
   System.out.println("♦ Dime de que clase soy : " + this.getClass().getSimpleName());
  }
  if (x == this) {
   return true;
  }
  if (x == null) {
   return true;
  }
//    c2                c1
  if (x.getClass() != this.getClass()) {
   return false;
  }
  Carta carta = (Carta) x;
//       atributo  == obj creado && atributo   == obj creado  
  return this.palo == carta.palo && this.valor == carta.valor;
 }

 @Override
 public int hashCode() {
  return palo.ordinal() ^ valor;
 }

}

class TestCarta {

 public static void main(String[] args) {
  Carta c1 = new Carta(Palo.Copas, 1);
  Carta c2 = new Carta(Palo.Copas, 1);
  Carta c3 = new Carta(Palo.Copas, 2);

  System.out.println("c1 == c1 -> " + (c1 == c1));
  System.out.println("c1 == c2 -> " + (c1 == c2));
  System.out.println("(c1.equals(c2) -> " + (c1.equals(c2)));
  System.out.println("c1 == c3 -> " + (c1 == c3));
  System.out.println("c1.equals(c3) -> " + (c1.equals(c3)));

 }
}
