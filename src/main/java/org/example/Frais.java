package org.example;

import java.time.LocalDateTime;

public class Frais {
    private int id;
    private String label;
    private double montant;
    private LocalDateTime deadline;

    public Frais(int id, String label, double montant, LocalDateTime deadline) {
        this.id = id;
        this.label = label;
        this.montant = montant;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Frais{" + "id=" + id + ", label=" + label + ", montant=" + montant + ", deadline=" + deadline + '}';
    }

    private String statusFrais(){
        if (montant == 0 && deadline.isBefore(getDeadline())){
            return "IN_PROGRESS";
        } else if (montant == 0 && deadline.isAfter(getDeadline())){
            return "LATE";
        } else if (montant == getMontant() && deadline.isBefore(getDeadline())){
            return "PAID";
        } else if (montant > getMontant() && deadline.isAfter(getDeadline())){
            return "OVERPAID";
        }
        return statusFrais();
    }



}
