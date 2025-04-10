package lista03;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo dos dias vividos: ");
        System.out.println("Digite sua idade expressada em anos: ");
        int ano = sc.nextInt();
        System.out.println("Digite a quantidade de meses que passou do seu último aniversário: ");
        int meses = sc.nextInt();
        System.out.println("Digite a quantidade de dias passados do seu último mesversário :");
        int dias = sc.nextInt();

        int diasVividos = ano*365 +meses*30 + dias;

        System.out.println("Quantidade de dias vividos é: "+diasVividos);

        sc.close();


    }
}
