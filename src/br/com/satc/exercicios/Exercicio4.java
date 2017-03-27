
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 * @author Maurício
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor A: ");
        float a = entrada.nextFloat();
        System.out.print("Digite um valor B: ");
        float b = entrada.nextFloat();
        System.out.print("Digite um valor C: ");
        float c = entrada.nextFloat();
        if (c<a+b) {
            System.out.println(("A soma de ")+a+(" + ")+b+(" é maior que ")+c);
        } else
              if (c==a+b) {
                  System.out.println(("A soma de ")+a+(" + ")+b+(" é igual a ")+c);
              } else {
                  System.out.println(("A soma de ")+a+(" + ")+b+(" é menor que ")+c);
              }
            
            

    }
    
}
