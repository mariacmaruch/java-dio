package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        Map<String, String> estadosBr = new HashMap<>();

        estadosBr.put("MG", "Minas Gerais");
        estadosBr.put("SP", "São Paulo");
        estadosBr.put("RJ", "Rio de Janeiro");
        estadosBr.put("ES", "Espírito Santo");
        estadosBr.put("AC", "Acre");
        estadosBr.put("MS", "Mato Grosso do Sul");
        estadosBr.put("SC", "Santa Catarina");
        estadosBr.put("PE", "Pernambuco");
        estadosBr.put("CE", "Ceára");

        System.out.println(estadosBr);
        estadosBr.remove("MG");
        estadosBr.put("DF", "Distrito Federal");
        System.out.println("Sem MG e com acréscimo do DF: " + estadosBr);

        System.out.println("Tamanho:" + estadosBr.size());

        estadosBr.remove("MS", "Mato Grosso do Sul");
        System.out.println("Sem MS: " + estadosBr);

        for (String key : estadosBr.keySet()){
            System.out.println(estadosBr.get(key) +"(" + key + ")");
        }

        System.out.println("Possui o estado Santa Catarina? " + estadosBr.containsKey("SC"));
        System.out.println("Possui o estado Maranhão? " + estadosBr.containsValue("Maranhão"));




    }


}
