/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores;

/**
 *
 * @author Portatil
 */
public class T1Main {

    static T1Pag22BasicOperadores t1;

    static {
        t1 = new T1Pag22BasicOperadores();
        t1.a = 55;
        System.out.println("Solo muestra el mensaje");
    }

    public static void main(String[] args) {

        t1 = new T1Pag22BasicOperadores();

        T1Pag22BasicOperadores t2 = new T1Pag22BasicOperadores();

        System.out.println("Soy el byte : " + t1.a);
        System.out.println(t1.millon);
        System.out.println(t1.medio);
        System.out.println("-------------------");
        System.out.println("Soy el byte : " + t2.a);
        System.out.println(t2.millon);
        System.out.println(t2.medio);

        System.out.println("CONSTANTE_FUERZA : ");

        T1Pag23Constantes.a = (int) 123.4f;
        T1Pag23Constantes.m = 30;

        System.out.println(T1Pag23Constantes.CONSTANTE_FUERZA);
        System.out.println(T1Pag23Constantes.CONSTANTE_MENSAJE);
        System.out.println(T1Pag23Constantes.CONSTANTE_CHAR);
        System.out.println(T1Pag23Constantes.obj);

        System.out.println("Tipo de variables");

        T1Pag24TipoVariables t1v = new T1Pag24TipoVariables();
        int n3 = 40, suma = 0;
        suma = T1Pag24TipoVariables.n1 + t1v.n2 + n3;
        System.out.println("Soy la suma \n" + suma);

        System.out.println("Operadores basicos");

        T1Pag25OperadoresBasicos t1ob = new T1Pag25OperadoresBasicos();
        int n4 = t1ob.n1 + t1ob.n2;
        int n4_suma = n4 * n4;
        int n4_suma2 = n4 * n4 + 15;
        int n4_suma3 = n4 / t1ob.n1;
        int n4_suma4 = n4 % t1ob.n2;

        int[] ar = {n4, n4_suma, n4_suma2, n4_suma3, n4_suma4};

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");

    }
}
