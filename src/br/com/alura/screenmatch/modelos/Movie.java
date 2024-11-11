package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculos.Classsificavel;

public class Movie extends Titulo implements Classsificavel {
    private String diretor;

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //GETTER
    public String getDiretor() {
        return diretor;
    }

    //SETTER
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " ( " + getAnoDeLancamento() + " )";
    }
}
