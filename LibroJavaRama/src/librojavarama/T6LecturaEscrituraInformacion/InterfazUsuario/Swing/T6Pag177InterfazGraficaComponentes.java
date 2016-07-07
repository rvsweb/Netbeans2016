package librojavarama.T6LecturaEscrituraInformacion.InterfazUsuario.Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag177InterfazGraficaComponentes {

}

class CrearComponentes {

 public static void main(String[] args) {

  JFrame frame = new JFrame("Ventana");
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  JLabel label = new JLabel("Hello");
  frame.getContentPane().add(label);
  frame.pack();
  frame.setBounds(50, 50, 400, 100);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 }
}
