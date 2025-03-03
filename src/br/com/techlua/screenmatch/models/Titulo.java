package br.com.techlua.screenmatch.models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Duração do Filme: " + this.duracaoEmMinutos);
    }

    public void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double getMedia(){
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
}
