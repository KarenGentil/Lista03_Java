package lista03;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado : ");
        int lado = sc.nextInt();
        int resultado = lado*2;

        System.out.println("as dimensões de um quadrado é: " +resultado);

    }

}
