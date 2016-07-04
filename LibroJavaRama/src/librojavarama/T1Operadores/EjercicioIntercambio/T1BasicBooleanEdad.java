/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores.EjercicioIntercambio;

/**
 *
 * @author Portatil
 */
public class T1BasicBooleanEdad {

    public static boolean jasp(int edad, String nivel, int ingreso) {
        boolean jasp = true;
        boolean valor_edad = edad >= 18;
        boolean valor_nivel = nivel == "3";
        boolean valor_ingreso = ingreso < 28000;
        jasp = valor_edad && valor_nivel && valor_ingreso;
        return jasp;
    }

    public static void main(String[] args) {

        System.out.println(jasp(32, "3", 10000));

        int edad = (int) (Math.random() * 60);
        int nivel_estudios = (int) (Math.random() * 3 + 1);
        int ingresos = (int) (Math.random() * 300000);

        System.out.println(edad);
        System.out.println(nivel_estudios);
        System.out.println(ingresos);

        boolean jasp_libro = (edad >= 18) && (nivel_estudios == 3) && (ingresos > 20000);

        System.out.println("Es Jasp : " + jasp_libro);
    }
}
