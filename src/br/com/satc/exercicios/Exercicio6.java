package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor do A: ");
        double A = entrada.nextDouble();
        System.out.println("Qual o valor do B: ");
        double B = entrada.nextDouble();
        double soma ;
        double mult ;

        if (A == B) {
            soma = A + B;
            System.out.println("A soma de A e B é "+soma);
        } else {
            mult = A * B;
            System.out.println("A multiplicação de A e B é "+mult);
        }
    }

}
