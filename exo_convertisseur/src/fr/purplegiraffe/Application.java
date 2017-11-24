package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        //Exemple d'utilisation

        double cm, pouces;
        final double TAUX_POUCES_CM = 2.54;
        double mesurePouce = ConsoleReader.readInt("Tapez votre mesure en pouces");
        double mesureCm = mesurePouce * 2.54;
        System.out.println("Votre mesure fait " + mesureCm);

    }
}
