package fr.umontpellier.iut.politique;

import fr.umontpellier.iut.emprunteurs.Emprunteur;

public class AvantageStatut implements AvantageEmprunteur{
    @Override
    public int getBonusEmprunteur(Emprunteur emprunteur) {
        return 0;
    }
}
