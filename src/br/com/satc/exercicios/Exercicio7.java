
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual sua idade ?");
        int idade = entrada.nextInt();
        System.out.println("Qual sua altura ?");
        float alt = entrada.nextFloat();
        System.out.println("Qual seu peso ?");
        float peso = entrada.nextInt();
        float imc;
        imc= peso/(alt*alt);
        if (idade >18) {   
            System.out.println("Seu Imc deu "+imc );
        }
        if (imc<18.5){
            System.out.println("Voce está abaixo do Peso");
        }
        else if ((imc>=18.5) && (imc <25)){
        System.out.println("Voce está no peso ideal");
    }
        else if ((imc>25)&&(imc<=30)){
            System.out.println("Voce está acima do peso");
        }
        else if (imc>30){
            System.out.println("Voce está obeso");
        }
    }
  
}
