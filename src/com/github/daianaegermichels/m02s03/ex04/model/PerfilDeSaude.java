package com.github.daianaegermichels.m02s03.ex04.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PerfilDeSaude {

    private String nome;
    private String sobrenome;
    private String sexo;
    private String dtNascimento;
    private String altura;
    private String peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dtNascimento, String altura, String peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public long calculaIdade(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(getDtNascimento(), formato);
        LocalDate dataAtual = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(dataFormatada,dataAtual);
        return idade;
    }

    public long freqCardMax(){
        long freqCardMax = 220 - calculaIdade();
        return freqCardMax;
    }

    public void freqCardAlvo(){
        long inicioIntervalo = (long) (freqCardMax() * 0.5);
        long fimIntervalo = (long) (freqCardMax() * 0.85);
        System.out.printf("Seu intervalo da frequência cardiaca alvo é de: %s - %s  %n", inicioIntervalo, fimIntervalo);
    }

    public double imc(){
        double imc = Double.parseDouble(getPeso()) / Math.pow(Double.parseDouble(getAltura()), 2);
        return imc;
    }
}
