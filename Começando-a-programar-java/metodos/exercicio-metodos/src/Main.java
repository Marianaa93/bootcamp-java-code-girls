public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(4, 2);
        Calculadora.diminuicao(4, 2);
        Calculadora.multiplicacao(4, 2);
        Calculadora.diminuicao(4, 2);


        //hora

        System.out.println("Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        //emprestiomo
        System.out.println("Emprestimo");
        Emprestimo.calcular(5000, 2);
        Emprestimo.calcular(5000, 3);
    }


}
