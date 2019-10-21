package fr.umontpellier.iut;

import java.util.ArrayList;
import java.util.HashMap;

import fr.umontpellier.iut.documents.*;
import fr.umontpellier.iut.politique.EmpruntDateFixe;
import fr.umontpellier.iut.politique.PolitiqueEmprunt;

import javax.print.Doc;

public class AppEmprunts {

    private static HashMap<String, Document> fonds = new HashMap<>();

    public static void constituerFonds() {
        fonds.put("LI_ORW_1", new Livre("1984"));
        fonds.put("LI_TOL_1", new Livre("Le seigneur des anneaux "));
        fonds.put("CD_STO_1", new CD("Satisfaction"));
        fonds.put("CD_BEA_1", new CD("Abbey Road  "));
        fonds.put("FI_KUB_1", new Film("2001 Odyssée de l'espace"));
        fonds.put("FI_SCO_1", new Film("Driver"));
    }

    public static void main(String[] args) {
        constituerFonds();
        ArrayList<Document> panier = new ArrayList<>();
        PolitiqueEmprunt politique = new EmpruntDateFixe();

        panier.add(fonds.get("LI_ORW_1"));
        panier.add(fonds.get("LI_TOL_1"));
        panier.add(fonds.get("CD_STO_1"));
        panier.add(fonds.get("CD_BEA_1"));
        panier.add(fonds.get("FI_KUB_1"));
        panier.add(fonds.get("FI_SCO_1"));

        for (Document var : panier
             ) {
            var.emprunter(politique);
            System.out.println(var);
        }

    }
}
