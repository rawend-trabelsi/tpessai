package ppp;

public class Agence {
    V[] tab; 
    private int max; 
    static int nb;  
    public Agence(int max) {
        this.max = max;
        this.nb = 0;
        this.tab = new V[max];
    }

    public boolean ajouterVehicule(V vehicule) {
        if (nb < max) {
            tab[nb] = vehicule;
            nb++;
            return true;
        } else {
            System.out.println("Le tableau de véhicules est plein, impossible d'ajouter plus de véhicules.");
            return false;
        }
    }

    public void selection(int n) {
        if (n >= 0 && n < nb) {
            V vehicule = tab[n];
            if (vehicule != null) {
                vehicule.decrisVehicule();
            } else {
                System.out.println("La case numéro " + n + " est vide.");
            }
        } else {
            System.out.println("La case numéro " + n + " n'existe pas.");
        }
    }

    public void selection(String mq) {
        boolean found = false;

        for (int i = 0; i < nb; i++) {
            V vehicule = tab[i];
            if (vehicule != null && vehicule.getMarque().equalsIgnoreCase(mq)) {
                vehicule.decrisVehicule();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Il n'y a pas de véhicules de la marque " + mq + " dans l'agence.");
        }
    }

    public void selection(double px) {
        boolean found = false;

        for (int i = 0; i < nb; i++) {
            V vehicule = tab[i];
            if (vehicule.getPrix() > px) {
                vehicule.decrisVehicule();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Il n'y a pas de véhicules dans cette marge de prix.");
        }
    }
}
