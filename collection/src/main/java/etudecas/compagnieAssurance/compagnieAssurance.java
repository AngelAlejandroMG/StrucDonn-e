package etudecas.compagnieAssurance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import etudecas.assurance.assurance;

public class compagnieAssurance {
    private int numCompagnie;
    private String nomCompagnie;
    private List<etudecas.assurance.assurance> assurances;

    public compagnieAssurance(int numCompagnie, String nomCompagnie) {
        this.numCompagnie = numCompagnie;
        this.nomCompagnie = nomCompagnie;
        this.assurances = new ArrayList<>();
    }

    public int getNumCompagnie() {
        return numCompagnie;
    }

    public void setNumCompagnie(int numCompagnie) {
        this.numCompagnie = numCompagnie;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public List<etudecas.assurance.assurance> getAssurances() {
        return assurances;
    }

    public void setAssurances(List<etudecas.assurance.assurance> assurances) {
        this.assurances = assurances;
    }

    public double chiffreAffaires() {
        double total = 0;
        for (assurance assurance : assurances) {
            total += assurance.getPrix();
        }
        return total;
    }    

    public void ajouterAssurance(assurance assurance) {
        assurances.add(assurance);
        System.out.println("Assurance ajoutée avec succès : " + assurance);
    }


    public void afficherAssurances() {
        List<assurance> copie = new ArrayList<>(assurances);
        copie.sort(Comparator.comparingDouble(assurance::getPrix).reversed());

        System.out.println("Assurances de la compagnuie " + nomCompagnie + " (numéro " + numCompagnie + ") : triées par nom");
        for (assurance assurance : copie) {
            System.out.println(assurance);

        }
        
    }

    public HashMap<Integer, assurance> conversionHashMap() {
        HashMap<Integer, assurance> Assurance = new HashMap<>();
        for (assurance assurance : assurances) {
            Assurance.put(assurance.getCode(), assurance);
        }
        return Assurance;
    }
       
    public void trierMapParCle() {
        HashMap<Integer, assurance> map = conversionHashMap();
        List<HashMap.Entry<Integer, assurance>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparing(entry -> entry.getValue().getCode()));

        System.out.println("Assurances de la compagnie " + nomCompagnie + " (numéro " + numCompagnie + ") triées par code :");
        for (HashMap.Entry<Integer, assurance> entry : entries) {
            System.out.println(entry.getValue());
        }
    }
    
    public void modifierPrixAssurance() {
        
        for (assurance assurance : assurances) {
            int code = assurance.getCode();
           switch (assurance.getType().toLowerCase()) {
            case "Habitation":
                assurance.setPrix(assurance.getPrix() * 1.10);
                break;
            case "Auto":
                assurance.setPrix(assurance.getPrix() * 0.92);
                break;
            case "vie":
                if(code % 2 == 0) {
                    assurance.setPrix(assurance.getPrix() / 4);
                } else {
                    assurance.setPrix(assurance.getPrix() / 3);
                }
            default:
                break;
           }
        }
        System.out.println("Prix des assurances modifiés avec succès.");
    }
}
