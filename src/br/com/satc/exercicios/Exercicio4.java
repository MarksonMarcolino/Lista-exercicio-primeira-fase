package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Oziel Silveira Junior
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("QUAL O VALOR DE A: ");
        float A = input.nextFloat();
        System.out.println("QUAL O VALOR DE B: ");
        float B = input.nextFloat();
        System.out.println("QUALL O AVLOR DE C: ");
        float C = input.nextFloat();
        float soma;
        soma = A + B;

        if (soma > C) {
            System.out.println("A SOMA DE A+B É MAIOR DOQUE C");
        } 
        else{
            System.out.println("A SOMA DE A+B É MENOR DOQUE C");
            if (soma==C) {
             System.out.println("A SOMA DE A+B É IGUAL A C");   
            }

        }
    }
}
