package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        //Exemple d'utilisation
        //int age = ConsoleReader.readInt("Entrez votre age");

        int res = factorielle(16);
        System.out.println(res + 1);
    }

    int factorielle(int n) {
        int resultat = 1;

        for (int compteur = 1; compteur <= n; compteur++) {
            resultat = resultat * compteur;
            System.out.print(compteur);
            if (compteur < n) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + resultat);
        return resultat;
    }
}
