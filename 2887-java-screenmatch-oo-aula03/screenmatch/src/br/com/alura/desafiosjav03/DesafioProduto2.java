package br.com.alura.desafiosjav03;

import java.util.Scanner;

public class DesafioProduto2 implements DesafioVendavel{
    Scanner scanner = new Scanner(System.in);
    private double preco;
    private double desconto;
    private boolean ehCliente;

    public DesafioProduto2(double preco, double desconto, boolean ehCliente){
        this.preco = preco;
        this.desconto = desconto;
        this.ehCliente = ehCliente;
    }

    @Override
    public double calcularPrecoTotal(){
        System.out.println("Preço inicial do produto: " + preco);
        int quantidadeComprada;
        do{
            System.out.println("Insira a quantidade do produto(1 ou mais):");
            quantidadeComprada = scanner.nextInt();
        } while (quantidadeComprada <= 0);
        double precoFinal = preco * quantidadeComprada;
        if(ehCliente){
            System.out.println(String.format("Seu produto tem desconto de %.2f%% por você ser cliente", desconto));
            precoFinal -= precoFinal * (desconto / 100);
        } else {
            System.out.println("Você não tem desconto por não ser cliente!");
        }
        System.out.println(String.format("O preço final do produto é de: R$%.2f", precoFinal));
        return precoFinal;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean isEhCliente() {
        return ehCliente;
    }

    public void setEhCliente(boolean ehCliente) {
        this.ehCliente = ehCliente;
    }
}
