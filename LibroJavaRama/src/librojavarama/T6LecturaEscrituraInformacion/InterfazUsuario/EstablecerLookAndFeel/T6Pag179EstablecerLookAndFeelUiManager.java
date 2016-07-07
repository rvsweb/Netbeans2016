package librojavarama.T6LecturaEscrituraInformacion.InterfazUsuario.EstablecerLookAndFeel;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag179EstablecerLookAndFeelUiManager {

 public static void main(String[] args) {

  try {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
   e.printStackTrace();
  }
  try {
   UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
   e.printStackTrace();
  }
  try { 
   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
   e.printStackTrace();
  }
  try {
   UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
  }

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
