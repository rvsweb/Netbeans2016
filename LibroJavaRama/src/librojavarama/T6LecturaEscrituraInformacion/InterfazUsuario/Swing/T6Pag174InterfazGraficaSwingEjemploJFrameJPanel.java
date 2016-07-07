package librojavarama.T6LecturaEscrituraInformacion.InterfazUsuario.Swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
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
public class T6Pag174InterfazGraficaSwingEjemploJFrameJPanel {

}

class Marco_Panel_Localizacion {

// ERRONEO : NO SE UTIlIZAR EL PANEL
 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

  JFrame frame = new JFrame("Ventana "); // contenedor
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  JPanel panel = new JPanel(); // contenedor intermedio
  JLabel label = new JLabel("Hello Friend"); // componentes
  JButton boton1 = new JButton("boton basico1"); // componentes
  JButton boton2 = new JButton("boton basico2"); // componentes
  JButton boton3 = new JButton("boton basico3"); // componentes
  frame.setBounds(50, 50, 400, 100);
  frame.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
  frame.getContentPane().add(panel.add(boton1));
  frame.getContentPane().add(panel.add(boton2));
  frame.getContentPane().add(panel.add(boton3));
  frame.getContentPane().add(panel.add(label));
  frame.setLayout(new FlowLayout());
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 }
}
