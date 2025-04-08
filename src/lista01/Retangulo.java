package lista01;

import java.util.Scanner;

public class Retangulo {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        float altura =sc.nextFloat();

        System.out.println("Digite a largura do Retângulo: ");
        float largura =sc.nextFloat();

        float resultado = altura * largura;

        System.out.println("Cálculo da Área do Retângulo é: " +resultado);
    }
}
