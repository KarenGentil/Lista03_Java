package lista01;

import java.util.Scanner;

public class DivisaoResto {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero1 =sc.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 =sc.nextInt();

        int resultado = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("O resultado é " +resultado);

        System.out.println("O resto é: " +resto);

    }
}
