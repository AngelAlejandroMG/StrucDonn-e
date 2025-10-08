package etudecas.assurance;

public class assurance {
    private int code;
    private String nom;
    private double prix;
    private String type; 

    public assurance(int code, String nom, double prix, String type) {
        this.code = code;
        this.nom = nom;
        this.prix = prix;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Assurance{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", type='" + type + '\'' +
                '}';
    }
}
