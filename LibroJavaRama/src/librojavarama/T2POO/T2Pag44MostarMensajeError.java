/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

/**
 *
 * @author Portatil
 */
public class T2Pag44MostarMensajeError {

//    static int cc = 0;
    public static void main(String[] args) {

        int a = 10, b = 0, c;
        try {
            c = a / b;

        } catch (ArithmeticException e) {
            System.err.println("Error : " + e.getMessage());
            return; // Esta devolviendo el valor de c 
        }
        System.out.println("Resultado : " + c);

    }
}
