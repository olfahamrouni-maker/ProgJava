import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        // Lecture et validation des trois entiers à 3 chiffres
        do {
            System.out.print("Entrez le 1er entier (a) à 3 chiffres :");
            a = sc.nextInt();
        } while (a < 100 || a > 999);

        do {
            System.out.print("Entrez le 2ème entier (b) à 3 chiffres:");
            b = sc.nextInt();
        } while (b < 100 || b > 999);

        do {
            System.out.print("Entrez le 3ème entier (c) à 3 chiffres:");
            c = sc.nextInt();
        } while (c < 100 || c > 999);
        // Affichage des valeurs avant permutation
        System.out.println("\nAvant permutation :");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        // Permutation : b -> a, c -> b, a -> c
        int temp = a;
        a = b;
        b = c;
        c = temp;
        // Affichage des valeurs après permutation
        System.out.println("\nAprès permutation :");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        sc.close();
    }
}