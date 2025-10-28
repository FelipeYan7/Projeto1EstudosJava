package br.com.alura.screenmatch.desafio;

public class DesafioCachorro extends DesafioAnimal{

    public DesafioCachorro(String nome){
        super(nome);
    }

    @Override
    public void acaoAnimal(){
        System.out.println(getNome() + " esta latindo!");
    }

    @Override
    public String toString() {
        return "Nome do cachorro: " + getNome();
    }
}
