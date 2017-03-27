
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     double peso,altura,imc,idade;
     System.out.println("Qual sua idade?");
     idade =ler.nextDouble();
     if (idade>=18){
         System.out.println("Qual a sua altura?");
         altura= ler.nextDouble();
         System.out.println("Qual o seu peso?");
         peso=ler.nextDouble();
         imc=peso/(altura*2);
         if (imc<18.5){
         System.out.println("Voce esta abaio do peso.");
         
     }else if (imc>=18.5){
         System.out.println("Voce esta com o peso normal.");
     }else if (imc>25){
         System.out.print("Voce esta acima do peso.");
     }else if (imc>=30){
         System.out.println("Voce esta obeso.");
     }
     }
     System.out.println("Voce tem que ser maior de idade para fazer esse teste.");
    }
    
}
