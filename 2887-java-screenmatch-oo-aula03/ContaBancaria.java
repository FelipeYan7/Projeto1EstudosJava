package br.com.alura.screenmatch.desafio;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(){}


    @Override
    public String toString(){
        return String.format("""
                Número da conta: %d
                Saldo: R$%.2f""", numeroConta, saldo);
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
