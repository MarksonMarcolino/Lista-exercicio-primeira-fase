package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso : ");
        double peso = entrada.nextDouble();
        System.out.println("Digite sua altura : ");
        double altura = entrada.nextDouble();
        double imc = (peso/(altura*altura));
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        
        }else{
            if ((imc > 18.5) && (imc < 25)){
                System.out.println("Você está no peso ideal.");
        
        }else{
                if ((imc > 25)&&(imc < 30)){
                    System.out.println("Você está acima do peso.");
                
                
                }else{
                   if (imc>30) {
                       System.out.println("Você está obeso.");
                   
                   }
                
                }
            
            
            }
        
        }
        
        
   
    
    
    }
    
}
