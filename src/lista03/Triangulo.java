package lista03;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int base =sc.nextInt();

        System.out.println("Digite o valor da altura : ");
        int altura  =sc.nextInt();

        int resultado = (base*altura )/2;

        System.out.println("O resultado é: "+ resultado);

    }
}
