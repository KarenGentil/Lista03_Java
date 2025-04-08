package lista01;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do circulo: ");
        double raio =sc.nextDouble();

        double perimetro = 2 * Math.PI* raio;

        System.out.println("O Cálculo de Perímetro de um Círculo é: " +perimetro);

        sc.close();
    }
}
