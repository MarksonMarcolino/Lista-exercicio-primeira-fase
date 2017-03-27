package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe o seu pseo: ");
        double peso = entrada.nextDouble();
        double IMC;
        IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else {

            if ((IMC > 18.5) && (IMC < 25)) {
                System.out.println("Peso normal.");

            } else {
                if ((IMC >= 25) && (IMC <= 30)) {
                    System.out.println("Acima do peso");

                } else {
                    if (IMC > 30) {
                        System.out.println("Obeso");
                    }
                }
            }
        }
    }

}
