package documents;

import java.time.LocalDate;

public class Document {
    private LocalDate dateRetour;
    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "[titre = " + titre + ", " +
                (dateRetour == null ? " non emprunté" : "Retour le " + dateRetour) + "]";
    }
}
