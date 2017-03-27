
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float temperaturaC;
        System.out.println("Qual é a temperatura em graus Celsius?");
        temperaturaC = entrada.nextFloat();
        float temperaturaF = (float) ((temperaturaC+32)*1.8);
        System.out.println("Essa temperatura em graus Celsius equivale a "
                +temperaturaF+ "em °F");
        
    }
    
}
