package br.com.alura.screenmatch.modelos.calculos;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
