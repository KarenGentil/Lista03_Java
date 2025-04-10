package lista03;

import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario fixo  do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o numero de carros vendidos do vendedor: ");
        int carrosVendidos = sc.nextInt();

        System.out.println("Digite o valor que ele recebe por carro vendido: ");
        double valorPorCarro = sc.nextDouble();

        System.out.println("Digite o valor total das vendas:");
        double totalVendas = sc.nextDouble();

        double comissaoFixa = carrosVendidos * valorPorCarro;
        double comissaoPercentual = totalVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        System.out.printf("O salario final do vendedor é: R$ %.2f", salarioFinal);

        sc.close();
    }
}
