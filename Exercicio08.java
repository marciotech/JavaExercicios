package exerciciosloiane;

import java.util.Scanner;









public class Exercicio08 {

    public static void main(String[] args) {
        //faca um programa que pergunte quanto voce ganha por hora e o número de horas trabalhadas no mes. Calcule e mostre o total do seu salário no referido mes.


        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double ValorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes");
        double horas = scan.nextDouble();

        double salario = ValorHora * horas;

        System.out.println("O salario é de: " + salario);


    }
}
