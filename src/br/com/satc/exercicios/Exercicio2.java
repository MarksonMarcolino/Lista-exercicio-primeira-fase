package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author EuMesmo
 */
public class Exercicio2 {
      
    
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("Digite em Farenite a temperatura em ºC.");
             float Farenite = input.nextFloat();
             System.out.println("O ºF em ºC é:"+((Farenite-32)/1.8));
             
         }
    
}
