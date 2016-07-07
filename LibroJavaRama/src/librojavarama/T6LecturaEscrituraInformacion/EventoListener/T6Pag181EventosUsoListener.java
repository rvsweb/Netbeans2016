package librojavarama.T6LecturaEscrituraInformacion.EventoListener;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag181EventosUsoListener {

}

class SwingTest {

 private static JLabel label = new JLabel("Etiqueta Basica ");
 private static JButton btnlimpia = new JButton("Limpia");
 private static JButton btnescribe = new JButton("Escribe");

 public static void acciones(ActionEvent e) {
  Object obj = e.getSource(); // metodo para saber el objeto que genero el evento
  if (obj == btnlimpia) {
   label.setText("");
  }
  if (obj == btnescribe) {
   label.setText("Hello Friend");
  }
 }

 public static void main(String[] args) {
  try {
   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
   UIManager.getSystemLookAndFeelClassName();
   JFrame frame = new JFrame("Controlando eventos");
   btnlimpia.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
     acciones(e);
    }
   });

   btnescribe.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
     acciones(e);
    }
   });
   frame.getContentPane().add(label);
   frame.getContentPane().add(btnlimpia);
   frame.getContentPane().add(btnescribe);
   frame.setLayout(new GridLayout(0, 1));
   frame.setBounds(550/*coordenada x*/, 550/*coordenada y*/, 400, 100);
   frame.setVisible(true);
   frame.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
     System.exit(0);
    }
   });
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | HeadlessException e) {
   System.out.println("Excepcion " + e.getLocalizedMessage());
  }
 }
}
