package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        ecrireTableMultiplication(5);
    }
    void ecrireTableMultiplication(int nombre){
        for(int multiplicateur = 0; multiplicateur <= 10; multiplicateur++ ){
            int resultat = nombre * multiplicateur;
            System.out.println(resultat);
        }

    }
}