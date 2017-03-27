
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat();
      Scanner ler = new Scanner(System.in);
      double f , c ;
       System.out.println("Qual a temperatura em Celsius que deseja  passar para Fahrenheit?");
       c = ler.nextDouble();
       f= (c*1.8)+32;
       System.out.println("A temperatura em Fahrenheit é "+form.format(f));
    }
    
}
