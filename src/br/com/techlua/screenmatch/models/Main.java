package br.com.techlua.screenmatch.models;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();

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

        minhaSerie.setNome("Naruto");
        minhaSerie.setDuracaoEmMinutos(55);
        minhaSerie.setNumeroDeEpisodios(240);
        minhaSerie.setNumeroDeTemporadas(8);

        System.out.println("Total em minutos da Serie: "+minhaSerie.getDuracaoEmMinutos()+" Minutos");
    }
}