package atividadeParalela;

import java.util.Scanner;

public class ExemploIFElse {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();

        if (idade<18){
            System.out.println("Não pode beber Gin! ");
        } else {
            System.out.println("BEBAAAAAAAAAAAAAAAAAAAA");
        }
    }
}
