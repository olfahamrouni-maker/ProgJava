package service;

import java.util.ArrayList;

import model.Tache;

public class GestionTaches {
    private ArrayList<Tache> listeTaches;

    public GestionTaches() {
        listeTaches = new ArrayList<>();
    }
    
    
    public ArrayList<Tache> getListeTaches() {
		return listeTaches;
	}



	public void setListeTaches(ArrayList<Tache> listeTaches) {
		this.listeTaches = listeTaches;
	}

	
	// Rechercher une tâche par id
    public Tache chercherTache(int id) {
        for (Tache t : listeTaches) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
  
      
    // Ajouter une tâche
    public boolean ajouterTache(Tache t) {
    	if (chercherTache(t.getId())==null)
    		{
    		listeTaches.add(t);
    		return true;
    		}
    	else return false;
    }
    
 // Afficher toutes les tâches 
    public void afficherToutesTaches() {
        for (Tache t : listeTaches) {         
                System.out.println(t);
        }
    }
    
    // Afficher uniquement les tâches non terminées
    public void afficherTachesNonTerminees() {
        for (Tache t : listeTaches) {
            if (!t.estTerminee()) {
                System.out.println(t);
            }
        }
    }

   

    // Supprimer une tâche par id (sans Iterator)
    public boolean supprimerTache(int id) {
        for (int i = 0; i < listeTaches.size(); i++) {
            if (listeTaches.get(i).getId() == id) {
                listeTaches.remove(i);
                return true;
            }
        }
        return false;
    }
}
