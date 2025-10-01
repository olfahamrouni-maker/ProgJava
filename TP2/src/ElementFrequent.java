import java.util.ArrayList;
import java.util.Scanner;

public class ElementFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lire n
        int n;
        do {
            System.out.print("Entrez le nombre d'entiers (n > 0) : ");
            n = sc.nextInt();
        } while (n <= 0);

        // Remplir l'ArrayList
        ArrayList<Integer> tableau = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'entier " + (i + 1) + " : ");
            tableau.add(sc.nextInt());
        }

        // Recherche de l'élément le plus fréquent
        int maxOcc = 0;
        int elementFrequent = tableau.get(0);

        for (int i = 0; i < tableau.size(); i++) {
            int courant = tableau.get(i);
            int occ = 0;//Nombre d'occurrences de l'élément courant

            // compter les occurrences de courant
            for (int j = 0; j < tableau.size(); j++) {
                if (tableau.get(j) == courant) {
                    occ++;
                }
            }

            // mise à jour si plus fréquent trouvé
            if (occ > maxOcc) {
                maxOcc = occ;
                elementFrequent = courant;
            }
        }

        // Affichage du résultat
        System.out.println("\n=== Résultat ===");
        System.out.println("Élément le plus fréquent : " + elementFrequent);
        System.out.println("Nombre d'occurrences : " + maxOcc);

        sc.close();
    }
}
