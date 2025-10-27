package br.com.alura.screenmatch.desafiofinal;

public class MainDesafioFinal {
    public static void main(String[] args){
        Musicas musica = new Musicas("One Dance", 2.53, 400, 28, 8.7, "Drake");
        musica.imprimir();
        musica.reproduzir();
        musica.curtir();
        musica.classificar();
        musica.imprimir();


        Podcasts podcast = new Podcasts("Flow Podcast - Ramon Dino", 108.38, 144885, 15000, 9.3, "Igor Coelho", "Ramon Rocha Queiroz", 1000, "Não");
        podcast.imprimir();
        podcast.reproduzir();
        podcast.curtir();
        podcast.classificar();
        podcast.superChat();
        podcast.imprimir();


    }
}
