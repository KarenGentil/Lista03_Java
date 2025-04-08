package lista01;

import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero01 =sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int numero2 =sc.nextInt();

        int resultado = numero01 * numero2;

        System.out.println("O resultado é: " +resultado);
        sc.close();
    }
}
