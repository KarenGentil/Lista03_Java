package lista03;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double percentualDistribuidor = 28.0;
        double percentualImposto = 45.0;

        double valorDistribuidor = custoFabrica * percentualDistribuidor / 100;
        double valorImposto = custoFabrica * percentualImposto / 100;

        double custoFinal = custoFabrica + valorDistribuidor + valorImposto;

        System.out.printf("O custo final ao consumidor é: R$ %.2f", custoFinal);

        sc.close();
    }
}
