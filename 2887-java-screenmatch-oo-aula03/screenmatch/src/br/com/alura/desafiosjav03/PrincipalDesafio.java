package br.com.alura.desafiosjav03;

import br.com.alura.desafiosjava.DesafioLivro;

public class PrincipalDesafio {
    public static void main (String[] args){
        ModeloCarro carro = new ModeloCarro("Nivus", 2023);

        carro.mediaPreco(95000);
        carro.mediaPreco(150000);
        carro.mediaPreco(100000);
        carro.imprimePrecos();

        System.out.println("");

        DesafioCachorro cachorro = new DesafioCachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        DesafioGato gato = new DesafioGato();
        gato.emitirSom();
        gato.arranharMoveis();

        DesafioLivro2 livro = new DesafioLivro2(10,5, 120, true);
        livro.calcularPrecoFinal();

        DesafioProdutoFisico produtoFisico = new DesafioProdutoFisico(150, 30,10,true);
        produtoFisico.calcularPrecoFinal();

        DesafioProduto2 produto2 = new DesafioProduto2(200, 10, true);
        //produto2.calcularPrecoTotal();

        DesafioServico produtoServico = new DesafioServico(77, 5, 15, false);
        produtoServico.calcularPrecoTotal();

    }
}
