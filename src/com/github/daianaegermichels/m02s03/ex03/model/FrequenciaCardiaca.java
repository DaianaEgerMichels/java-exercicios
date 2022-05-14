package com.github.daianaegermichels.m02s03.ex03.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private String dtNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, String dtNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
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

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
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
        System.out.printf("Intervalo da frequência cardiaca alvo: %s - %s  %n", inicioIntervalo, fimIntervalo);
    }

}
