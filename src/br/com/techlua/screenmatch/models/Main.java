package br.com.techlua.screenmatch.models;

import br.com.techlua.screenmatch.calculos.CalculadoraDeTempo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(100);
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
        minhaSerie.exibeFichaTecnica();

        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);

        System.out.println("Total em minutos da Serie: "+minhaSerie.getDuracaoEmMinutos()+" Minutos");
        System.out.println("Tempo necessario para assistir todos os filmes é: "+calculadora.getTempoTotal());
    }
}