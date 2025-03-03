package br.com.techlua.screenmatch.calculos;

import br.com.techlua.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
