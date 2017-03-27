package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Qual seu peso: ");
        double peso = entrada.nextDouble();
        double IMC;
        //IMC = peso / ( altura )2 
        IMC = peso / (altura * altura);
        if (IMC <= 18.5) {
            System.out.println("Seu IMC é " +format.format(IMC)+ ".");          
            System.out.println("Abaixo do peso. ");

        }
        if (IMC <= 25) {
            System.out.println("Seu IMC é " +format.format(IMC)+ ".");
            System.out.println("Peso normal. ");

        }
        if (IMC <= 30) {
            System.out.println("Seu IMC é " +format.format(IMC)+ ".");
            System.out.println("Acima do peso. ");

        }
        if (IMC > 30) {
            System.out.println("Seu IMC é " +format.format(IMC)+ ".");
            System.out.println("Obeso. ");

        }

    }

}
