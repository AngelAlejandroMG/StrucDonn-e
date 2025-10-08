package etudecas2.List;

import etudecas2.Compte.Compte;

import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class ListUtils {
    public static void addCompteToList(List<Compte> comptes, Compte compte) {
        comptes.add(compte);
    }

    public static Compte findCompte(List<Compte> liste, String numero) {
        for (Compte compte : liste) {
            if (compte.getNumero().equals(numero)) {
                return compte;
            }
        }
        return null; 
    }

    public static void deleteCompte(List<Compte> liste, String numero) {
        liste.removeIf(compte -> compte.getNumero().equals(numero));
    }

    public static void emptyList(List<Compte> liste) {
        liste.clear();
    }

    public static void sortList(List<Compte> liste) {
        Collections.sort(liste);
    }   
}
