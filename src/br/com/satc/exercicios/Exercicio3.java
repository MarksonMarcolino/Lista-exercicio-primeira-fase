
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Maurício
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em ºC: ");
        double temp1 = entrada.nextFloat();
        double temp2 = ((temp1/5)*9)+32;
        DecimalFormat df = new DecimalFormat("0.00 ºF");
        System.out.println("A temperatura em ºF é de: "+df.format(temp2));
    }
    
}
