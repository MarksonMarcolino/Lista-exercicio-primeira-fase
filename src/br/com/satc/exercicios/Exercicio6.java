package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = input.nextInt();

        if (A==B) {
            int C;
            C=A+B;
            System.out.println("A soma de A e B é "+ C);
            
        }else if (B!=A){
            int C;
            C=A*B;
            System.out.println("A multiplicação de A e B é "+ A*B);
    }
        
    }

}
