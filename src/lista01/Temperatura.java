package lista01;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em fahrenheit é: " +fahrenheit);

    }
}
