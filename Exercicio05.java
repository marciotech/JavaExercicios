package exerciciosloiane;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {


        //faca um programa que converta metros para centimentros

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros");
        double metros = scan.nextDouble();

        //1m = 100 cm
        double cm = metros * 100;
        System.out.println(metros +" m é igual a " + cm + " cm ");
    }
}
