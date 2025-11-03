//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Lucas", "abc123", 100);
        Produto produto = new Produto();

        if (usuario1.login()) {
            double totalCompra = produto.comprar();
            if (totalCompra > usuario1.getSaldo()) {
                System.out.printf("Saldo insuficiente! Compra não realizada.%nSeu crédito: R$%.2f%n", usuario1.getSaldo());
            } else {
                double novoSaldo = usuario1.getSaldo() - totalCompra;
                usuario1.setSaldo(novoSaldo);
                System.out.printf("Compra realizada com sucesso!%nSeu saldo restante: R$%.2f%n", novoSaldo);
            }
        } else {
            System.out.println("Efetue o login novamente.");
        }
    }
}
