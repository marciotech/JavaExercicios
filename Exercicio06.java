package exerciciosloiane;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        //faca um programa que peca o raio de um circulo, calcule e mostre sua área

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do circulo é: " + area);
    }
}
