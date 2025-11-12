import java.util.ArrayList;

public class BoiteAuxLettres {
    private ArrayList<Courrier> courriers;

    public BoiteAuxLettres() {
        courriers = new ArrayList<>();
    }

    public void ajouterCourrier(Courrier c) {
        courriers.add(c);
    }

    public double affranchir() {
        double total = 0;
        for (Courrier c : courriers) {
            total += c.affranchir();
        }
        return total;
    }

    public int courriersInvalides() {
        int count = 0;
        for (Courrier c : courriers) {
            if (c.estInvalide()) count++;
        }
        return count;
    }

    public void afficher() {
        for (Courrier c : courriers) {
            System.out.println(c);
        }
        System.out.println("#########################################################");
        System.out.println("Nombre de courriers invalides : " + courriersInvalides());
        System.out.printf("Montant total d'affranchissement : %.2f DT\n", affranchir());
    }
}
