package br.com.alura.desafiosjav03;

public class DesafioLivro2 implements DesafioCalculavel{
    private double desconto;
    private double taxa;
    private boolean digital;
    private int preco;

    public DesafioLivro2(double desconto, double taxa, int preco, boolean digital){
        this.desconto = desconto;
        this.taxa = taxa;
        this.preco = preco;
        this.digital = digital;
    }

    @Override
    public double calcularPrecoFinal(){
        double precoFinal = preco;
        if(digital){
            System.out.println(String.format("Seu livro tem desconto de %.2f%% por ser digital", desconto));
           precoFinal -= precoFinal * (desconto / 100);
        } else {
            System.out.println("Seu livro não tem desconto por não ser digital");
        }
        precoFinal += precoFinal * (taxa / 100);
        System.out.println(String.format("O preço final do livro é de: R$%.2f \n   Taxa de: %.1f%%", precoFinal, taxa));
        return precoFinal;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }
}
