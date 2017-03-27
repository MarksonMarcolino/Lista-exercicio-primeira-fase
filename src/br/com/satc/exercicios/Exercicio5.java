package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String  nome = entrada.next();
        System.out.println("Digite seu sexo (F:feminino M:masculino) : ");
        char sexo = entrada.next().charAt(0);
        System.out.println("Digite seu estado civil :");
        String civil = entrada.next(); 
        switch (sexo){
            case 'F': { if (civil.toUpperCase().equals("CASADA")){
           System.out.println("Digite o seu tempo de casada(anos) : ");
           int tempo = entrada.nextInt();
           
                
            }
            
            
        }
        
        
        
        }
       
        
        
        
     }
    
}
