
package br.com.satc.exercicios;

import java.util.Scanner;

/*
 * @author Maurício
 */
public class Exercicio1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        float raio = entrada.nextFloat();
        double comprimento= Math.PI*Math.pow(raio, 2);
        System.out.println("A área do círculo é de: "+comprimento);
        
                
    }
    
}
