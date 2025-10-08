package etudecas;

import etudecas.compagnieAssurance.compagnieAssurance;
import etudecas.assurance.assurance;

public class Main {
    public static void main(String[] args) {
        compagnieAssurance compagnie = new compagnieAssurance(001, "AssurPlus");

        compagnie.ajouterAssurance(new assurance(001, "Assurance Auto", 800.0, "Auto"));
        compagnie.ajouterAssurance(new assurance(002, "Assurance Habitation", 600.0, "Habitation"));
        compagnie.ajouterAssurance(new assurance(003, "Assurance Vie", 1200.0, "Vie"));
        compagnie.ajouterAssurance(new assurance(004, "Assurance Vie Premium", 1600.0, "Vie"));

        System.out.println("💰 Avant modification :");
        compagnie.afficherAssurances();

        compagnie.modifierPrixAssurance();

        System.out.println("\n💰 Après modification :");
        compagnie.afficherAssurances();
    }
}