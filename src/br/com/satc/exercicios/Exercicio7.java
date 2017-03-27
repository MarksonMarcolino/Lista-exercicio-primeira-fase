
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio7 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, h, IMC;
        System.out.println("Qual é o seu peso?");
        peso = entrada.nextFloat();
        System.out.println("Qual é a sua altura (cm)?");
        h = entrada.nextFloat();
        IMC = (peso/(h*h));
        
        if (IMC<18.5) {
            System.out.println("Você está abaixo do peso.");}  
        else if
            ((IMC>18.5) && (IMC<25)) 
            System.out.println("Seu peso está normal.");
        else if
               ((IMC>25) && (IMC<30))
            System.out.println("Você está acima do peso.");
        else 
            System.out.println("Você está obeso.");
                
        
        
        
        
     
        
    
                    
                   
                    
                    
        
        
        
       
        
       
        
       
    }
    
}
