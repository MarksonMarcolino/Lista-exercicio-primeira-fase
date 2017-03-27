
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio2 {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float temperaturaF;
        System.out.println("Qual é a temperatura em graus Fahrenheit?");
        temperaturaF = entrada.nextFloat();
        float temperaturaC = (float) ((temperaturaF-32)/1.8);
        System.out.println("Essa temperatura em graus Fahrenheit equivale a "
                +temperaturaC+ "em °C");
                
                
        
        
    }
    
}
