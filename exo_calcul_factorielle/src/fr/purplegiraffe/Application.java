package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale()
    {
        int n = ConsoleReader.readInt("indiquez le chiffre");
        calculFactorielle(n);
    }
    void calculFactorielle(int n)
    {
        int resultat = 1;

        for (int multiplicateur = 1; multiplicateur <= n; multiplicateur++)
        {
           //afficher les multiplications
            System.out.println(multiplicateur);
            if(multiplicateur < n){
                System.out.print("x");
            }
            resultat = resultat * multiplicateur ;

        }
        System.out.println(resultat);

    }
}

