import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Produto implements ComprarProduto{
    Scanner scanner = new Scanner(System.in);
    private int nProduto;
    private double valorCarrinho = 0;
    public Produto(){}

    List<String> carrinho = new ArrayList<>();
    @Override
    public double comprar(){
        int quantidadeProduto1 = 0;
        int quantidadeProduto2 = 0;
        int quantidadeProduto3 = 0;
        double valorProduto1 = 10;
        double valorProduto2 = 5;
        double valorProduto3 = 6;

        System.out.println("""
                Digite o número do produto que deseja comprar:
                1 - Refrigerante (R$10,00)
                2 - Água         (R$05,00)
                3 - Salgadinho   (R$06,00)
                0 - Finalizar compra
                """);
        do{
            nProduto = scanner.nextInt();
            if(nProduto < 0 || nProduto > 3) System.out.println("Digite um numero de produto valido!");
            if (nProduto == 0){
                System.out.println("Compra finalizada!\nSeus itens:");
                Collections.sort(carrinho);
                for(String listacarrinho : carrinho) System.out.println(listacarrinho);
                System.out.println(String.format("Valor total do carrinho: R$%.2f", valorCarrinho));
            } else if (nProduto == 1) {
                System.out.println("Insira a quantidade de refrigerantes que voce deseja:");
                quantidadeProduto1 += scanner.nextInt();
                valorProduto1 *= quantidadeProduto1;
                valorCarrinho += valorProduto1;
                carrinho.add(String.format("R$%.2f - %d Refrigerante(s)) ", valorProduto1, quantidadeProduto1));
                System.out.println(String.format("%d Refrigerante(s) adicionado(s) ao carrinho (R$%.2f)",quantidadeProduto1, valorProduto1));
            } else if(nProduto == 2){
                System.out.println("Insira a quantidade de aguas que voce deseja");
                quantidadeProduto2 += scanner.nextInt();
                valorProduto2 *= quantidadeProduto2;
                valorCarrinho += valorProduto2;
                carrinho.add(String.format("R$%.2f - %d Agua(s)", valorProduto2, quantidadeProduto2));
                System.out.println(String.format("%d Agua(s) adicionada(s) ao carrinho (R$%.2f)", quantidadeProduto2, valorProduto2));
            } else if (nProduto == 3){
                System.out.println("Insira a quantidade de salgadinho(s) que voce deseja:");
                quantidadeProduto3 += scanner.nextInt();
                valorProduto3 *= quantidadeProduto3;
                valorCarrinho += valorProduto3;
                carrinho.add(String.format("R$%.2f - %d Salgadinho(s)", valorProduto3, quantidadeProduto3));
                System.out.println(String.format("%d Salgadinho(s) adicionado(s) ao carrinho (R$%.2f)", quantidadeProduto3, valorProduto3));
            }

        } while(nProduto != 0);

        return valorCarrinho;

    }

    public int getnProduto() {
        return nProduto;
    }

    public void setnProduto(int nProduto) {
        this.nProduto = nProduto;
    }

    public double getValorCarrinho() {
        return valorCarrinho;
    }

    public void setValorCarrinho(double valorCarrinho) {
        this.valorCarrinho = valorCarrinho;
    }
}

