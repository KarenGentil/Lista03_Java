package atividadeParalela;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero correspondente ao dia da semana: ");
        int diadaSemana = sc.nextInt();

        if (diadaSemana == 1) {
            System.out.println("Hoje é Domingo");
        } else if (diadaSemana == 2) {
            System.out.println("Hoje é Segunda-Feira");
        } else if (diadaSemana == 3) {
            System.out.println("Hoje é Terça-Feira");
        } else if (diadaSemana == 4) {
            System.out.println("Hoje é Quarta-Feira");
        } else if (diadaSemana == 5) {
            System.out.println("Hoje é Quinta-Feira");
        } else if (diadaSemana == 6) {
            System.out.println("Hoje é Sexta-Feira");
        } else if (diadaSemana == 7) {
            System.out.println("Hoje é sabado-Feira");
        } else {
            System.out.println("Não há dia correspondente!");
        }sc.close();
    }
}
