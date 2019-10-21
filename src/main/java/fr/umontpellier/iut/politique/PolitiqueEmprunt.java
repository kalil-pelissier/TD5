package fr.umontpellier.iut.politique;

import fr.umontpellier.iut.documents.CD;
import fr.umontpellier.iut.documents.Film;
import fr.umontpellier.iut.documents.Livre;

import java.time.LocalDate;

public interface PolitiqueEmprunt {

    LocalDate calculerDateRetour(Livre livre);

    LocalDate calculerDateRetour(CD cd);

    LocalDate calculerDateRetour(Film film);
}
