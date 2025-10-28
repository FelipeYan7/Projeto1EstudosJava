package br.com.alura.desafiosjav03;

public class DesafioProdutoFisico implements DesafioCalculavel{
    private double preco;
    private double desconto;
    private double taxa;
    private boolean usado;

    public DesafioProdutoFisico(double preco, double desconto, double taxa, boolean usado){
        this.preco = preco;
        this.desconto = desconto;
        this.taxa = taxa;
        this.usado = usado;
    }

    @Override
    public double calcularPrecoFinal(){
        double precoFinal = preco;
        if(usado){
            System.out.println(String.format("Seu produto tem desconto de %.2f%% por ser usado", desconto));
            precoFinal -= precoFinal * (desconto / 100);
        } else {
            System.out.println("Seu produto é novo e não tem desconto");
        }
        precoFinal += precoFinal * (taxa / 100);
        System.out.println(String.format("O preço final do produto é de: R$%.2f \n   Taxa de: %.1f%%", precoFinal, taxa));
        return precoFinal;
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

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
