import java.util.Scanner;

public class Usuario {
    Scanner scanner = new Scanner(System.in);
    private String nome , senha;
    private double saldo;
    public Usuario(String nome, String senha, double saldo){
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }

    public boolean login(){
        int tentativas = 3;
        String loginNome, loginSenha;
            do {
                if (tentativas == 0){
                    System.out.println("Voce atingiu o maximo de tentativas de login possiveis.");
                    return false;
                }
                System.out.println("Nome: ");
                loginNome = scanner.nextLine().trim().toUpperCase();
                System.out.println("Senha: ");
                loginSenha = scanner.nextLine().trim();
                if (!loginNome.equals(getNome().toUpperCase()) || !loginSenha.equals(getSenha())) {
                    System.out.println("Nome ou senha incorretos!");
                    tentativas--;
                }
            } while(!loginNome.equals(getNome().toUpperCase()) || !loginSenha.equals(getSenha()));
                System.out.println(String.format("""
                        ==========================
                           Bom te ver aqui, %s!
                           Seu saldo: R$%.2f
                        ==========================
                        """, getNome(), getSaldo()));
                return true;
    }



    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
