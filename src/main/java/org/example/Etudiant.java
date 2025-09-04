package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Etudiant {
    private final int id;
    private final String nom;
    private final String prenom;
    private final LocalDateTime dateEntre;
    private String groupe;
    private List<RaisonChangementGroupe> raisonChangements;

    public Etudiant(int id, String nom, String prenom, LocalDateTime dateEntre, String groupe, List<RaisonChangementGroupe> raisonChangements) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntre = dateEntre;
        this.groupe = groupe;
        this.raisonChangements = raisonChangements;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDateTime getDateEntre() {
        return dateEntre;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public List<RaisonChangementGroupe> getRaisonChangements() {
        return raisonChangements;
    }

    public void setRaisonChangements(List<RaisonChangementGroupe> raisonChangements) {
        this.raisonChangements = raisonChangements;
    }
}
