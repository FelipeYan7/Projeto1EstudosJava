package br.com.alura.desafiosjava;

public class DesafioContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public String titular;

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void imprimir(){
        System.out.println(String.format("Titular: %s\nNúmero da conta: %d\nSaldo: R$%.2f", titular, numeroDaConta, saldo));
    }

}
