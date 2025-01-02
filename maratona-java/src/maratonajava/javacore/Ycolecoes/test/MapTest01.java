package maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mauze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); // retorna apenas se a ache não estiver associada a um valor

        System.out.println(map);

        for (String key : map.keySet()) { // chave
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("----------------------");

        for (String value : map.values()) { // valor
            System.out.println(value);
        }

        System.out.println("----------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
