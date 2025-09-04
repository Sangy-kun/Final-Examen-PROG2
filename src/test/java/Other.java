import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Other {


    public class Frais {
        private final int id;
        private final String label;
        private final double montant;
        private final LocalDateTime deadline;
        private final List<Paiement> paiements;

        public Frais(int id, String label, double montant, LocalDateTime deadline) {
            this.id = id;
            this.label = label;
            this.montant = montant;
            this.deadline = deadline;
            this.paiements = new ArrayList<>();
        }

        public StatusFrais getStatus(LocalDateTime instant) {
            double totalPaye = paiements.stream()
                    .filter(p -> !p.getDatePaiement().isAfter(instant))
                    .mapToDouble(Paiement::getMontant)
                    .sum();

            if (totalPaye > montant) {
                return StatusFrais.OVERPAID;
            }
            if (totalPaye == montant) {
                return StatusFrais.PAID;
            }
            if (instant.isAfter(deadline)) {
                return StatusFrais.LATE;
            }
            return StatusFrais.IN_PROGRESS;
        }

        // Getters
        public int getId() { return id; }
        public String getLabel() { return label; }
        public double getMontant() { return montant; }
        public LocalDateTime getDeadline() { return deadline; }
        public Etudiant getEtudiant() { return etudiant; }
        public List<Paiement> getPaiements() { return paiements; }

        public void addPaiement(Paiement paiement) {
            paiements.add(paiement);
        }
    }
    public class Groupe {
        private final int id;
        private final String nom;

        public Groupe(int id, String nom) {
            this.id = id;
            this.nom = nom;
        }

        public int getId() { return id; }
        public String getNom() { return nom; }
    }
```

}
