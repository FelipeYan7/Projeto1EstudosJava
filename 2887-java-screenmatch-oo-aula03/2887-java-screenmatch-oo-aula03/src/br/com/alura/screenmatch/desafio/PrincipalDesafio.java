package br.com.alura.screenmatch.desafio;

import java.util.ArrayList;

public class PrincipalDesafio {
    public static void main(String[] args){
//        ConversorMoeda dolar = new ConversorMoeda();
//        dolar.getConverterDolarParaReal(10);
//
//        CalculadoraSalaRetangular calculoFigura = new CalculadoraSalaRetangular();
//        calculoFigura.calcularArea(10,15);
//        calculoFigura.calcularPerimetro(10,20);
//        System.out.println(calculoFigura.getArea());
//        System.out.println(calculoFigura.getPerimetro());
//
//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(7.5);
//        System.out.println(String.format("Tabuada do: %.1f", tabuada.getNumero()));
//        tabuada.mostrarTabuada(tabuada.getNumero());
//
//        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao(25, 52);
//        temperatura.celsiusParaFahrenheit();
//        temperatura.fahrenheitParaCelsius();

//        DesafioPessoa1 pessoa1 = new DesafioPessoa1("Felipe", 18);
//        DesafioPessoa1 pessoa2 = new DesafioPessoa1("Gabriel", 19);
//        DesafioPessoa1 pessoa3 = new DesafioPessoa1("Vini", 20);
//        ArrayList<DesafioPessoa1> listaDePessoas = new ArrayList<>();
//        listaDePessoas.add(pessoa1);
//        listaDePessoas.add(pessoa2);
//        listaDePessoas.add(pessoa3);
//
//        System.out.println("Lista:" + listaDePessoas);
//        System.out.println("Tamanho da lista: " + listaDePessoas.size());
//        System.out.println("Primeira da lista(pessoa1): " + listaDePessoas.get(0));
//        System.out.println("Lista de pessoas:");
//        for (DesafioPessoa1 i : listaDePessoas){
//            System.out.println(i);
//        }
//        System.out.println("Lista de pessoas:");
//        for (int i = 0; i < listaDePessoas.size(); i++) {
//            var pessoa = listaDePessoas.get(i);
//            System.out.println(pessoa);
//        }

        Produto produto1 = new Produto("Iphone", 4000, 80);
        Produto produto2 = new Produto("Notebook", 3000, 40);
        Produto produto3 = new Produto("Fone", 100, 50);
        ProdutoPerecivel produtoP1 = new ProdutoPerecivel("Milho em lata", 7, 2030, 250);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produtoP1);
        System.out.println(listaProdutos);
        System.out.println("Quantidade de produtos na lista: " + listaProdutos.size());
        for (Produto i : listaProdutos){
            System.out.println(i);
        }




    }
}
