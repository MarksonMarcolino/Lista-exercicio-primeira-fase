
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             System.out.println("Digite em Celcius para temperatura em ºF.");
             float Celcius = input.nextFloat();
             System.out.println("O ºC em ºF é:"+((Celcius*1.8)-32));
    }
    
}
