
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o raio do circulo desejado");
        float raio = entrada.nextInt();
        System.out.println("a area do circulo é "+3.14*(raio*raio));
           
    }
    
}
