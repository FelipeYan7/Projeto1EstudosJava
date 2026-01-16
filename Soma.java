public class Soma extends OperacaoMatematica{

    @Override
    public double executaOperacao(){

        if (!estaEmOperacao(getContador())) {
            entradaDeDoisNumeros();
            setResultado(n1 + n2);
        } else {
            entradaDeUmNumero();
            setResultado(getResultado() + n1);
        }

        return getResultado();
    }
}
