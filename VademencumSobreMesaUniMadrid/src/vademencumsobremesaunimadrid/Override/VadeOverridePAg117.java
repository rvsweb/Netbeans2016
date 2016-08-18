/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Override;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeOverridePAg117 {

 /**
  * Anotacion Override
  *
  * @param x
  * @return
  */
 @Override
 public boolean equals(Object x) {
  return false;
 }

// Error pasa desapercibido sin la anotacion @Override : el compilador interpreta que el nuevo metodo no redefine a ningun otro
// public boolean equals(MiObjeto x) {
////  return false;
// }
}
