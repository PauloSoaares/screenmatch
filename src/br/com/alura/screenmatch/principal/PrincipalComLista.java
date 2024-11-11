package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1978);
        myMovie.avalia(9);
        var filmeDoPaulo = new Movie("Clube da luta", 2013);
        filmeDoPaulo.avalia(6);
        Movie favorito = new Movie("The Matrix", 1999);
        favorito.avalia(10);
        Serie howMetYouMother = new Serie("How Met Your Mother", 2005);

        //Parametrizando minha lista com a super classe Titulo
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(myMovie);
        lista.add(filmeDoPaulo);
        lista.add(favorito);
        lista.add(howMetYouMother);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Movie filme && filme.getClassificacao() > 2) {
                System.out.println("Clasificação filmes: " + filme.getClassificacao());
            }

        }

        System.out.println("====LISTA ORDENADA====");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("====LISTA ORDENADA POR ANO====");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
