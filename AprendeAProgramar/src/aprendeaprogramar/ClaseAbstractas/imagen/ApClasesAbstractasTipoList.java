/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseAbstractas.imagen;

import java.util.AbstractList;
import java.util.Vector;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApClasesAbstractasTipoList {

 public static void main(String[] args) {

  AbstractList<Integer> abl = new AbstractList<Integer>() {
   @Override
   public Integer get(int index) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int size() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
  };

  /**
   * Obsoleta Collection
   */
  Vector<String> v = new Vector<String>();
  int cantidad = v.capacity();
  System.out.println(" nº -  " + cantidad);

  abl.get(2);
 }
}
