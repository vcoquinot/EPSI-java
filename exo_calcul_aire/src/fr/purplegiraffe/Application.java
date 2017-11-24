package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        //Exemple d'utilisation
        int hauteurTriangle;
        int baseTriangle;
        int sommeTriangle;
        int aireTriangle;

        hauteurTriangle = ConsoleReader.readInt("Indiquer la base du triangle");
        baseTriangle = ConsoleReader.readInt("Indiquer la hauteur du triangle");
        sommeTriangle = hauteurTriangle * baseTriangle;
        aireTriangle = sommeTriangle / 2;
        System.out.println("l'aire du triangle est " +aireTriangle);
    }
}
