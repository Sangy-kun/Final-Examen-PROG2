package org.example;

import java.util.List;

public class RaisonChangementGroupe {
    private List<Etudiant> etudiants;
    private String raison;
    private String date;
    private String groupe;

    public RaisonChangementGroupe(List<Etudiant> etudiants, String raison, String date, String groupe) {
        this.etudiants = etudiants;
        this.raison = raison;
        this.date = date;
        this.groupe = groupe;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }
}
