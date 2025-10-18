package service;

import java.util.ArrayList;
import model.Formation;
import model.Participant;

public class FormationService {
    private ArrayList<Formation> formations;

    public FormationService() {
        this.formations = new ArrayList<>();
    }

    // Ajouter une formation uniquement si l'ID n'existe pas déjà
    public void ajouterFormation(Formation formation) {
        if (rechercherFormation2(formation.getId(),formation.getTitre()) == null) {
            formations.add(formation);
            System.out.println("Formation ajoutée avec succès !");
        } else {
            System.out.println("Erreur : une formation avec cet ID et ce titre existe déjà.");
        }
    }

    // Supprimer une formation uniquement si elle existe
    public void supprimerFormation(int id) {
        Formation f = rechercherFormation(id);
        if (f != null) {
            formations.remove(f);
            System.out.println("Formation supprimée avec succès !");
        } else {
            System.out.println("Erreur : formation introuvable.");
        }
    }

 // Rechercher une formation par son identifiant et son nom
    public Formation rechercherFormation(int id) {
        for (Formation f : formations) {
            if (f.getId() == id ) {
                return f;
            }
        }
        return null;
    }
    // Rechercher une formation par son identifiant et son nom
    public Formation rechercherFormation2(int id, String titre) {
        for (Formation f : formations) {
            if (f.getId() == id || f.getTitre().equalsIgnoreCase(titre)) {
                return f;
            }
        }
        return null;
    }


    // Afficher toutes les formations
    public void afficherFormations() {
        if (formations.isEmpty()) {
            System.out.println("Aucune formation enregistrée.");
        } else {
            for (Formation f : formations) {
                System.out.println(f);
            }
        }
    }

    // Ajouter un participant à une formation existante
    public void ajouterParticipant(int idFormation, Participant participant) {
        Formation formation = rechercherFormation(idFormation);
        if (formation != null) {
            formation.addParticipant(participant);
            System.out.println("Participant ajouté avec succès.");
        } else {
            System.out.println("Erreur : formation introuvable.");
        }
    }

    // Afficher les participants d'une formation
    public void afficherParticipants(int idFormation) {
        Formation formation = rechercherFormation(idFormation);
        if (formation != null) {
            if (formation.getParticipants().isEmpty()) {
                System.out.println("Aucun participant inscrit à cette formation.");
            } else {
                for (Participant p : formation.getParticipants()) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Erreur : formation introuvable.");
        }
    }
}
