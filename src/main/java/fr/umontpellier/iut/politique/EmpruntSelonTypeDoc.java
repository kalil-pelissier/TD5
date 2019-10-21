package fr.umontpellier.iut.politique;

import fr.umontpellier.iut.documents.CD;
import fr.umontpellier.iut.documents.Film;
import fr.umontpellier.iut.documents.Livre;

import java.time.LocalDate;

public class EmpruntSelonTypeDoc implements PolitiqueEmprunt {
    @Override
    public LocalDate calculerDateRetour(Livre livre) {
            return null;
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return null;
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return null;
    }
}
