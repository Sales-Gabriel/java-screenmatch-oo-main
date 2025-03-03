package br.com.techlua.screenmatch.models;

public class Serie extends Titulo {
    private int numeroDeTemporadas;
    private int numeroDeEpisodios;
    private int episodiosPorTemporada;

    @Override
    public int getDuracaoEmMinutos() {
        return super.getDuracaoEmMinutos() * numeroDeTemporadas * numeroDeEpisodios;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}
