import java.util.*;

class ArrayExemplo {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7,8.5,9.3,7,0,3.6]
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);


        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(" Exiba a posição da nota 5.0:" + " " + notas.indexOf(5.0));


        notas.add(4, 8.0);
        System.out.println(" Adicone à lista a nota 8.0 na posição 4:" + " " + notas);


        System.out.println(("SUbstitui a nota 5.0 pela nota 6.0:" + " " + notas));


        System.out.println("Confira se a nota 5.0 stá na lista: " + notas.contains(8.0));


        System.out.println(" A terceira nota é:" + " " + notas.get(2));


        System.out.println((" A menor nota é:" + " " + Collections.min(notas)));
        System.out.println((" A menor nota é:" + " " + Collections.max(notas)));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        ;
        System.out.println(" A média é:" + "" + soma / notas.size());


        System.out.println(" Remove a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println(" Remove a nota da posição 0 ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remove notas menores que 7:");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apaga a lista toda");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confere se a lista está vazia:"+" "+ notas.isEmpty());


        //Exercicio proposto
        System.out.println("Crie uma lista chamada notas 2"+
                "coloque todos os elementos da list Array list nessa nova lista:");

        LinkedList <Double> notas2= new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("primeiro elemento:"+" "+ notas2.getFirst());
        System.out.println("remove ultimo elemento:"+" "+ notas2.removeLast()+ " "+ notas2);






    }
}
