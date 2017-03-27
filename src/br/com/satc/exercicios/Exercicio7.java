/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio7 {

    
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
         System.out.println("Digite o seu peso");
           double peso = entrada.nextDouble ();
          System.out.println("Digite o sua altura");
           double altura = entrada.nextDouble (); 
           double imc = peso*(altura*altura);
           if (imc > 18.5 ){
               System.out.println("Voce está abaixo do peso");
             }else{
           
           }if ((imc < 18.5 ) && (imc > 25)){
               System.out.println("Voce está com o Peso normal ");
               }else{
           }if ((imc < 25 ) && (imc > 30)){
           }else{
           }System.out.println("Voce está Acima do Peso");
           
               }
            
            if (imc > 30){
               System.out.println("Voce está Obeso");
               }
           
           
               
                   
         
    }

    private static void and(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
