package org.example;

import java.time.LocalDate;

public class typePaiement {
    public enum TypePaiement {
        MENSUEL,
        ANNUEL
    }

    private int id;
    private double montantPaie;
    private LocalDate datePaie;

    public typePaiement(int id, double montantPaie, LocalDate datePaie) {
        this.id = id;
        this.montantPaie = montantPaie;
        this.datePaie = datePaie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontantPaie() {
        return montantPaie;
    }

    public void setMontantPaie(double montantPaie) {
        this.montantPaie = montantPaie;
    }

    public LocalDate getDatePaie() {
        return datePaie;
    }

    public void setDatePaie(LocalDate datePaie) {
        this.datePaie = datePaie;
    }
}
