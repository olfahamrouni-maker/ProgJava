import java.util.Scanner;

public class Decalage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phrase;
        int decalage;

        // Vérifier que la phrase est en minuscules
        do {
            System.out.print("Entrez une phrase en minuscules : ");
            phrase = sc.nextLine();
        } while (!phrase.equals(phrase.toLowerCase()));

        // Vérifier que le décalage est positif
        do {
            System.out.print("Entrez le décalage (positif) : ");
            decalage = sc.nextInt();
        } while (decalage <= 0);

        String resultat = "";

        // Parcourir chaque caractère
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (c >= 'a' && c <= 'z') {  
                // Appliquer le décalage circulaire
                char nouveau = (char) ((c - 'a' + decalage) % 26 + 'a'); //utilisation de code ascii
                resultat += nouveau;
            } else {
                // Garder les caractères non alphabétiques
                resultat += c;
            }
        }

        // Affichage du résultat
        System.out.println("Phrase codée : " + resultat);

        sc.close();
    }
}
