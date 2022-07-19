import java.util.*;

public class ExemplosSet {
    public static void main(String[] args) {
        // Dada a lista com 7 notas de um aluno[7,8.5,9.3,5,7,0,3.6]

        //crie uma Hash de notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5d,9.3d,5d,7d,0d,3.6d));
        System.out.println(notas);

        //Confira se a nota 5 está no conjunto
        System.out.println("A nota 5 está no conjunto?:"+""+ notas.contains(5d));

        // Exiba a menor nota
        System.out.println("Exiba a menor nota:"+ Collections.min(notas));
        // Exiba a maior nota
        System.out.println("Exiba a menor nota:"+ Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        double sum=0;
        while(iterator.hasNext()){
            Double next= iterator.next();
            sum += next;
        }
        System.out.println(" A média é:"+""+ (sum/ notas.size()));
        //remova a nota 0
        notas.remove(0d);
        System.out.println(notas);

        // Remova as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next= iterator1.next();
            if(next <7){
                iterator1.remove();
            }
        }
        System.out.println(" A nova Hash é:"+""+notas);

        // Exiba todas as notas na ordem que foram informadas
        Set<Double>notas2=new LinkedHashSet<>(Arrays.asList(7d,8.5d,9.3d,5d,7d,0d,3.6d));
        System.out.println("Notas 2:" + " "+ notas2);

        // Exiba todas as notas na ordem que foram informadas
        Set <Double> notas3= new TreeSet<>(notas2);
        System.out.println("Notas em ordem crescente:"+ " "+ notas3 );

//         Apagar hash total
        notas.clear();
        System.out.println(notas);
        // Verificar se está vazio
        System.out.println(" Notas está vazio:"+" "+ notas.isEmpty());





    }
}
