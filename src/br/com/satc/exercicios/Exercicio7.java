
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        if (idade<18){
            System.out.println("Você nao precisa fazer o IMC.");
        }else{
                 System.out.println("Digite qual seu peso: ");
        float peso = input.nextFloat();
            System.out.println("Digite sua altura: ");
            float altura = input.nextFloat();
            System.out.println("Seu IMC é: "+(peso/(altura*altura)));
            
        
                
                }
    }
    
}
