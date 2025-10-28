package br.com.alura.desafiosjava;

import java.util.Scanner;

public class DesafioIdadePessoa {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int idade;
    public int scannerIdade(){
        System.out.println("Insira uma idade");
        return idade = scanner.nextInt();
    }

    public void imprimirIdade(int idade){
        if(idade >= 18 && idade < 150){
            System.out.println(String.format("%d é maior de idade", idade));
        } else if(idade < 18 && idade >= 0){
            System.out.println(String.format("%d é menor de idade", idade));
        } else{
            System.out.println("Essa criatura não é humana");
        }
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
