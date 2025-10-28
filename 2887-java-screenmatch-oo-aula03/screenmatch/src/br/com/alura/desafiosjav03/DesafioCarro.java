package br.com.alura.desafiosjav03;

public class DesafioCarro {
    protected String modelo;
    protected int ano;
    double menorPreco;
    double maiorPreco;

    int qtd = 0;
    public void mediaPreco(double preco){
        if(qtd == 0){
            qtd++;
            menorPreco = preco;
            maiorPreco = preco;
        } else if(menorPreco > preco){
            menorPreco = preco;
        } else if (maiorPreco < preco) {
            maiorPreco = preco;
        }
    }

    public void imprimePrecos(){
        System.out.println("Melhor preço do " + modelo + " nos últimos 3 anos:");
        System.out.println("Maior preço: R$" + maiorPreco);
        System.out.println("Menor preço R$" + menorPreco);
    }
}
