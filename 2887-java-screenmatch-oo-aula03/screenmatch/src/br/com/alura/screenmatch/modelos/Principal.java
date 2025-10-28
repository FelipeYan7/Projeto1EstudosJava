package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.modelos.calculo.CalculadoraDeTempo;

//public class Principal {
//    public static void main(String[] args){
//        DesafioPessoa hello = new DesafioPessoa();
//        hello.printHello();
//        Filme meuFilme = new Filme();
//
//        meuFilme.setNome("Piratas do Caribe");
//        meuFilme.setAnoDeLancamento(2020);
//        meuFilme.setDuracaoMin(190);
//
//        meuFilme.imprimirFiha();
//        meuFilme.avaliacao(8);
//        meuFilme.avaliacao(5);
//        meuFilme.avaliacao(10);
//        System.out.println("Soma das avaliações com get e set: " + meuFilme.getSomaAvaliacoes());
//        System.out.println("Total de avaliações com get e set: " + meuFilme.getTotalAvaliacoes());
//        meuFilme.imprimirAvaliacao();
//    }
//  }
    public class Principal {
        public static void main(String[] args) {
            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);
            System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(5);
            meuFilme.avalia(10);
            System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
            System.out.println(meuFilme.pegaMedia());
            //meuFilme.somaDasAvaliacoes = 10;
            //meuFilme.totalDeAvaliacoes = 1;
            //System.out.println(meuFilme.pegaMedia());

            Serie lost = new Serie();
            lost.setNome("Lost");
            lost.setAnoDeLancamento(2000);
            lost.exibeFichaTecnica();
            lost.setTemporadas(10);
            lost.setEpisodiosPorTemporada(10);
            lost.setMinutosPorEpisodio(50);
            System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

            Filme outroFilme = new Filme();
            outroFilme.setNome("Avatar");
            outroFilme.setAnoDeLancamento(2023);
            outroFilme.setDuracaoEmMinutos(200);

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(meuFilme);
            calculadora.inclui(outroFilme);
            calculadora.inclui(lost);
            System.out.println(calculadora.getTempoTotal());
        }
    }

