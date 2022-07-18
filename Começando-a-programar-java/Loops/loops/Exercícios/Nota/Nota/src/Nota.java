import java.util.Scanner;

public class Nota {
    /*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Insira uma nota entre 0 e 10:");
        nota = scan.nextInt();
        while (nota > 10 || nota < 0){
            System.out.println(" Nota inválida! Insira uma nota entre 0 e 10:");
            nota = scan.nextInt();
        }
        System.out.println(" A sua nota é:"+ nota);
    }



}
