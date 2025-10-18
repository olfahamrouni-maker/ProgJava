package app;

import java.util.Scanner;

import model.Tache;
import service.GestionTaches;

public class Main {
    public static void main(String[] args) {
        GestionTaches gestion = new GestionTaches();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n================= Menu Gestion des Tâches =================");
            System.out.println("1. Ajouter une nouvelle tâche");
            System.out.println("2. Afficher toutes les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Afficher toutes les tâches non terminées");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // vider le buffer

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'identifiant : ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Entrez la description : ");
                    String desc = sc.nextLine();
                    boolean ok = gestion.ajouterTache(new Tache(id, desc));
                    if (ok) System.out.println("Tâche ajoutée avec succès.");
                    else System.out.println("Tâche existe déjà.");
                    break;

                case 2:
                    System.out.println("Toutes les tâches  :");
                    gestion.afficherToutesTaches();
                    break;
                    
                case 3:
                    System.out.print("Entrez l'identifiant de la tâche à marquer terminée : ");
                    id = sc.nextInt();
                    Tache t = gestion.chercherTache(id);
                    if (t != null) {
                        t.marquerTerminee();
                        System.out.println("Tâche marquée comme terminée.");
                    } else {
                        System.out.println("Tâche introuvable.");
                    }
                    break;

                case 4:
                    System.out.print("Entrez l'identifiant de la tâche à supprimer : ");
                    id = sc.nextInt();
                    if (gestion.supprimerTache(id)) {
                        System.out.println("Tâche supprimée.");
                    } else {
                        System.out.println("Tâche introuvable.");
                    }
                    break;

                case 5:
                    System.out.println("Tâches non terminées :");
                    gestion.afficherTachesNonTerminees();
                    break;

                case 6:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 6);

        sc.close();
    }
}
