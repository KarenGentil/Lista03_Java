package lista03;

import java.util.Scanner;

public class Retangulo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int base = sc.nextInt();

        System.out.println("Digite o valor da Area: ");
        int area = sc.nextInt();

        int resultado =  base*area   ;

        System.out.println("O resultado é: "+resultado);
    }
}
