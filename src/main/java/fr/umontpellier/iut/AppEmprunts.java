package fr.umontpellier.iut;

import java.util.HashMap;
import fr.umontpellier.iut.documents.Document;

public class AppEmprunts {

    private static HashMap<String, Document> fonds = new HashMap<>();

    public static void constituerFonds() {
        throw new RuntimeException("Méthode à implémenter");
    }

    public static void main(String[] args) {
        constituerFonds();

        throw new RuntimeException("Méthode à implémenter");
    }
}
