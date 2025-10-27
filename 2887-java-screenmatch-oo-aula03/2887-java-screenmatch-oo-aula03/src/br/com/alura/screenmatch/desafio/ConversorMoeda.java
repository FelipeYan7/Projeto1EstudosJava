package br.com.alura.screenmatch.desafio;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void getConverterDolarParaReal(double dolar){
        double cotacaoDolar = 5.45;
        double valorReal = cotacaoDolar * dolar;
        System.out.println(String.format("O valor em reais é de: R$%.2f", valorReal));
    }
}