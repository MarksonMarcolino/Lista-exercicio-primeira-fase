
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio5 {

   
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o seu nome:");
    String nome = entrada.next();
    System.out.println("Informe o seu sexo:");
    char sexo = entrada.next().charAt(0);
    System.out.println("Qual o seu estado civil:");
    String estado = entrada.next();
    switch (sexo) {
        case 'F':
            if (estado.toUpperCase().equals("CASADA")) {
                System.out.println("A qunatos anos está casada: ");
                int tempo = entrada.nextInt();
            }
    }
    
    
    
    }
    
}
