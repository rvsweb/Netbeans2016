package librojavarama.T6LecturaEscrituraInformacion.InterfazUsuario.Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag174InterfazGraficaSwingEjemploBasico {

}

class MarcoBasico {

 public static void main(String[] args) {
  JFrame frame = new JFrame("Ventana Hello Friend");
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  JLabel label = new JLabel("Hello Friend");
  frame.getContentPane().add(label);
//  frame.pack(); // Establece el tamaño mas adecuado a todos los componentes 
  frame.setBounds(50, 50, 400, 100);
  frame.setLocationRelativeTo(null); 
  frame.setVisible(true);
 }
}

