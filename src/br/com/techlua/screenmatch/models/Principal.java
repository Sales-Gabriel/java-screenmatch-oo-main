package br.com.techlua.screenmatch.models;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(numberFormat.format(meuFilme.getMedia()));


    }
}