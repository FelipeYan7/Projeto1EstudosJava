public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void testaIdade(int idade){
        if(idade >= 18 && idade < 150){
            System.out.println(nome + " é maior de idade");
        } else if(idade < 18 && idade >= 0) {
            System.out.println(nome + " é menor de idade");
        } else {
            System.out.println("Esse ser não existe");
        }
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if(idade >= 0 && idade < 150){
            this.idade = idade;
            System.out.println("Idade válida");
        } else {
            this.idade = 0;
            System.out.println("Esse ser não existe");
        }
    }

    public void imprimir(){
        System.out.println(String.format("Nome: %s\nIdade: %d", nome, idade));
    }

    public void acao(){
        System.out.println(nome + " está andando!");
    }

}
