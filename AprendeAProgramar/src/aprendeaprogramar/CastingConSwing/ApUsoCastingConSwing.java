/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.CastingConSwing;

import javax.swing.JOptionPane;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=636:conversion-de-tipos-de-datos-en-java-tipado-ejemplos-metodo-valueof-error-inconvertible-types-cu00670b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoCastingConSwing {

}

class Ventana {

 public static void main(String[] args) {

  String entradaUsuario = JOptionPane.showInputDialog("Introduce Num ");
  Integer valorRegreso = Integer.valueOf(entradaUsuario);
  JOptionPane.showMessageDialog(null, valorRegreso * 3);

 }

}
