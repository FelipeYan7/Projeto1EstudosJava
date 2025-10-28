package br.com.alura.screenmatch.desafio;

import java.util.Scanner;

public class DesafioCirculo implements Forma{
    Scanner scanner = new Scanner(System.in);
    private double raio;
    private String nome;


    public DesafioCirculo(String nome, double raio){
        this.nome = nome;
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularAreaComScanner(){
        do{
            System.out.println("Insira o raio do circulo em cm: \n");
            raio = scanner.nextDouble();
        }while (raio <= 0);
//        return Math.PI * (raio * raio);
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void imprimir(){
        double area = calcularArea();
//        area = calcularAreaComScanner();
        System.out.println(String.format("======\n%s: \nRaio: %.2fcm\nÁrea: %.2fcm²", nome, raio, area));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
