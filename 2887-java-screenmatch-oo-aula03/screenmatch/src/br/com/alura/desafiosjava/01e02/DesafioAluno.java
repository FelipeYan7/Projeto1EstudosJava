package br.com.alura.desafiosjava;

class DesafioAluno {
    String nome;
    int idade;

    void exibirAluno(){
        System.out.println(String.format("Nome do aluno: %s.",nome));
        System.out.println(String.format("Idade do aluno: %d ano(s).", idade));
    }
}
