public class Main {
    public static void main(String[] args) {
        var matemat = new OperacaoMatematica();

        matemat.textoOperacoes();
        while (matemat.calculo != 0){

            switch (matemat.calculo){
                case 1:
                    matemat = new Soma();
                    matemat.executaOperacao();
                    matemat.setContador(matemat.getContador() +1);
                    break;
                case 2:
                    matemat = new Subtracao();
                    matemat.executaOperacao();
                    matemat.setContador(matemat.getContador() +1);
                    break;
                case 3:
                    matemat = new Multiplicacao();
                    matemat.executaOperacao();
                    matemat.setContador(matemat.getContador() +1);
                    break;
                case 4:
                    matemat = new Divisao();
                    matemat.executaOperacao();
                    matemat.setContador(matemat.getContador() +1);
                    break;
            }
            System.out.println(String.format("Resultado: %f", matemat.getResultado()));

            matemat.textoOperacoes();
        }
    }
}