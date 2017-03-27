
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 * @author Maurício
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome=entrada.next();
        System.out.print("Sexo (M) ou (F): ");
        String sexo=entrada.next().toUpperCase();
        char s = sexo.charAt(0);
        System.out.print("Estado civil: ");
        String ecv=entrada.next().toUpperCase();
        
        if ((sexo.equals("F")) && (ecv.equals("CASADA"))){
            System.out.print("Anos de casamento: ");
            int casamento=entrada.nextInt();
            System.out.println("Legal!");
            
        } else
            System.out.println("Legal!");
        
        
    }
    
}
