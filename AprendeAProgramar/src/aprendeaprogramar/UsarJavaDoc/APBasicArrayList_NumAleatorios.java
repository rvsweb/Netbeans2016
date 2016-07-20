/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsarJavaDoc;

import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y
 * 1000 como se le definen al crear un objeto
 *
 * @author Portatil
 * @version 13/06/2016 see
 * <a href = "http://www.aprenderaprogramar.es/index.php?option=com_content&view=article&id=646:documentar-proyectos-java-con-javadoc-comentarios-simbolos-tags-deprecated-param-etc-cu00680b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188" />
 * aprenderaprogramar.com – Didáctica en programación </a>
 */
public class APBasicArrayList_NumAleatorios {

    /**
     * Objeto de clase
     */
    private ArrayList<Integer> serieAleatoria;

    /**
     * Constructor para la serie de numeros aleatorios
     *
     * @param numeroItems
     */
    public APBasicArrayList_NumAleatorios(int numeroItems) {
        serieAleatoria = new ArrayList<>();
        for (int i = 0; i < numeroItems; i++) {
            serieAleatoria.add(0);
            System.out.println("Serie inicializada : El numero de elementos en la serie es : " + getNumerosItems());
        }
    }

    /**
     * Metodo que devuelve el numero de items (numero aleatorios ) existentes en
     * la serie
     *
     * @return el numero de items (numero aleatorios ) de que consta la serie
     */
    private int getNumerosItems() {
        return serieAleatoria.size();
    }

    /**
     * Metodo que genera la serie de numeros aleatorios
     */
    public void generarSerieDeAleatorios() {
        Random numAleatorio;
        numAleatorio = new Random();
        for (int i = 0; i < serieAleatoria.size(); i++) {
            serieAleatoria.set(i, numAleatorio.nextInt(1000));
        }
        System.out.println("Serie generada");
    }

    public static void main(String[] args) {

        APBasicArrayList_NumAleatorios p = new APBasicArrayList_NumAleatorios(5);
        p.generarSerieDeAleatorios();
    }
}
