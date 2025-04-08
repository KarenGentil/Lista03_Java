package lista01;

import java.util.Scanner;

public class Quadrado {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int numero1 = sc.nextInt();

        int resultado = numero1 * numero1;

        System.out.println("Resultado: " +resultado);
    }
}
