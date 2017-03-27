
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat();
      Scanner ler = new Scanner(System.in);
      double f , c ;
       System.out.println("Qual a temperatura em Fahrenheit que deseja  passar para Celsiu?");
       f = ler.nextDouble();
       c= (f-32)/1.8;
       System.out.println("A temperatura em Celsius é "+form.format(c));
    }
    
}
