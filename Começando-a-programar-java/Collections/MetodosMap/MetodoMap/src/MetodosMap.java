import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

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
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("Gol",14.4);
            put("Uno",15.5);
            put("Mobi",16.1);
            put ("HB20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carrosPopulares);

        //Substitua o consumo do gol por 15,2km/l
        carrosPopulares.put("Gol",15.20);
        System.out.println(carrosPopulares);

        //Confira se o modelo Tucson está no dicionário
        System.out.println("O modelo Tucson no dicionário:"+" "+ carrosPopulares.containsKey("Tucson"));

        // Verificar o consumo do Uno
        System.out.println(" O consumo do Uno é:"+" "+ carrosPopulares.get("Uno")+" "+ "km/l");

        //



    }
}
