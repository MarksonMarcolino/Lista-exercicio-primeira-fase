
package br.com.satc.exercicios;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        System.out.println("Qual sua idade? ");
         float idade= entrada.nextFloat();
          if (idade<12){
              System.out.println("Voce é muito novo.");
          }
         System.out.println("Qual sua altura? ");
            float H= entrada.nextFloat();
                System.out.println("Qual o seu peso? ");
                    float P= entrada.nextFloat();
            float IMC == (P*(H*H));
            if (IMC < 18.5) {
                System.out.println("Voce está abaixo do peso ideal.");
                        
      }else if IMC <25 {
                System.out.println("Seu peso está normal.");
      } else if IMC < 30 {
                System.out.println("Acima do peso.");
                
      } else if IMC > 30{
                System.out.println("Voce está obeso.");
      }
    
}
}
