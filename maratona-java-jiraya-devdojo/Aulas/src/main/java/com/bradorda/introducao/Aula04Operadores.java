package com.bradorda.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero02-numero01);
        System.out.println(numero02+numero01);
        System.out.println(numero02+numero01+" Valor "+numero02+numero01);

        double resultado = numero01 + numero02;
        System.out.println("Valor: "+resultado);

        double resultado2 = numero01*numero02;
        System.out.println("Valor: "+resultado2);

        double resultado3 = (double) numero01 / numero02;
        System.out.println("Valor: "+resultado3);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == =! return boolean value

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);

        boolean isDezIgualADez = 10 == 10;
        System.out.println("isDezIgualADez: " + isDezIgualADez);

        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);

        // &&(AND) ||(OR) !()
        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorQueTrinta = idade >= 30 && salario >= 4.612;
        boolean isDentroLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroLeiMaiorQueTrinta " + isDentroLeiMaiorQueTrinta);
        System.out.println("isDentroLeiMenorQueTrinta " + isDentroLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorDoPlaystation5 = 5000.0F;

        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorDoPlaystation5 || valorTotalContaPoupanca >= valorDoPlaystation5;

        System.out.println("é compravel? "+isPlaystation5Compravel);


    }
}
