package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculos.Classsificavel;

public class FiltroRecomendacao {

    public void filtra(Classsificavel classsificavel) {
        if (classsificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos");
        }else if (classsificavel.getClassificacao() >=2 ) {
            System.out.println("muito bem avaliada!");
        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
