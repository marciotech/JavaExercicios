package exerciciosloiane;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //faca um programa que peca o tamanho  de um arquivo para dowload (em MD) e a velocidade de um link de Internet(em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link ( em minutos ).

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de dowload: " + tempo);
    }
}
