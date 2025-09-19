import java.util.Scanner;
public class Fondue {
    public static void main(String[] args) {
        // Constante BASE : recette prévue pour 6 personnes
        final int BASE = 6;
        // Quantités pour 6 personnes
        double chocolat = 300.0; // en grammes
        double creme    = 10.0;  // en centilitres
        double lait     = 15.0;  // en centilitres
        double banane   = 3.0;   // en nombre
        double beurre   = 50.0;  // en grammes
        Scanner sc = new Scanner(System.in);
        int nbConvives;
        // Boucle de saisie : répéter tant que nbConvives <= 0
        do {
            System.out.print("Entrez le nombre de convives (positif) :   ");
            nbConvives = sc.nextInt();
        } while (nbConvives <= 0);
        // Calcul des nouvelles quantités
        double newChocolat = chocolat * nbConvives / BASE;
        double newCreme    = creme * nbConvives / BASE;
        double newLait     = lait * nbConvives / BASE;
        double newBanane   = banane * nbConvives / BASE;
        double newBeurre   = beurre * nbConvives / BASE;
        // Affichage de la recette adaptée
        System.out.println("\nRecette pour " + nbConvives + " convives :");
        System.out.printf("- Chocolat noir : %.2f g%n", newChocolat);
        System.out.printf("- Crème liquide : %.2f cl%n", newCreme);
        System.out.printf("- Lait          : %.2f cl%n", newLait);
        System.out.printf("- Bananes       : %.2f%n", newBanane);
        System.out.printf("- Beurre        : %.2f g%n", newBeurre);
        sc.close();
    }
}