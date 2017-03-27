package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor A:");
        int a = input.nextInt();
        System.out.println("Digite o valor B:");
        int b = input.nextInt();
        if (a == b) {
            int C;
            C = a + b;
            System.out.println("A soma é: " + (C));
        }else{
            int C;
            C = a * b;
            System.out.println("A multiplicação é:" + (C));
                    }

        }

    }

}
