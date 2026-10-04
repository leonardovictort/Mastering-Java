package com.bradorda.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100_000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        float salarioCast = (float) salarioDouble;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'W';
        char caractereAscii = 87;
        char caractereUni = '\u0041';

        String nome = "Goku";


        System.out.println("A idade é "+idade+ " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("char ascii "+caractereAscii);
        System.out.println("char uni "+caractereUni);
        System.out.println("salario cast "+salarioCast);
        System.out.println("Nome é "+nome);
    }
}
