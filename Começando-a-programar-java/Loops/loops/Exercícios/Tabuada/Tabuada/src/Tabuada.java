import java.util.Scanner;

public class Tabuada {

        /*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo
:*/

    public static void main(String[] args) {
        //1)inserir o numero a ser multiplicado de 1 a 10
        //2) intervalo de 1 a 10.
        int multiplicador = 0;
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número a ser múltiplicado:");
        multiplicador = scan.nextInt();
        for (int i = 0; i < 11; i++) {

            System.out.println(multiplicador + " " + "X" + " " + i + " =" + (multiplicador * i));
        }

    }
}
