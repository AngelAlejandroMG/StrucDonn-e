package etudecas2.Map;

import etudecas2.Compte.Compte;

import java.util.*;

public class MapUtils {

    public static void addCompteToMap(Map<String, Compte> map, Compte compte) {
        map.put(compte.getNumero(), compte);
    }

    public static Compte findCompte(Map<String, Compte> map, String numero ) {
        return map.get(numero);
    }

    public static void deleteCompte(Map<String, Compte> map, String numero) {
        map.remove(numero);
    }

    public static void emptyMap(Map<String, Compte> map) {
        map.clear();
    }

    public static Map<String, Compte> sortMap(Map<String,Compte> map) {
        Map<String, Compte> sortedMap = new TreeMap<>(map);
        return sortedMap;
    }
}
