package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {

    public void fonctionPrincipale() {

        dessinerCarre(6, " # ");
    }

    void dessinerCarre(int taille, String caractere) {
        for (int ligne = 0; ligne < taille; ligne++) {
            //dessiner la ligne
            for (int colonne = 0; colonne < taille; colonne++) {
                System.out.print(caractere);
            }

            //sauter une ligne
            System.out.println();
        }
    }
}
