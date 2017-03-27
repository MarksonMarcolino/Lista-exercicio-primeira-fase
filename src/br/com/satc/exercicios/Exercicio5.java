
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo, ec, anoscasada;
        System.out.println("Qual é o seu sexo? (feminino ou masculino)");
        sexo = entrada.next();
        System.out.println("Qual é o seu estado civil? (casada ou solteira)");
        ec = entrada.next();
        
        if ((sexo.equals("feminino")) && (ec.equals("casada")))
            System.out.println("Há quanto tempo está casada? (anos)");
            anoscasada = entrada.next();
            System.out.println("Legal!!");
        
            
        
    }
   
                
                
           
       
    }

