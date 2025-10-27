package br.com.alura.screenmatch.desafiofinal;

import java.util.Scanner;

public class Podcasts extends Audio implements Classificar, SuperChat {
    Scanner scanner = new Scanner(System.in);
    private String apresentador;
    private String convidado;
    private double avaliacao;
    private int n;
    private int n2;
    private int n3;
    private String mensagem;
    private double pontos;
    private String enviouSuperchat;

    public Podcasts(String titulo, double duracao, int totalDeReproducoes, int curtidas, double classificacao, String apresentador, String convidado, double pontos, String enviouSuperchat) {
        super(titulo, duracao, totalDeReproducoes, curtidas, classificacao);
        this.apresentador = apresentador;
        this.convidado = convidado;
        this.pontos = pontos;
        this.enviouSuperchat = enviouSuperchat;
    }

    public Podcasts(){}

    @Override
    public void reproduzir(){
        do{
            System.out.println(String.format("Reproduzir podcast %s: Digite 1\nNão Reproduzir podcast %s: Digite 0", getTitulo(), getTitulo()));
            setN(scanner.nextInt());
        }while(getN() < 0 || getN() > 1);
        if(n == 1) {
            setTotalDeReproducoes(getTotalDeReproducoes() + 1);
            for (int i = 0; i < getDuracao(); i += 20) {
                System.out.println(String.format("Reproduzindo podcast %dmin...", i));
            }
            System.out.println(String.format("Reproduzindo podcast %.0fmin...\nPodcast reproduzido!", getDuracao()));
        }
    }

    @Override
    public void curtir(){
        if(getN() == 1) {
            do{
                System.out.println("Digite 1 se curtiu o podcast\nDigite 0 se não curtiu o podcast");
                setN2(scanner.nextInt());
            } while(getN2() < 0 || getN2() > 1);
            if(getN2() == 1) {
                System.out.println(String.format("Podcast curtido!\n%d --> %d curtidas", getCurtidas(), getCurtidas() + 1));
                setCurtidas(getCurtidas() + 1);
            }
        }
    }

    @Override
    public void classificar(){
        if(getN() == 1) {
            do {
                System.out.println("De uma nota de 0 a 10 para o podcast:");
                avaliacao = scanner.nextDouble();
            } while (avaliacao < 0 || avaliacao > 10);
            setClassificacao(avaliacao);
            System.out.println(String.format("Sua avaliação foi de %.1f/10", avaliacao));
        }
    }
    @Override
    public void superChat() {
        if (getN() == 1) {
            do {
                System.out.println("Mandar um Superchat (1000 pontos): Digite 1\nNão mandar Superchat: Digite 0");
                setN3(scanner.nextInt());
            } while (getN3() < 0 || getN3() > 1);

            if (getN3() == 1 && getPontos() >= 500) {
                setPontos(getPontos() - 500);
                scanner.nextLine(); // Consome o '\n' pendente do nextInt()
                System.out.println("Insira sua mensagem:");
                setMensagem(scanner.nextLine());
                System.out.println(String.format("Superchat enviado! Mensagem: %s", getMensagem()));
                setEnviouSuperchat("Sim");
            } else if (getPontos() < 500) {
                System.out.println("Você não tem pontos suficientes para mandar um superchat!");
                setEnviouSuperchat("Não");
            } else {
                setEnviouSuperchat("Não");
            }
        }
    }


    @Override
public void imprimir(){
    System.out.println(String.format("""
                Título: %s
                Apresentador: %s
                Convidado: %s
                Duração: %.2fmin
                Total de reproduções: %d
                Curtidas: %d
                Classificação: %.1f/10
                Enviou Superchat: %s
                Seus pontos: %.1f
                """, getTitulo(), getApresentador(), getConvidado(), getDuracao(), getTotalDeReproducoes(), getCurtidas(), getClassificacao(), getEnviouSuperchat(), getPontos()));
}

public String getApresentador() {
    return apresentador;
}

public void setApresentador(String apresentador) {
    this.apresentador = apresentador;
}

public String getConvidado() {
    return convidado;
}

public void setConvidado(String convidado) {
    this.convidado = convidado;
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

public int getN3() {
    return n3;
}

public void setN3(int n3) {
    this.n3 = n3;
}

public String getMensagem() {
    return mensagem;
}

public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
}

public double getPontos() {
    return pontos;
}

public void setPontos(double pontos) {
    this.pontos = pontos;
}

public String getEnviouSuperchat() {
    return enviouSuperchat;
}

public void setEnviouSuperchat(String enviouSuperchat) {
    this.enviouSuperchat = enviouSuperchat;
}
}