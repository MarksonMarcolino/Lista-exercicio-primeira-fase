
package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Maurício
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em ºF: ");
        float temp1 = entrada.nextFloat();
        double temp2 = ((temp1-32)/9)*5;
        DecimalFormat df = new DecimalFormat("0.00 ºC");
        System.out.println("A temperatura em ºC é de: "+df.format(temp2));
        
    }
    
}
