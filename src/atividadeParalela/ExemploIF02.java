package atividadeParalela;

import java.util.Scanner;

public class ExemploIF02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor");
    int numero = sc.nextInt();

    if (numero>=18){
        System.out.println("Você pode dirigir!");
    }
    else {
        System.out.println("Você não pode dirigir!");

    }
    }
}
