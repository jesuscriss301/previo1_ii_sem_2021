/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis_algoritmo;

import java.util.Scanner;

/**
 *
 * @author COLOQUE ACÁ SUS NOMBRES COMPLETOS
 */
public class Previo1 {

    public static void main(String[] args) {
        char vectorFizzBuzz[] = leerCodigoFizz();
        imprimirVector(vectorFizzBuzz);
        System.out.println("El código fizzBuzz es:" + getNumeroFizzBuzzz(vectorFizzBuzz));
        
    }

    private static long getNumeroFizzBuzzz(char[] vectorFizzBuzz) {

        return 0;
    }

    /**
     * **************************************************************
     */
    /**
     * *******************METODOS DE AYUDA PARA LECUTURA DE DATOS*******************************************
     */
    /**
     * *******************NO DEBEN SER MODIFICADOS******************
     */
    /**
     * **************************************************************
     */
    /**
     * Esté método lee la cadena, NO HAY QUE CALCULARLE SU COSTO
     *
     * @return un vector de char con un código fizz buzz
     */
    private static char[] leerCodigoFizz() {
        Scanner in = new Scanner(System.in);
        limpiar();
        System.out.println("Por favor digite una cadena de fizzbuzz:");
        String cadena = in.nextLine().toLowerCase();
        return cadena.toCharArray();
    }

    private static void imprimirVector(char v[]) {
        limpiar();
        System.out.println("Vector de códigos:");
        for (char dato : v) {
            System.out.print(dato + "\t");
        }
        System.out.println("");
    }

    private static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
