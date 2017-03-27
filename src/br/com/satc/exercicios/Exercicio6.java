package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor de 'A': ");
        int A = entrada.nextInt();
        System.out.println("Qual o valor de 'B': ");
        int B = entrada.nextInt();
        if (A == B) {
            int C;
            C = A + B;
            System.out.println("O valor da soma é " + C + ".");

        } else {
            int C;
            C = A * B;
            System.out.println("O valor da multiplicação é " + C + '.');

        }
    }

}
