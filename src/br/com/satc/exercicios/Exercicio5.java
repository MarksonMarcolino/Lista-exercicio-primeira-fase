
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     System.out.println("Qual o Seu nome?");
     String nome = entrada.next();
        System.out.println("Qual seu Genero(M)(F)");
        String gene = entrada.next();
        System.out.println("Qual seu estado Civil ?(S)(C)");
        String es = entrada.next();
        if (gene.toUpperCase().equals("F") && (es.toUpperCase().equals("C"))){ 
            System.out.println("Há quanto tempo voce é casada");
            int temp = entrada.nextInt();
            
        }
    }
}
