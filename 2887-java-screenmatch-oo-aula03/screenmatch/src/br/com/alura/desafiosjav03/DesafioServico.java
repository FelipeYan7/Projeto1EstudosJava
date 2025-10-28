package br.com.alura.desafiosjav03;

import java.util.Scanner;

public class DesafioServico implements DesafioVendavel{
    Scanner scanner = new Scanner(System.in);
    private double preco;
    private double desconto;
    private double taxaServico;
    private boolean ehCliente;

    public DesafioServico(double preco, double desconto, double taxaServico, boolean ehCliente){
        this.preco = preco;
        this.desconto = desconto;
        this.taxaServico = taxaServico;
        this.ehCliente = ehCliente;
    }

    @Override
    public double calcularPrecoTotal(){
        System.out.println("Preço inicial do produto: R$" + preco);
        int quantidadeComprada;
        do{
            System.out.println("Insira a quantidade do produto(1 ou mais):");
            quantidadeComprada = scanner.nextInt();
        } while (quantidadeComprada <= 0);
        double precoFinal = preco * quantidadeComprada;
        if(ehCliente){
            System.out.println(String.format("Seu produto tem desconto de %.2f%% por você ser cliente", desconto));
            precoFinal -= precoFinal * (desconto / 100);
            System.out.println(String.format("Preço do produto com desconto: R$%.2f \n   Taxa de serviço: %.1f%%", precoFinal,taxaServico));
        } else {
            System.out.println("Você não tem desconto por não ser cliente!");
            System.out.println(String.format("Preço do produto sem desconto: R$%.2f \n   Taxa de serviço: %.1f%%", precoFinal,taxaServico));
        }
        precoFinal += precoFinal * (taxaServico / 100);
        System.out.println(String.format("O preço final do produto com a taxa de serviço é de: R$%.2f", precoFinal));
        return precoFinal;
    }
}
