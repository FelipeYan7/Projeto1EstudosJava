package br.com.alura.screenmatch.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificar classificar){
        if(classificar.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos no momento");
        } else if(classificar.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depoois");
        }
    }
}
