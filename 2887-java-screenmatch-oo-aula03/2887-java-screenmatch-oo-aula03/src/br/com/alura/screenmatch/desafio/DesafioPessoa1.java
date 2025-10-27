package br.com.alura.screenmatch.desafio;

public class DesafioPessoa1 {
    private String nome;
    private int idade;

    public DesafioPessoa1(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " (Idade: " + getIdade() + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
