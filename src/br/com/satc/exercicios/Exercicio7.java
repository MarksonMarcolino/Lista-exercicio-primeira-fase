package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Você tem quantos anos? ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Você não precisa calcular o IMC");
        } else {
        System.out.println("Olá, qual sua altura? ");
        float alt = input.nextFloat();
        System.out.println("Olá de novo! Qual seu peso? ");
        float peso = input.nextFloat();

        float IMC;
        IMC = peso/(alt*alt);
            System.out.println("O seu Índice de Massa Corporal (IMC) é de "+ IMC);
        
            if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if ((IMC > 18.5) && (IMC < 25)) {
                System.out.println("Normal");
        } else if ((IMC > 25)&& (IMC < 30)){
                System.out.println("Acima do peso");
        }else if (IMC > 30) {
                System.out.println("BALEIA");
        }
            
         

    }
   }
}


