package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Oziel Silveira Junior
 */
public class Exercicios6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("QUAL O VALOR DE A: ");
        float A = input.nextFloat();
        System.out.println("QUAL O VALOR DE B: ");
        float B = input.nextFloat();
        float C;
        if (A == B) {
            C = A + B;
            System.out.println("A SOMA DOS VALORES IGUAIS É DE: " + C);
        } else {
            C = A * B;
            System.out.println("A MULTIPLICAÇÃO DOS VALORES IGUAIS É DE: " + C);

        }
    }
}
