package ppp;

public class Main {
    public static void main(String[] args) {
        Agence agence = new Agence(3);

        V v = new V("Clio", "Classique", 2000, 20000);
        V w = new V("Mercedes", "Fantôme", 2008, 60000);
        V x = new V("KIA", "Picanto", 2012, 35000);

        agence.ajouterVehicule(v);
        agence.ajouterVehicule(w);
        agence.ajouterVehicule(x);

        System.out.println("Caractéristiques de chaque véhicule :");
        for (int i = 0; i <agence.nb; i++) {
            System.out.println("Véhicule numéro " + i + ":");
            agence.selection(i);
            System.out.println();
        }

        System.out.println("Sélection de véhicules de la marque Mercedes :");
        agence.selection("Mercedes");

        System.out.println("\nSélection de véhicules avec un prix inférieur à 40 000 :");

        for (int i = 0; i < Agence.nb; i++) {
            V vehicule = agence.tab[i];
            if (vehicule != null && vehicule.getPrix() < 40000) {
                vehicule.decrisVehicule();
            }
        }

        
    }
    }
 
