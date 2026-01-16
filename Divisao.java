public class Divisao extends OperacaoMatematica{

    @Override
    public double executaOperacao(){
        if (!estaEmOperacao(getContador())){
            entradaDeDoisNumeros();
            if(n1 == 0 || n2 == 0){
                System.out.println("Não é possível dividir por zero!");
                return getResultado();
            }
            setResultado(n1 / n2);
        } else {
            entradaDeUmNumero();
            if(n1 == 0){
                System.out.println("Não é possível dividir por zero!");
                return getResultado();
            }
            setResultado(getResultado() / n1);
        }

        return getResultado();
    }
}
