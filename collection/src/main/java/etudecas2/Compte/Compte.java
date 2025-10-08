package etudecas2.Compte;

public class Compte implements Comparable<Compte> {
    private String numero;
    private double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" + "numero='" + numero + '\'' + ", solde=" + solde + '}';
    }

    // pour comparer les comptes (tri par numéro)
    @Override
    public int compareTo(Compte other) {
        return this.numero.compareTo(other.numero);
    }

    // pour éviter les doublons dans un Set
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Compte)) return false;
        Compte other = (Compte) obj;
        return this.numero.equals(other.numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }
}