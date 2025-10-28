package br.com.alura.desafiosjava;

public class DesafioCarro {
    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.println(String.format("Modelo do carro: %s.", modelo));
        System.out.println(String.format("Ano do carro: %d.", ano));
        System.out.println(String.format("Cor do carro: %s.", cor));
        System.out.println(String.format("Idade do carro: %d ano(s).",idade()));
    }

    int idade(){
        return 2025 - ano;
    }
}
