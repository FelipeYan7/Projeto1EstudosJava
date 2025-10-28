public class Aluno extends Pessoa{
    private int id;
    public Aluno(String nome, int idade, int id){
        super(nome, idade);
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public void imprimir(){
        System.out.println(String.format("Nome: %s\nIdade: %d\nID: %d", getNome(),getIdade(),id));
    }
    @Override
    public void acao(){
        System.out.println(getNome() + " está estudando!");
    }

}
