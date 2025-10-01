import java.util.ArrayList;
import java.util.Scanner;

public class ProduitScalaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lire n
        int n;
        do {
            System.out.print("Entrez la taille des tableaux (n > 0) : ");
            n = sc.nextInt();
        } while (n <= 0);

        // Déclaration des deux ArrayList
        ArrayList<Integer> tab1 = new ArrayList<>();
        ArrayList<Integer> tab2 = new ArrayList<>();

        // Remplissage du premier tableau
        System.out.println("\n--- Remplissage du premier tableau ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " de tab1 : ");
            tab1.add(sc.nextInt());
        }

        // Remplissage du deuxième tableau
        System.out.println("\n--- Remplissage du deuxième tableau ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " de tab2 : ");
            tab2.add(sc.nextInt());
        }

        // Calcul du produit scalaire
        int produitScalaire = 0;
        for (int i = 0; i < n; i++) {
            produitScalaire += tab1.get(i) * tab2.get(i);
        }

        // Affichage du résultat
        System.out.println("\n=== Résultat ===");
        System.out.println("Le produit scalaire des deux tableaux est : " + produitScalaire);

        sc.close();
    }
}
