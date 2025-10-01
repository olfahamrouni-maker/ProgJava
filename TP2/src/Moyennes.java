
import java.util.ArrayList;
import java.util.Scanner;

public class Moyennes{
    public static void main(String[] args) {
        final int MAX = 40; // nombre maximum d'étudiants
        Scanner sc = new Scanner(System.in);

        // Lire le nombre d'étudiants
        int n;
        do {
            System.out.print("Entrez le nombre d'étudiants (1 à " + MAX + ") : ");
            n = sc.nextInt();
        } while (n < 1 || n > MAX);

        // Lire les moyennes des étudiants
        ArrayList<Double> moyennes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double moyenne;
            do {
                System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " ( de 0 à 20) : ");
                moyenne = sc.nextDouble();
            } while (moyenne < 0 || moyenne > 20);
            moyennes.add(moyenne);
        }

        // Calcul de la moyenne de la classe
        double somme = 0;
        for (double m : moyennes) {
            somme += m;
        }
        double moyenneClasse = somme / n;

        // Calcul du max et min
        double max = moyennes.get(0);
        double min = moyennes.get(0);

        for (int i = 1; i < moyennes.size(); i++) {
            if (moyennes.get(i) > max) {
                max = moyennes.get(i);
            }
            if (moyennes.get(i) < min) {
                min = moyennes.get(i);
            }
        }

        // Nombre d'étudiants ayant une moyenne >= moyenne de la classe
        int nb = 0;
        for (double m : moyennes) {
            if (m >= moyenneClasse) {
                nb++;
            }
        }

        // Affichage des résultats
        System.out.println("\n=== Résultats ===");
        System.out.printf("Moyenne de la classe : %.2f%n", moyenneClasse);
        System.out.println("Moyenne maximale : " + max);
        System.out.println("Moyenne minimale : " + min);
        System.out.println("Nombre d'étudiants ayant une moyenne >= à la moyenne de la classe : " + nb);

        sc.close();
    }
}
