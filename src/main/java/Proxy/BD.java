package Proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Aeroporto> aeroportos = new HashMap<>();

    public static Aeroporto getAeroporto(Integer id) {
        return aeroportos.get(id);
    }

    public static void addAeroporto(Aeroporto aeroporto) {
        aeroportos.put(aeroporto.getMatricula(), aeroporto);
    }
}
