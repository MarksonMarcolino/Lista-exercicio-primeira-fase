
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("R$0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o raio do círculo: ");
        double raio = entrada.nextDouble();
        double area;
        area = (raio*raio)*3.14;
        System.out.println("A área total é "+ area);
        
         
    }
    
}
