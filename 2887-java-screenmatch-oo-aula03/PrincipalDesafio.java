package br.com.alura.screenmatch.desafio;

import java.util.ArrayList;

public class PrincipalDesafio {
    public static void main(String[] args) {
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

//        Produto produto1 = new Produto("Iphone", 4000, 80);
//        Produto produto2 = new Produto("Notebook", 3000, 40);
//        Produto produto3 = new Produto("Fone", 100, 50);
//        ProdutoPerecivel produtoP1 = new ProdutoPerecivel("Milho em lata", 7, 2030, 250);
//        ArrayList<Produto> listaProdutos = new ArrayList<>();
//        listaProdutos.add(produto1);
//        listaProdutos.add(produto2);
//        listaProdutos.add(produto3);
//        listaProdutos.add(produtoP1);
//        System.out.println(listaProdutos);
//        System.out.println("Quantidade de produtos na lista: " + listaProdutos.size());
//        for (Produto i : listaProdutos){
//            System.out.println(i);
//        }


//        DesafioCachorro cachorro1 = new DesafioCachorro("Tobi");
//        var cachorro2 = new DesafioCachorro("Cacau");
//        DesafioAnimal animalQualquer = new DesafioAnimal("Pé de Pano");
//        if (animalQualquer instanceof DesafioCachorro) {
//            System.out.println("É um cachorro");
//            DesafioCachorro animal = (DesafioCachorro) animalQualquer;
//            animal.acaoAnimal();
//        } else if (animalQualquer instanceof DesafioGato){
//            System.out.println("É um gato");
//            DesafioGato animal = (DesafioGato) animalQualquer;
//            animal.acaoAnimal();
//        } else {
//            System.out.println(animalQualquer.getNome() + " não é um cachorro e nem um gato");
//        }
//        ArrayList<DesafioAnimal> listaAnimais = new ArrayList<>();
//        listaAnimais.add(cachorro1);
//        listaAnimais.add(cachorro2);
//        listaAnimais.add(animalQualquer);
//        for(DesafioAnimal animais : listaAnimais){
//            System.out.println(animais);
//        }

//        var produtoLoop1 = new DesafioProdutoLoop("Coca", 10.50);
//        var produtos = new DesafioProdutoLoop();
//        var produtoLoop2 = new DesafioProdutoLoop("Amendoim",30.27);
//        var produtoLoop3 = new DesafioProdutoLoop("Cerveja", 12.37);
//        ArrayList<DesafioProdutoLoop> listaLoop = new ArrayList<>();
//        listaLoop.add(produtoLoop1);
//        listaLoop.add(produtoLoop2);
//        listaLoop.add(produtoLoop3);
//        produtos.imprimirLista(listaLoop);
//        System.out.println(String.format("A média de preço dos produtos é: R$%.2f", produtos.precoMedio(listaLoop)));


//        var circulo1 = new DesafioCirculo("Circulo 1",7);
//        var circulo2 = new DesafioCirculo("Circulo 2",8);
//        var circulo3 = new DesafioCirculo("Circulo 3",9);
//
//        var quadrado1 = new DesafioQuadrado("Quadrado 1",2);
//        var quadrado2 = new DesafioQuadrado("Quadrado 2",3);
//        var quadrado3 = new DesafioQuadrado("Quadrado 3",4);
//
//        ArrayList<Forma> listaFormas = new ArrayList<>();
//        listaFormas.add(circulo1);
//        listaFormas.add(circulo2);
//        listaFormas.add(circulo3);
//        listaFormas.add(quadrado1);
//        listaFormas.add(quadrado2);
//        listaFormas.add(quadrado3);
//        for (Forma formas : listaFormas) {
//            formas.imprimir();
//        }


        var conta1 = new ContaBancaria(1, 1923865.73);
        var conta2 = new ContaBancaria(2, 500054.91);
        var conta3 = new ContaBancaria(3, 70005.43);
        var imprimeconta = new ContaBancaria();

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaior = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaior.getSaldo()) {
                contaMaior = conta;
            }
        }

        for (ContaBancaria conta : listaContas) {
            if (conta == contaMaior) {
                System.out.println("=======\nCONTA COM MAIOR SALDO: \n" + conta + "\n=======");
            } else {
                System.out.println(conta);
            }
        }


    }
}
