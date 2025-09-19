import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double poids, taille;
        // Saisie du poids (doit être > 0)
        do {
            System.out.print("Entrez votre poids en kg (positif) : ");
            poids = sc.nextDouble();
        } while (poids <= 0);

        // Saisie de la taille (doit être > 0)
        do {
            System.out.print("Entrez votre taille en mètres (positive) :             ");
            taille = sc.nextDouble();
        } while (taille <= 0);
        // Calcul de l'IMC
        double imc = poids / (taille * taille);
        // Affichage des résultats
        System.out.printf("\nTaille : %.2f m%n", taille);
        System.out.printf("Poids  : %.2f kg%n", poids);
        System.out.printf("IMC    : %.2f%n", imc);
        // Évaluation selon la valeur de l'IMC
        if (imc < 20) {
            System.out.println("Commentaire : Trop maigre");
        } else if (imc <= 25) {
            System.out.println("Commentaire : Normal");
        } else {
            System.out.println("Commentaire : Trop obèse");
        }
        sc.close();
    }
}