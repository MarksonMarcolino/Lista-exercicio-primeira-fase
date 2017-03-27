
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Graus Fahrenheit : ");
        double Fahrenheit = ent.nextDouble();
        
        double celsus;
        
        celsus =  (Fahrenheit-32) / 1.8;
        
        System.out.println("A temperatura em graus Celsus é :"+ celsus);
    }
    
}
