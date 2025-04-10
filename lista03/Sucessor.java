package lista03;

import java.util.Scanner;

public class Sucessor {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        int resultado = ++valor;

        System.out.println("O sucessor é: " +resultado);

    }

}
