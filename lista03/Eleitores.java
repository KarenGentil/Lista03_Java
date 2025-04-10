package lista03;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero de eleitor: ");
        int eleitores = sc.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        int votosBrancos = sc.nextInt();
        System.out.println("Digite o numero de votos validos: ");
        int votosValidos = sc.nextInt();
        System.out.println("Digite o numero de votos Nulos: ");
        int votosNulos = sc.nextInt();


        int votos = votosBrancos + votosValidos + votosNulos;

        if (votos == eleitores) {
            double porcentagemBranco = ((double)votosBrancos / eleitores) * 100;
            double porcentagemNulo = ((double)votosNulos / eleitores) * 100;
            double porcentagemValido = ((double)votosValidos / eleitores) * 100;

            System.out.println("Votos em branco representam: " + porcentagemBranco + "% dos votos.");
            System.out.println("Votos nulos representam: " + porcentagemNulo + "% dos votos.");
            System.out.println("Votos válidos representam: " + porcentagemValido + "% dos votos.");
        }
        else {
            System.out.println("Aparentemente, seus dados estão incorretos.");


        }


        sc.close();

    }
}
