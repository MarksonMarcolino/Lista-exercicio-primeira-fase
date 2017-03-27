/*
 A fórmula é IMC = peso / ( altura )2 Elabore um algoritmo que leia o peso e a 
altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso 

 */
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 * @author Maurício
 */
public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula o IMC de um adulto.");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Peso: ");
        float peso=entrada.nextFloat();
        System.out.print("Altura: ");
        float altura=entrada.nextFloat();
        double imc = peso/Math.pow(altura,2);
        if (imc<18.5) {
            System.out.println("Abaixo do peso");  
        } else if ((imc>=18.5) && (imc<=25)) {
            System.out.println("Peso normal");  
        } else if ((imc>=25) && (imc<=30)) {
            System.out.println("Acima do peso");  
        } else if (imc>30) {
            System.out.println("Obeso"); 
        }
            
        
    }
    
}
