package lista03;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario atual: ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Digite o valor do percentual de reajuste (%): ");
        double percentualReajuste = sc.nextDouble();

        double salario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.printf("O novo salário do funcionário é: R$ %.2f%n",  salario);

        sc.close();
    }
}
