package ppp;

public class V {
    private int number;
    private String marque;
    private String modele;
    private int annee;
    private double prix;
    private static int count;

    public V(String marque, String modele, int annee, double prix) {
        count++;
        number = count;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }

    void decrisVehicule() {
        System.out.println("Marque: " + marque + ", Modèle: " + modele + ", Prix: " + prix + ", Année: " + annee);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static int getCount() {
        return count;
    }
}
