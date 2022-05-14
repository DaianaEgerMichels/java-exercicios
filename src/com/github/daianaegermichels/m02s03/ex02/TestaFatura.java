package com.github.daianaegermichels.m02s03.ex02;

import com.github.daianaegermichels.m02s03.ex02.model.Fatura;

public class TestaFatura {
    public static void main(String[] args) {

        Fatura testaFatura = new Fatura("01","Primeira Fatura",2,5.00);

        System.out.println(testaFatura.getNumero());
        System.out.println(testaFatura.getDescricao());
        System.out.println(testaFatura.getQuantidade());
        System.out.println(testaFatura.getPrecoItem());
        System.out.println(testaFatura.getValorFatura());

        testaFatura.setNumero("02");
        testaFatura.setDescricao("Segunda Fatura");
        testaFatura.setQuantidade(-1);
        testaFatura.setPrecoItem(2.00);

        System.out.println(testaFatura.getNumero());
        System.out.println(testaFatura.getDescricao());
        System.out.println(testaFatura.getQuantidade());
        System.out.println(testaFatura.getPrecoItem());
        System.out.println(testaFatura.getValorFatura());

        testaFatura.setNumero("03");
        testaFatura.setDescricao("Terceira Fatura");
        testaFatura.setQuantidade(7);
        testaFatura.setPrecoItem(-1.00);

        System.out.println(testaFatura.getNumero());
        System.out.println(testaFatura.getDescricao());
        System.out.println(testaFatura.getQuantidade());
        System.out.println(testaFatura.getPrecoItem());
        System.out.println(testaFatura.getValorFatura());

    }
}
