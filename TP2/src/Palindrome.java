import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture de la chaîne
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();

        // Épuration : garder uniquement les lettres et convertir en minuscules
        String epuree = "";
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isLetterOrDigit(c)) { // ne garder que les caractères alphanumériques
                epuree += Character.toLowerCase(c); // concaténation
            }
        }

        // Vérification du palindrome
        boolean palindrome = true;
        int debut = 0;
        int fin = epuree.length() - 1;

        while (debut < fin) {
            if (epuree.charAt(debut) != epuree.charAt(fin)) {
                palindrome = false;
                break;
            }
            debut++;
            fin--;
        }

        // Résultat
        if (palindrome) {
            System.out.println("La phrase est un palindrome.");
        } else {
            System.out.println("La phrase n'est pas un palindrome.");
        }

        sc.close();
    }
}
