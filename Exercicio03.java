package exerciciosloiane;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        // faca um programa que peca dois numero e imprima a soma

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();


        System.out.println("Entre com o segundo numero:");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("A soma dos números é: " + resultado);



    }
}
