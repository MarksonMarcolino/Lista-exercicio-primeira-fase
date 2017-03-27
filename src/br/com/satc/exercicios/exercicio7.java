package br.com.satc.exercicios;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Digite o seu Peso : ");
        float peso = a.nextFloat();

        System.out.println("Digite o valor da sua altura: ");
        float altura = a.nextFloat();

        float IMC;

        IMC = peso / (altura * 2);

        if (IMC < 18.5) {
            System.out.println("Você esta abaixo do Peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Você esta Peso Normal ");

        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Você esta Peso Normal ");
        }

    }

}
