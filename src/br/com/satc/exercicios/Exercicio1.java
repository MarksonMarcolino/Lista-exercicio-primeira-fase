
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formato= new DecimalFormat();
        double raio, area;
        Scanner ler = new Scanner(System.in);
      System.out.print("Qual o raio do circulo?");
      raio =  ler.nextDouble();
      area =  ((raio*raio)*Math.PI);
      System.out.print("A área do circulo é "+formato.format(area)+ ".");
    }
    
}
