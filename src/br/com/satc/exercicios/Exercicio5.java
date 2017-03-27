package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = input.next();
        System.out.println("Qual seu sexo? (F ou M)");
        String decisao = input.next();
        System.out.println("Qual o seu estado civil? (S ou C)"
                + "(C) Casada"
                + "(S) Solteiro");
        String decisao2 = input.next();
        if (decisao.toUpperCase().equals("F") && (decisao2.toUpperCase().equals("C"))) 
            System.out.println("Há quanto tempo você é casada?");
        int temp = input.nextInt();
        }
    
        
    }
    

