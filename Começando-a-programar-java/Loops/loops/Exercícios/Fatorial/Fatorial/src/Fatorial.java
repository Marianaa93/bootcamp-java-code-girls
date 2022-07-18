import java.util.Scanner;

public class Fatorial {
    /*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número Fatorial:");
        int numero=scan.nextInt();
        int multiplicacao = 1;
        for (int i=numero; i>= 1; i--) {

            multiplicacao = multiplicacao * i;
        }
        System.out.println(numero+"!"+" "+"="+" "+multiplicacao);
    }
}
