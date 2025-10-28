package br.com.alura.desafiosjava;

public class PrincipalDesafio {
    public static void main(String[] args) {
        br.com.alura.desafiosjava.DesafioPessoa olaMundo = new br.com.alura.desafiosjava.DesafioPessoa();
        br.com.alura.desafiosjava.DesafioCalculadora calculo = new br.com.alura.desafiosjava.DesafioCalculadora();
        br.com.alura.desafiosjava.DesafioMusica musica = new br.com.alura.desafiosjava.DesafioMusica();
        br.com.alura.desafiosjava.DesafioCarro carro = new br.com.alura.desafiosjava.DesafioCarro();
        br.com.alura.desafiosjava.DesafioAluno aluno = new br.com.alura.desafiosjava.DesafioAluno();
        br.com.alura.desafiosjava.DesafioContaBancaria conta = new br.com.alura.desafiosjava.DesafioContaBancaria();
        br.com.alura.desafiosjava.DesafioIdadePessoa idade = new br.com.alura.desafiosjava.DesafioIdadePessoa();
        br.com.alura.desafiosjava.DesafioProduto produto = new br.com.alura.desafiosjava.DesafioProduto();
        br.com.alura.desafiosjava.DesafioMediaAluno mediaAluno = new br.com.alura.desafiosjava.DesafioMediaAluno();
        br.com.alura.desafiosjava.DesafioLivro livro = new br.com.alura.desafiosjava.DesafioLivro();

        olaMundo.printHello();

        System.out.println(calculo.dobro(7.77));

        musica.titulo = "Superman";
        musica.artista = "Eminem";
        musica.anoLancamento = 2002;

        //musica.avaliar(musica.inserirNota());
        //musica.avaliar(musica.inserirNota());
        //musica.avaliar(musica.inserirNota());
        musica.exibirFicha();

        carro.modelo = "Volkswagen Nivus";
        carro.ano = 2023;
        carro.cor = "Cinza";
        carro.exibirFicha();

        aluno.nome = "Julio";
        aluno.idade = 7;
        aluno.exibirAluno();

        conta.setTitular("Felipe");
        conta.setNumeroDaConta(1717171);
        conta.setSaldo(5726506328.93);
        conta.imprimir();

        //idade.imprimirIdade(idade.scannerIdade());

        produto.setNome("Banana");
        produto.setPreco(10.99);
        produto.aplicarDesconto(5);
        produto.imprimirProdutoComDesconto();

        mediaAluno.setNome("Jacinto");
        //mediaAluno.scannerNota();
        //mediaAluno.scannerNota();
        //mediaAluno.scannerNota();
        mediaAluno.imprimirERetornarMedia();

        livro.setTitulo("De Pobre a Milionário");
        livro.setAutor("Eduardo");
        livro.exibirDetalhes();
    }
}
