package org.example.facture;

public class Client implements Comparable<Client> {
    private int numCompte;
    private String nom;
    private String prenom;
    private double solde;


    public Client(int numCompte, String nom, String prenom, double solde) {
        this.numCompte = numCompte;
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "client{" +
                "numCompte=" + numCompte +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", solde=" + solde +
                '}';
    }

    @Override
    public int compareTo(Client client) {
        return Integer.compare(this.numCompte, client.numCompte);
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
