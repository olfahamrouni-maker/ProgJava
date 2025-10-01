import java.util.Scanner;

public class MultiplicationMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lignes1, colonnes1, colonnes2;

        // Lecture dimensions de la première matrice (contrôle valeurs > 0)
        do {
            System.out.print("Entrez le nombre de lignes de la première matrice (valeur positive) : ");
            lignes1 = sc.nextInt();
        } while (lignes1 <= 0);
        do {
            System.out.print("Entrez le nombre de colonnes de la première matrice (valeur positive) : ");
            colonnes1 = sc.nextInt();
        } while (colonnes1 <= 0);

        // On impose que lignes2 = colonnes1
        int lignes2 = colonnes1;

        // Lecture colonnes2 avec contrôle
        do {
            System.out.print("Entrez le nombre de colonnes de la deuxième matrice (valeur positive) : ");
            colonnes2 = sc.nextInt();
        } while (colonnes2 <= 0);

        // Déclaration des matrices
        int[][] mat1 = new int[lignes1][colonnes1];
        int[][] mat2 = new int[lignes2][colonnes2];
        int[][] resultat = new int[lignes1][colonnes2];

        // Remplissage de mat1
        System.out.println("\nRemplissage de la première matrice :");
        for (int i = 0; i < lignes1; i++) {
            for (int j = 0; j < colonnes1; j++) {
                System.out.print("mat1[" + i + "][" + j + "] = ");
                mat1[i][j] = sc.nextInt();
            }
        }

        // Remplissage de mat2
        System.out.println("\nRemplissage de la deuxième matrice :");
        for (int i = 0; i < lignes2; i++) {
            for (int j = 0; j < colonnes2; j++) {
                System.out.print("mat2[" + i + "][" + j + "] = ");
                mat2[i][j] = sc.nextInt();
            }
        }

        // Multiplication des matrices
        for (int i = 0; i < lignes1; i++) {
            for (int j = 0; j < colonnes2; j++) {
                resultat[i][j] = 0;
                for (int k = 0; k < colonnes1; k++) {
                    resultat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Affichage du résultat
        System.out.println("\nRésultat de la multiplication des matrices :");
        for (int i = 0; i < lignes1; i++) {
            for (int j = 0; j < colonnes2; j++) {
                System.out.print(resultat[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
