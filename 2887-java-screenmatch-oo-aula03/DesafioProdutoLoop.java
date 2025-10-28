package br.com.alura.screenmatch.desafio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DesafioProdutoLoop {
    private String nome;
    private double preco;

    public DesafioProdutoLoop(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public DesafioProdutoLoop(){}

    public double precoMedio(ArrayList<DesafioProdutoLoop> lista){
        double soma = 0;
        double precoMedio;
        for(DesafioProdutoLoop produto : lista){
            soma += produto.getPreco();
        }
        return precoMedio = soma / lista.size();
    }

    public void imprimirLista(ArrayList<DesafioProdutoLoop> lista){
        for(DesafioProdutoLoop produto : lista){
            System.out.println(String.format("Nome do produto: %s -- Preço: R$%.2f", produto.getNome(), produto.getPreco()));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
