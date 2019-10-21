package fr.umontpellier.iut.documents;

import fr.umontpellier.iut.politique.PolitiqueEmprunt;

public class Film extends Document {
    public Film(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "[titre = " + super.getTitre() + ", " +
                (super.getDateRetour() == null ? " non emprunté" : "Retour le " + super.getDateRetour()) + "]";
    }

    @Override
    public void emprunter(PolitiqueEmprunt p) {
        this.setDateRetour(p.calculerDateRetour(this));
    }
}
