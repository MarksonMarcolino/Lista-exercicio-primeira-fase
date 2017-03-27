
package br.com.satc.exercicios;

import java.util.Scanner;

public class tempoCasado5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         System.out.println("Qual o seu sexo? "); 
          char sx= entrada.next().charAt(0);
            System.out.println("Qual seu estado civil? ");
             char ec= entrada.next().charAt(0);
              if(sx=='H'){
                  System.out.println("beleza fera.");
              } else if ((sx=='F') && (ec=='C')) {
                  System.out.println("A quanto tempo voce é casada?");
                   String anos = entrada.next();
                    System.out.println("Sofrendo a "+anos + " anos legal" );
              }        
            
        
  }
}