public class Compte {
    private int idCpte;
    private String firstName;
    private String lastName;
    private double solde;

    public Compte(int idCpte, String firstName, String lastName, double solde) {
        this.idCpte = idCpte;
        this.firstName = firstName;
        this.lastName = lastName;
        this.solde = solde;
    }

    public int getIdCpte() {
        return idCpte;
    }

    public void setIdCpte(int idCpte) {
        this.idCpte = idCpte;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }



    public static void main(String[] args) {

    }
}
