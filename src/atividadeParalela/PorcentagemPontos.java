package atividadeParalela;

public class PorcentagemPontos {
    public static void main(String[]args){

        int pontuacaoMaxima = 500;

        int pontuacaoAtual =423;

        float porcentagemPontuacao = (float) pontuacaoAtual/pontuacaoMaxima*100.0f;

        System.out.println(("Apontuação atual em porcentagem é: "+ porcentagemPontuacao));
    }
}
