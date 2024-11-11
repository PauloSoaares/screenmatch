package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1978);
        myMovie.setDuracaoEmMInutos(100);

        myMovie.exibeFichaTecnica();
        myMovie.avalia(3);
        myMovie.avalia(3);
        myMovie.avalia(7);


        System.out.println("Total de avaliações: " + myMovie.getTotalDeAvaliacoes());
        System.out.println("Media filme: " + myMovie.mediaAvaliacao()); //pegamedia
        System.out.println();


        Serie howMetYouMother = new Serie("How Met Your Mother", 2005);
        howMetYouMother.setTemporadas(9);
        howMetYouMother.setAtiva(false);
        howMetYouMother.setEpisodiosPorTemporada(20);
        howMetYouMother.setMinutosPorEpisodio(200 );
        System.out.println("Duração em minutos da serie: " + howMetYouMother.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(howMetYouMother);

        System.out.println("o tempo em minutos para sua maratona: " + calculadora.getTempoTotal());


        Episodio primeiroEp = new Episodio();
        primeiroEp.setNumero(01);
        primeiroEp.setNome("Barney na escola");
        primeiroEp.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(primeiroEp);
        filtro.filtra(myMovie);

        var filmeDoPaulo = new Movie("Clube da luta", 2013);
        filmeDoPaulo.setDuracaoEmMInutos(300);
        filmeDoPaulo.avalia(8);

        Movie favorito = new Movie("The Matrix", 1999);

        ArrayList<Movie> listaDefilmes = new ArrayList<>();
        listaDefilmes.add(myMovie);
        listaDefilmes.add(filmeDoPaulo);
        listaDefilmes.add(favorito);
        System.out.println("Tamanho da lista " + listaDefilmes.size());
        System.out.println("Tamanho da lista " + listaDefilmes);
        System.out.println("O primeiro filme da lista é " + listaDefilmes.get(0).toString());

    }


}




















