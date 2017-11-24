package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {



    void fonctionPrincipale() {
        final int CHOIX_QUITTER = 5;
        final int CHOIX_DIVISION = 4;
        final int CHOIX_MULTIPLICATION = 3;
        final int CHOIX_SOUSTRACTION = 2;
        final int CHOIX_ADDITION = 1;
        System.out.println("Bienvenue");

        int choixOp;
        do
        {
            System.out.println("1 - Add");
            System.out.println("2 - Sous");
            System.out.println("3 - Mult");
            System.out.println("4 - div");
            System.out.println("5 - QUITTER");

            boolean saisieValide = true;
            do
            {
                choixOp = ConsoleReader.readInt("Saisir votre valeur : ");
                saisieValide = choixOp >= 1 && choixOp <= CHOIX_QUITTER;
                if (saisieValide == false)
                {
                    System.out.println("Valeur incorrecte, veuillez choisir entre 1 et 4");
                }
            } while (saisieValide == false);

            double valeur1 = 0, valeur2 = 0;
            if (choixOp != CHOIX_QUITTER)
                {
                valeur1 = ConsoleReader.readInt("Veuillez saisir votre premiere valeur : ");
                boolean valeurInterdite;
                do
                {
                    valeur2 = ConsoleReader.readInt("Veuillez saisir votre deuxieme valeur : ");
                    valeurInterdite = (choixOp == CHOIX_DIVISION && valeur2 == 0);
                    if (valeurInterdite) {
                        System.out.println("La division par 0 n'est pas possible");
                    }
                } while (valeurInterdite); //interdire la division par 0

                double resultat = 0;
                switch (choixOp)
                {
                    case CHOIX_ADDITION:
                        resultat = valeur1 + valeur2;
                        break;
                    case CHOIX_SOUSTRACTION:
                        resultat = valeur1 - valeur2;
                        break;
                    case CHOIX_MULTIPLICATION:
                        resultat = valeur1 * valeur2;
                        break;
                    case CHOIX_DIVISION:
                        resultat = valeur1 / valeur2;
                        break;
                    default:
                        break;
                }

                System.out.println("Voici votre resultat : " + resultat);
            }
        } while (choixOp != CHOIX_QUITTER);

        System.out.println("Au revoir");
    }

}
