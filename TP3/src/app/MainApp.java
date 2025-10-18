package app;

import java.time.LocalDate;
import java.util.Scanner;

import model.Formateur;
import model.Formation;
import model.Participant;
import service.FormationService;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FormationService service = new FormationService();

        int choix;
        do {
            System.out.println("\n--- Menu Gestion Centre de Formation ---");
            System.out.println("1. Ajouter une nouvelle formation");
            System.out.println("2. Supprimer une formation");
            System.out.println("3. Rechercher une formation");
            System.out.println("4. Afficher toutes les formations");
            System.out.println("5. Ajouter un participant à une formation");
            System.out.println("6. Afficher les participants d’une formation");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("ID formation : ");
                    int idF = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titre : ");
                    String titre = sc.nextLine();
                    System.out.print("Date de début (AAAA-MM-JJ) : ");
                    LocalDate dateDebut = LocalDate.parse(sc.nextLine());
                    System.out.print("Durée (en jours) : ");
                    int duree = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID formateur : ");
                    int idFormateur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nom formateur : ");
                    String nomFormateur = sc.nextLine();
                    System.out.print("Spécialité formateur : ");
                    String specialite = sc.nextLine();

                    Formateur formateur = new Formateur(idFormateur, nomFormateur, specialite);
                    Formation formation = new Formation(idF, titre, dateDebut, duree, formateur);
                    service.ajouterFormation(formation); // message déjà géré dans le service
                    break;

                case 2:
                    System.out.print("ID de la formation à supprimer : ");
                    int idSup = sc.nextInt();
                    sc.nextLine();
                    service.supprimerFormation(idSup); // message déjà géré dans le service
                    break;

                case 3:
                    System.out.print("ID de la formation à rechercher : ");
                    int idRech = sc.nextInt();
                    sc.nextLine();
                    Formation rech = service.rechercherFormation(idRech);
                    if (rech != null) {
                        System.out.println(rech);
                    } else {
                        System.out.println("Erreur : formation introuvable.");
                    }
                    break;

                case 4:
                    service.afficherFormations();
                    break;

                case 5:
                    System.out.print("ID de la formation : ");
                    int idPart = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID participant : ");
                    int idP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nom participant : ");
                    String nomP = sc.nextLine();
                    System.out.print("Email participant : ");
                    String emailP = sc.nextLine();
                    Participant participant = new Participant(idP, nomP, emailP);
                    service.ajouterParticipant(idPart, participant); // message déjà géré
                    break;

                case 6:
                    System.out.print("ID de la formation : ");
                    int idAff = sc.nextInt();
                    sc.nextLine();
                    service.afficherParticipants(idAff); // message déjà géré
                    break;

                case 7:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 7);

        sc.close();
    }
}
