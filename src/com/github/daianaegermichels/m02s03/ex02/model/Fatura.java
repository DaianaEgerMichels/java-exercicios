package com.github.daianaegermichels.m02s03.ex02.model;

public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String numero, String descricao, int quantidade, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao(){
        return  descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQuantidade(){
        return  quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getPrecoItem(){
        return  precoItem;
    }

    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }


    public double getValorFatura(){
        if (quantidade < 0){
            setQuantidade(0);
            System.out.println("Quantidade = 0");
        }
        if(precoItem < 0){
            setPrecoItem(0.0);
            System.out.println(" Preço do item = 0.0");
        }

        double valorFatura = getQuantidade() * getPrecoItem();
        return valorFatura;
    }
}
