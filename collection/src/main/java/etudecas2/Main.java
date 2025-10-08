package etudecas2;

import etudecas2.Compte.Compte;
import etudecas2.List.ListUtils;
import etudecas2.Map.MapUtils;
import etudecas2.Set.SetUtils;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ========== TEST LIST ==========
        List<Compte> comptesList = new ArrayList<>();
        ListUtils.addCompteToList(comptesList, new Compte("C003", 3000));
        ListUtils.addCompteToList(comptesList, new Compte("C001", 1500));
        ListUtils.addCompteToList(comptesList, new Compte("C002", 2500));

        System.out.println(" Liste avant tri : " + comptesList);
        ListUtils.sortList(comptesList);
        System.out.println(" Liste après tri : " + comptesList);

        Compte c = ListUtils.findCompte(comptesList, "C002");
        System.out.println(" Compte trouvé dans List : " + c);

        ListUtils.deleteCompte(comptesList, "C001");
        System.out.println(" Liste après suppression : " + comptesList);

        // ========== TEST SET ==========
        Set<Compte> comptesSet = new HashSet<>();
        SetUtils.addCompteToSet(comptesSet, new Compte("C003", 3000));
        SetUtils.addCompteToSet(comptesSet, new Compte("C001", 1500));
        SetUtils.addCompteToSet(comptesSet, new Compte("C002", 2500));

        System.out.println("\n Set avant tri : " + comptesSet);
        Set<Compte> sortedSet = SetUtils.sortSet(comptesSet);
        System.out.println(" Set trié : " + sortedSet);

        // ========== TEST MAP ==========
        Map<String, Compte> comptesMap = new HashMap<>();
        MapUtils.addCompteToMap(comptesMap, new Compte("C003", 3000));
        MapUtils.addCompteToMap(comptesMap, new Compte("C001", 1500));
        MapUtils.addCompteToMap(comptesMap, new Compte("C002", 2500));

        System.out.println("\n Map avant tri : " + comptesMap);
        Map<String, Compte> sortedMap = MapUtils.sortMap(comptesMap);
        System.out.println(" Map triée : " + sortedMap);

        Compte cMap = MapUtils.findCompte(comptesMap, "C001");
        System.out.println(" Compte trouvé dans Map : " + cMap);

        MapUtils.deleteCompte(comptesMap, "C002");
        System.out.println(" Map après suppression : " + comptesMap);
    }
}