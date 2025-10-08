package etudecas2.Set;

import etudecas2.Compte.Compte;

import java.util.*;

public class SetUtils {
    public static void addCompteToSet(Set<Compte> comptes, Compte compte) {
        comptes.add(compte);
    }

    public static Compte findCompte(Set<Compte> comptes, String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumero().equals(numero)) {
                return compte;
            }
        }
        return null; 
    }

    public static void deleteCompte(Set<Compte> set, String numero) {
        set.removeIf(c -> c.getNumero().equals(numero));
    }

    public static void emptySet(Set<Compte> set) {
        set.clear();
    }

    public static Set<Compte> sortSet(Set<Compte> set) {
        Set<Compte> sorted = new TreeSet<>(set); // TreeSet trie automatiquement
        return sorted;
    }

}
