package br.com.alura.screenmatch.desafio;

public class DesafioGato extends DesafioAnimal{
    public DesafioGato(String nome){
        super(nome);
    }

    @Override
    public void acaoAnimal(){
        System.out.println(getNome() + " está miando!");
    }

    @Override
    public String toString() {
        return "Nome do gato: " + getNome();
    }
}
