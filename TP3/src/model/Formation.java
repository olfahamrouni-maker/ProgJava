package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Formation {
    private int id;
    private String titre;
    private LocalDate dateDebut;
    private int duree; // en jours
    private Formateur formateur;
    private ArrayList<Participant> participants;

    public Formation(int id, String titre, LocalDate dateDebut, int duree, Formateur formateur) {
        this.id = id;
        this.titre = titre;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.formateur = formateur;
        this.participants = new ArrayList<>();
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }

    @Override
    public String toString() {
        return "Formation [id=" + id + ", titre=" + titre + ", dateDebut=" + dateDebut +
                ", durée=" + duree + " jours, formateur=" + formateur.getNom() + "]";
    }
}
