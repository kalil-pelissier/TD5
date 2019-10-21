package fr.umontpellier.iut.documents;

import java.time.LocalDate;

public class CalculDate {

    public static  LocalDate ajouter(int nbJours){
        return LocalDate.now().plusDays(nbJours);
    }
}
