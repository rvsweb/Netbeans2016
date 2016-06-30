package librojavarama.T5ClasesAvanzadas.ClasesAbstractas.UpCastingDownCastingMetodoAvanzados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static librojavarama.T5ClasesAvanzadas.ClasesAbstractas.UpCastingDownCastingMetodoAvanzados.Circulo.jerarquia;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag134ClaseExternaClaseStaticAnidadasClaseInternas {

}

class LanzarPrograma {

 public static void main(String[] args) {

  Reloj miReloj = new Reloj("3000", true);

 }
}

class Reloj {

 private String intervalo;
 private boolean sonido;

 public Reloj(String intervalo, boolean sonido) {
  this.intervalo = intervalo;
  this.sonido = sonido;
 }

 public void enMarcha() {
  ActionListener oyente = (ActionListener) new Timer(intervalo, sonido);
 }

 private class DameLaHora2 implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent evento) {
   Date ahora = new Date();
   System.out.println("Tengo la hora " + ahora);
  }

 }
}
