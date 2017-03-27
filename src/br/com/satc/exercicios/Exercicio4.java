package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual valor de 'A': ");
        double A = entrada.nextDouble();
        System.out.println("Qul o valor de 'B': ");
        double B = entrada.nextDouble();
        System.out.println("Qual o valor de 'C': ");
        double C = entrada.nextDouble();
        double soma;
        soma = A + B;
        if (soma > C) {
            System.out.println("A soma de 'A' e 'B' é maior que 'C'! ");

        } else {
            System.out.println("A soma de 'A' e 'B' não é maior que 'C'!");
        }
        if (soma == C) {
            System.out.println("A soma de 'A' e 'B' é igual que 'C'! ");
        }

    }

}
