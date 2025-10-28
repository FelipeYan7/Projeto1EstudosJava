package br.com.alura.desafiosjava;

public class DesafioLivro {
    private String titulo;
    private String autor;

    public void exibirDetalhes(){
        System.out.println(String.format("""
                Título do livro: %s
                Autor do livro: %s
                """, titulo, autor));
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
