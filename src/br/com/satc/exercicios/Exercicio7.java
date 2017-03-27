package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Oziel Silveira Junior
 */
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("QUAL A SUA ALTURA: ");
        float h = input.nextFloat();
        System.out.println("QUAL O SEU PESO: ");
        float peso = input.nextFloat();
        float imc;
        imc= peso/(h*2);
        if (imc < 18.5 ){
            System.out.println("VOCÊ ESTA ABAIXO DO PESO");
            }if (imc < 25){
                System.out.println("VOCÊ ESTA NO PESO IDEAL");
                }if (imc<30){
                    System.out.println("VOCÊ ESTA ACIMA DO PESO");
                }else{
                    System.out.println("VOCÊ ESTA OBESO");
                }
            
        
        
        
        
        

    }

}
