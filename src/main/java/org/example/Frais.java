package org.example;

import java.time.LocalDateTime;

public class Frais {
    private int id;
    private String label;
    private double montant;
    private LocalDateTime deadline;
    private TypePaiement type;

    public Frais(int id, String label, double montant, LocalDateTime deadline, TypePaiement types) {
        this.id = id;
        this.label = label;
        this.montant = montant;
        this.deadline = deadline;
        this.type = types;
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

    public TypePaiement getType() {
        return type;
    }

    public void setType(TypePaiement type) {
        this.type = type;
    }
}
