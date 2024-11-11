package br.com.alura.exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibirFicha(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void idade(){
        int i = 2024 - ano;
        System.out.println("Ano do carro: " + i);
    }

}
