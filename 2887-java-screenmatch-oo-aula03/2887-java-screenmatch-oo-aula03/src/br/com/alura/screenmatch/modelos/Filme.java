package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificar;

public class Filme extends Titulo implements Classificar {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos, String diretor){
        super(nome,anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes,totalDeAvaliacoes, duracaoEmMinutos);
        this.diretor = diretor;
    }
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String diretor){
        super(nome, anoDeLancamento, duracaoEmMinutos);
        this.diretor = diretor;

    }


    public Filme(){}

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
