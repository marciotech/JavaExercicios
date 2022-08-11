package exerciciosloiane;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        //face um programa que peca a temperatura em graus Celsius, transforme e mostre em graus farenheit.

        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + "C é igual a " + f + "F");

    }
}
