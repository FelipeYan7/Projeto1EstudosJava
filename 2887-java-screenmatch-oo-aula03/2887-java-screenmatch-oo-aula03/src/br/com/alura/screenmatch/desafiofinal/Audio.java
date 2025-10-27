package br.com.alura.screenmatch.desafiofinal;

public abstract class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public Audio(String titulo, double duracao, int totalDeReproducoes, int curtidas, double classificacao){
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalDeReproducoes = totalDeReproducoes;
        this.curtidas = curtidas;
        this.classificacao = classificacao;
    }

    public Audio(){}

    public void curtir(){}
    public void reproduzir(){}
    public void imprimir(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
