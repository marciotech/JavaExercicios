package exerciciosloiane;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double ValorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes");
        double horas = scan.nextDouble();

        double salarioBruto = ValorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("INSS: + inss");
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário líquido: " +salarioLiquido);

    }
}
