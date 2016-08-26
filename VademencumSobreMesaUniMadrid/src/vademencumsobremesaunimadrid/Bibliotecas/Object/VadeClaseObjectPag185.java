/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Object;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeClaseObjectPag185 {

 /**
  *
  * @return
  */
// @Override
// public final native Class getClass();
// 
//
 /**
  *
  * @return un hashCode para el objeto en ejecucion
  */
 @Override
 public native int hashCode();

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final VadeClaseObjectPag185 other = (VadeClaseObjectPag185) obj;
  return true;
 }

 /**
  *
  * @param obj
  * @return true si este 'objeto' es igual al pasado como argumento
  */
// @Override
// public boolean equals(Object obj){
//  return this == obj;
// }
// 
 /**
  *
  * @return una representacion textual del objeto
  */
 @Override
 public String toString() {
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
 }
}
