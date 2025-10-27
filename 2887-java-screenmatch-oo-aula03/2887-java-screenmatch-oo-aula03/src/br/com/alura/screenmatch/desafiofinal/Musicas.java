package br.com.alura.screenmatch.desafiofinal;

import java.util.Scanner;

public class Musicas extends Audio implements Classificar{
    Scanner scanner = new Scanner(System.in);
    private String cantor;
    private double avaliacao;
    private int n;
    private int n2;
    public Musicas(String titulo, double duracao, int totalDeReproducoes, int curtidas, double classificacao, String cantor) {
        super(titulo, duracao, totalDeReproducoes, curtidas, classificacao);
        this.cantor = cantor;
    }

    public Musicas(){}

    @Override
    public void reproduzir(){
        do{
            System.out.println(String.format("Reproduzir música %s: Digite 1\nNão Reproduzir música %s: Digite 0", getTitulo(), getTitulo()));
            setN(scanner.nextInt());
        }while(getN() < 0 || getN() > 1);
        if(n == 1) {
            setTotalDeReproducoes(getTotalDeReproducoes() + 1);
            for (int i = 0; i < getDuracao(); i++) {
                System.out.println(String.format("Reproduzindo %dmin...", i));
            }
            System.out.println("Música reproduzida!");
        }
    }

    @Override
    public void curtir(){
        if(getN() == 1) {
            do{
                System.out.println("Digite 1 se curtiu a musica\nDigite 0 se não curtiu a musica");
                setN2(scanner.nextInt());
            } while(getN2() < 0 || getN2() > 1);
            if(getN2() == 1) {
                System.out.println(String.format("Música Curtida!\n%d --> %d curtidas", getCurtidas(), getCurtidas() + 1));
                setCurtidas(getCurtidas() + 1);
            }
        }
    }

    @Override
    public void imprimir(){
        System.out.println(String.format("""
                Título: %s
                Cantor: %s
                Duração: %.2fmin
                Total de reproduções: %d
                Curtidas: %d
                Classificação: %.1f/10
                """, getTitulo(), cantor, getDuracao(), getTotalDeReproducoes(), getCurtidas(), getClassificacao()));
    }

    @Override
    public void classificar(){
        if(getN() == 1) {
            do {
                System.out.println("De uma nota de 0 a 10 para a música:");
                avaliacao = scanner.nextDouble();
            } while (avaliacao < 0 || avaliacao > 10);
            setClassificacao(avaliacao);
            System.out.println(String.format("Sua avaliação foi de %.1f/10", avaliacao));
        }
    }



    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
