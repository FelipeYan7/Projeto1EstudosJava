public class Trabalhador extends Pessoa{
    private double salario;
    public Trabalhador(String nome, int idade, double salario){
        super(nome,idade);
        this.salario = salario;
    }
    @Override
    public void imprimir(){
        System.out.println(String.format("Nome: %s\nIdade: %d\nSalario: R$%.2f", getNome(), getIdade(), salario));
    }
    @Override
    public void acao(){
        System.out.println(getNome() + " está trabalhando");
    }

}
