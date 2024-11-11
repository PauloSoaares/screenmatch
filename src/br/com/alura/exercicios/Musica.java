package br.com.alura.exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void exibirFicha() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("A no de lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Media avaliações:" + numAvaliacoes);
    }

    void avaliar (int valor) {
        avaliacao =+ valor;
        numAvaliacoes++;

    }

    int mediaAvaliacao () {
        return avaliacao / numAvaliacoes;

    }
}
