package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor de A: ");
        double A = entrada.nextDouble();
        System.out.println("Qual o valor de B: ");
        double B = entrada.nextDouble();
        System.out.println("Qual o valor de C: ");
        double C = entrada.nextDouble();
        double soma;
        soma = A + B;

        if (soma > C) {
            System.out.println("A soma de A e B é maior que C");
        } else {
            if (soma < C) {
                System.out.println("A soma de A e B é menor que C");
            } else {

            }
            if (soma == C) {
                System.out.println("A soma de A e B é igual a C");
            }
        }

    }

}
