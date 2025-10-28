package br.com.alura.desafiosjava;

import java.util.Scanner;

public class DesafioMediaAluno {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private double notas;
    int quantidadeDeNotas;


    public void scannerNota(){
        System.out.println("insira uma nota:");
        notas += scanner.nextDouble();
        quantidadeDeNotas++;
    }


    public void imprimirERetornarMedia(){
        System.out.println(String.format("A média das notas do aluno %s é de: %.2f", nome, notas / quantidadeDeNotas));
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
