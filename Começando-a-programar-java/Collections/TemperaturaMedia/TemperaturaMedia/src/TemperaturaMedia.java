import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class TemperaturaMedia {
    /* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazen-as
    em uma lista.
     Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta
     média, em que mês elas ocorreram( mostrar mês por extenso: 1-janeiro, 2-Fevereiro,etc
          */
    public static void main(String[] args) {
        //criar a lista com os 6 primeiros meses do ano;
        //metodo para scannear elas do leitor, e colocar na lista
        //fazer a soma total ( interagindo na lista), e mostrar a média;
        //talvez fazer um switch com os meses
        System.out.println("Insira as temperaturas");
            Scanner scan = new Scanner(System.in);
            List<Double> temperaturasSemestral = new ArrayList();
            double soma = 0.0;

            for(int i = 1; i <= 6; ++i) {
                double temp = scan.nextDouble();
                temperaturasSemestral.add(temp);
                soma += temp;
            }

            double mediaTemperaturasSemenstral = soma / (double)temperaturasSemestral.size();
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");
            Iterator var7 = temperaturasSemestral.iterator();

            while(var7.hasNext()) {
                Double temp = (Double)var7.next();
                if (temp > mediaTemperaturasSemenstral) {
                    int index = temperaturasSemestral.indexOf(temp);
                    switch (index) {
                        case 0:
                            System.out.println(index + 1 + " - JANEIRO: " + temp + " oC");
                            break;
                        case 1:
                            System.out.println(index + 1 + " - FEVEREIRO: " + temp + " oC");
                            break;
                        case 2:
                            System.out.println(index + 1 + " - MARÇO: " + temp + " oC");
                            break;
                        case 3:
                            System.out.println(index + 1 + " - ABRIL: " + temp + " oC");
                            break;
                        case 4:
                            System.out.println(index + 1 + " - MAIO: " + temp + " oC");
                            break;
                        case 5:
                            System.out.println(index + 1 + " - JUNHO: " + temp + " oC");
                    }
                }
            }




    }
}
