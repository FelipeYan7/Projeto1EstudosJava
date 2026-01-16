import java.util.Scanner;

public class OperacaoMatematica {
    Scanner scanner = new Scanner(System.in);
    public double n1 = 0;
    public double n2 = 0;
    private static double resultado = 0;
    public int calculo;
    private static int contador = 0;

    public void textoOperacoes(){
        System.out.println(String.format("""
                0-Sair
                1-Soma
                2-Subtração
                3-Multiplicação
                4-Divisão
                
                Digite o número da operação que deseja:
                """));
        calculo = scanner.nextInt();
    }

    public void entradaDeDoisNumeros(){
        System.out.println("Escreva o primero número");
        n1 = scanner.nextDouble();
        System.out.println("Escreva o segundo número:");
        n2 = scanner.nextDouble();
        System.out.println("Números escolhidos: " + n1 + " e " + n2);
    }

    public void entradaDeUmNumero(){
        System.out.println("Escreva um número:");
        n1 = scanner.nextDouble();
    }

    public double executaOperacao(){
        return resultado;
    }

    public boolean estaEmOperacao(int contador){
        return contador > 0;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
