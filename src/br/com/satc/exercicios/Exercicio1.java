package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Qual o raio do circulo? ");
        float raio = input.nextFloat();
        System.out.println("A área do circulo é de "+ 3.14*(raio*raio));
        
    }
    
}
