package fr.umontpellier.iut.documents;

import fr.umontpellier.iut.politique.PolitiqueEmprunt;

import java.time.LocalDate;

public abstract class Document {
    private LocalDate dateRetour;
    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    protected void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getTitre() {
        return titre;
    }

    public abstract void emprunter(PolitiqueEmprunt p);

    @Override
    public String toString() {
        return "[titre = " + titre + ", " +
                (dateRetour == null ? " non emprunté" : "Retour le " + dateRetour) + "]";
    }
}
