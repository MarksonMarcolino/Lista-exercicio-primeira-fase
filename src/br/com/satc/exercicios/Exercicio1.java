package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Oziel
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o raio do circuo: ");
        float raio = input.nextFloat();
        System.out.println("A área do seu circulo é de " + ((raio * raio) * 3.14) + ".");

    }

}
