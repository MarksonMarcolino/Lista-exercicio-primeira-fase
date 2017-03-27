
package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio5 {

    public static void main(String[] args) {
      
        Scanner a = new Scanner(System.in);
          
           System.out.println("Digite o seu nome : ");
           String nome = a.next();
        
           System.out.println("Digite o seu genero : *** femenino(F),masculino (m)");
           char sexo = a.next().charAt(0);
           
           System.out.println("Digite o seu estado civil : ");
           String estado = a.next();
           
           if(estado.toUpperCase().equals("CASADA") && (sexo == 'f' || sexo == 'S')){
               System.out.println("Você é casada ");
               
               System.out.println("Quantos anos de casada você tem ? ");
               int anos = a.nextInt();
           }
    }
    
}
