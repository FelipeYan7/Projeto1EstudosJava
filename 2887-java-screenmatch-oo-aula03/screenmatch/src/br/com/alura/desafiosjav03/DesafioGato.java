package br.com.alura.desafiosjav03;

public class DesafioGato extends DesafioAnimal {
    public DesafioGato(){

    }
    @Override
    public void emitirSom(){
        System.out.println("miau miau miau!");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando móveis!");
    }
}
