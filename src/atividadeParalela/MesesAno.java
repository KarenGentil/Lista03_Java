package atividadeParalela;

import java.util.Scanner;

public class MesesAno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número correspondente ao mês do ano (1-12): ");
        int mesesAno = sc.nextInt();

        if (mesesAno == 1) {
            System.out.println("Janeiro");
        } else if (mesesAno == 2) {
            System.out.println("Fevereiro");
        } else if (mesesAno == 3) {
            System.out.println("Março");
        } else if (mesesAno == 4) {
            System.out.println("Abril");
        } else if (mesesAno == 5) {
            System.out.println("Maio");
        } else if (mesesAno == 6) {
            System.out.println("Junho");
        } else if (mesesAno == 7) {
            System.out.println("Julho");
        } else if (mesesAno == 8) {
            System.out.println("Agosto");
        } else if (mesesAno == 9) {
            System.out.println("Setembro");
        } else if (mesesAno == 10) {
            System.out.println("Outubro");
        } else if (mesesAno == 11) {
            System.out.println("Novembro");
        } else if (mesesAno == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Número inválido! Digite um número entre 1 e 12.");
        }

        sc.close();
    }
}
