package com.github.daianaegermichels.m02s03.ex04;

import com.github.daianaegermichels.m02s03.ex04.model.PerfilDeSaude;

import java.util.Scanner;

public class HealthApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao HealthApp");
        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe o seu sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.println("Informe o seu sexo:");
        String sexo = entrada.nextLine();
        System.out.println("Informe sua data de nascimento: (dd/mm/aaaa) ");
        String dtNascimento = entrada.nextLine();
        System.out.println("Informe sua altura em metros:");
        String altura = entrada.nextLine();
        System.out.println("Informe seu peso em quilogramas:");
        String peso = entrada.nextLine();

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(nome, sobrenome, sexo, dtNascimento, altura, peso);

        System.out.printf("Olá %s %s , vamos repassar seus dados de saúde  %n", perfilDeSaude.getNome(), perfilDeSaude.getSobrenome());
        System.out.printf("Você é do sexo %s  e nasceu na seguinte data: %s %n", perfilDeSaude.getSexo(), perfilDeSaude.getDtNascimento());
        System.out.printf("Sua altura em metros é de %s  e seu peso em Kg é:  %s %n", perfilDeSaude.getAltura(), perfilDeSaude.getPeso());
        System.out.printf("Você tem %d anos de idade. %n", perfilDeSaude.calculaIdade());
        System.out.printf("Sua frequência cardiaca máxima é de %d. %n", perfilDeSaude.freqCardMax());
        perfilDeSaude.freqCardAlvo();
        System.out.printf("Seu IMC é de %.2f. %n", perfilDeSaude.imc());
    }
}
