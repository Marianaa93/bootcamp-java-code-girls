import java.util.Scanner;

public class MaiorEMenorMedia {
    /*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
    public static void main(String[] args) {
        int number = 0;
        double sum = 0;
        double max = 0;
        double min = 0;
        int n=0;

        Scanner scan = new Scanner((System.in));


        for (int i = 0; i < 5; i++) {
            n++;
            System.out.println("Enter a number"+" " +n + ":");
            number = scan.nextInt();


            sum += number;


            if (number == 0) {
                min = number;
                max = number;
            } else if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;

            }

        }

        double media = sum / 5;

        System.out.println(" A média é:" + " " + media);
        System.out.println(" O maior número é:" + " " + max);
    }
}





