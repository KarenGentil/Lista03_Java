package lista03;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32)* 5/9;

        System.out.println("Celsius: " + celsius);

        sc.close();
    }
}
