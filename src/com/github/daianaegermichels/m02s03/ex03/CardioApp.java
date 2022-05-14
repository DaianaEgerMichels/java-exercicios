package com.github.daianaegermichels.m02s03.ex03;

import com.github.daianaegermichels.m02s03.ex03.model.FrequenciaCardiaca;

import java.util.Scanner;

public class CardioApp {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao CardioApp");
        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe o seu sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.println("Informe sua data de nascimento: (dd/mm/aaaa) ");
        String dtNascimento = entrada.nextLine();

        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca(nome,sobrenome,dtNascimento);
        long idade = frequenciaCardiaca.calculaIdade();
        System.out.printf( "Idade: %s anos %n", idade);
        long freqCardMax = frequenciaCardiaca.freqCardMax();
        System.out.printf("Frequência cardiaca máxima: %s %n", freqCardMax);
        frequenciaCardiaca.freqCardAlvo();

    }
}
