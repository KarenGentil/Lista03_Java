package lista01;

import java.util.Scanner;

public class Media {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do 1° semestre: ");
        float numero1 =sc.nextFloat();

        System.out.println("Digite a nota do 2° semestre: ");
        float numero2 =sc.nextFloat();

        System.out.println("Digite a nota do 3° semestre: ");
        float numero3 =sc.nextFloat();

        float resultado = (numero1 + numero2 + numero3) /3;

        System.out.println("O valor da sua média é: " +resultado);
    }
}
