package br.com.alura.desafiosjava;

import java.util.Scanner;

public class DesafioMusica {
    Scanner scanner = new Scanner(System.in);
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double nota;

    void exibirFicha(){
        System.out.println(String.format("Título da música: %s",titulo));
        System.out.println(String.format("Nome do artista: %s",artista));
        System.out.println(String.format("Ano de laçamento: %d", anoLancamento));
        System.out.println(String.format("Avaliação: %f",avaliacao));
        System.out.println(String.format("Número de avaliações: %d",numAvaliacoes));
        System.out.println(String.format("A média de avaliação da música é de: %.2f", mediaAvaliacao()));
    }

    double inserirNota(){
        System.out.println("Insira uma nota");
        nota = scanner.nextDouble();
        return nota;
    }
    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao(){
        return avaliacao / numAvaliacoes;
    }
}
