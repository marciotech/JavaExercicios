package exerciciosloiane;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte formula:
        //(72.7*altura) - 58

        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);


    }
}
