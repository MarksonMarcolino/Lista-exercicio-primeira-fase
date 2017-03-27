package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String nome = entrada.next();
        System.out.println("Qual seu sexo:'F' feminino, 'M' maculino: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("Qual seu estado civil: ");
        String estado = entrada.next();
        switch (sexo) {
            case 'F':
                if (estado.toUpperCase().equals("CASADA")) {
                    System.out.println("A quantos anos é casada: ");
                    int tempo = entrada.nextInt();
                }

        }

    }

}
