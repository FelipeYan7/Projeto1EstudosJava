package br.com.alura.screenmatch.desafio;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int dataValidade, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome do Produto Perecivel: " + getNome() + " - R$" + getPreco() + " | Data de validade: " + getDataValidade() + " (" + getQuantidade() + " unidades disponíveis)";
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
}
