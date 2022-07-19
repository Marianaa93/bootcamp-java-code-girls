import java.util.*;

public class MetodosMap {
    public static void main(String[] args) {
        /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

        //Crie um dicionário que relacione os modelos e seus respectivos consumos
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.5);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        //Substitua o consumo do gol por 15,2km/l
        carrosPopulares.put("Gol", 15.20);
        System.out.println(carrosPopulares);

        //Confira se o modelo Tucson está no dicionário
        System.out.println("O modelo Tucson no dicionário:" + " " + carrosPopulares.containsKey("Tucson"));

        // Verificar o consumo do Uno
        System.out.println(" O consumo do Uno é:" + " " + carrosPopulares.get("Uno") + " " + "km/l");

        //Exiba o terceiro modelo adicionado

        //Exiba os modelos
        System.out.println("Os modelos são:" + " " + carrosPopulares.keySet());

        //Exiba os consumos
        System.out.println("Os Consumos são:" + " " + carrosPopulares.values());

//        // exibir o modelo mais economico e o seu consumo
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEfeciente = " ";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEfeciente = entry.getKey();
            }
        }
        System.out.println(" O modelo mais eficiente é:" + " " + modeloMaisEfeciente + " " +
                "consumo=" + "" + carrosPopulares.get("Mobi") + " " + "km/l");

        // Exibir o menos econômico e consumo

        Double menosEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet();
        String modeloMenosEfeciente = " ";

        for (Map.Entry<String, Double> entrada : entradas) {
            if (entrada.getValue().equals(menosEconomico)) {
                modeloMenosEfeciente = entrada.getKey();
            }
        }

        System.out.println(" O modelo menos eficiente é:" + " " + modeloMenosEfeciente + " " +
                "consumo=" + "" + carrosPopulares.get(modeloMenosEfeciente) + " " + "km/l");

        //soma dos consumos

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();

        }
        System.out.println(" A soma é:" + " " + soma +
                "." + " " + "A média é igual a:" + " " + (soma / carrosPopulares.size()));

        //Remova os modelos com o consumo igual a 15,6km/l
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()) {
           if (iterator1.next() == 15.6){
               iterator1.remove();
           };

        }
        System.out.println(" Atualizado:"+" "+ carrosPopulares );

        // imprima na ordem em que foram informados
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.5);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        //Exiba o dicionário ordenado pelo modelo
        Map<String, Double> carros = new TreeMap<>(carrosPopulares2);
        System.out.println(carros.toString());

        //Apagar o conjunto de carros
        carros.clear();
        System.out.println(carros);

        // Está vazio?
        System.out.println(" Has está vazia:"+ carros.isEmpty());






    }


}
