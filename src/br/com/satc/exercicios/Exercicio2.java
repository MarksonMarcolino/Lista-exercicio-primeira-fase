package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Ozie Silveira Junior
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("QUAL A TEMPERATURA EM GRAUS FAHRENHEIT: ");
        float fahr = input.nextFloat();
        System.out.println("A TEMPERATURA EM GRAUS CELSIUS É DE: " + ((fahr - 32) / 1.8) + ".");

    }

}
