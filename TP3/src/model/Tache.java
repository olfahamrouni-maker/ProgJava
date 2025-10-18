package model;

public class Tache {
    private int id;
    private String description;
    private boolean terminee;

    // Constructeur
    public Tache(int id, String description) {
        this.id = id;
        this.description = description;
        this.terminee = false; // par défaut non terminée
    }

    // Méthode pour marquer comme terminée
    public void marquerTerminee() {
        this.terminee = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public boolean estTerminee() {
        return terminee;
    }
    //Setters
    public void setDescription(String description) {
		this.description = description;
	}

	public void setTerminee(boolean terminee) {
		this.terminee = terminee;
	}

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Tâche #" + id + " : " + description + 
               (terminee ? " (Terminée)" : " (Non terminée)");
    }
}
