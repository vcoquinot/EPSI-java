package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        //Exemple d'utilisation
        System.out.println("Bienvenue dans cette application!");
        int ageUtilisateur = ConsoleReader.readInt("Quel est votre âge ?");
        if (ageUtilisateur >= 18) {
            System.out.print("Vous êtes majeur ");
        } else {
            System.out.print("Vous êtes mineur ");
        }
        System.out.println("(" + ageUtilisateur + " ans)");
    }
}
