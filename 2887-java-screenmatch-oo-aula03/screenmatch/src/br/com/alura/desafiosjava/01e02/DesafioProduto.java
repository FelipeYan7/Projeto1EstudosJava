package br.com.alura.desafiosjava;

public class DesafioProduto {
    private String nome;
    private double preco;
    double valorDesconto;

    public double aplicarDesconto(double desconto){
        valorDesconto = preco - preco * (desconto / 100);
        return valorDesconto;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void imprimirProdutoComDesconto(){
        System.out.println(String.format("O preço do produto original é de: R$%.2f\nO preço do produto com desconto é: R$%.2f", preco, valorDesconto));
    }
}
