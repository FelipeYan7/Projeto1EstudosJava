public class TestaPessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Julio", 18);
        pessoa.imprimir();
        pessoa.testaIdade(pessoa.getIdade());
        pessoa.acao();

        Aluno aluno = new Aluno("Ricardo", 7, 7283);
        aluno.imprimir();
        aluno.testaIdade(aluno.getIdade());
        aluno.acao();

        Trabalhador trabalhador = new Trabalhador("Manoel", 37, 5344.97);
        trabalhador.imprimir();
        trabalhador.testaIdade(trabalhador.getIdade());
        trabalhador.acao();
    }
}
