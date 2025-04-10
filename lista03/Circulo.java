package lista03;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f\n", area);

    }
}
