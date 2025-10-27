package br.com.alura.screenmatch.desafio;

public class TabuadaMultiplicacao implements Tabuada{
    private double numero;

    public TabuadaMultiplicacao(double numero){
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada(double numero){
        for(int i = 0; i <=10; i++){
            System.out.println(String.format("%.1f x %d = %.1f", numero, i, numero * i));
        }
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

}
