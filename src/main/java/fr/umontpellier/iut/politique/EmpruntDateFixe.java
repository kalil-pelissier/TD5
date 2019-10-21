package fr.umontpellier.iut.politique;

import fr.umontpellier.iut.documents.CD;
import fr.umontpellier.iut.documents.CalculDate;
import fr.umontpellier.iut.documents.Film;
import fr.umontpellier.iut.documents.Livre;

import java.time.LocalDate;

public class EmpruntDateFixe implements PolitiqueEmprunt {
    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return CalculDate.ajouter(20);
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return CalculDate.ajouter(10);
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return CalculDate.ajouter(5);
    }
}
