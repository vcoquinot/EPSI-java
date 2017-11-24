
package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

        public class Application {
            public void fonctionPrincipale() {
                //Exemple d'utilisation
                int choixMenu;
                final int CHOIX_QUITTER = 7;
                do {
                    do {
                        System.out.println("Bienvenue chez MacDo!");
                        System.out.println("Voici le menu");
                        System.out.println("1 - BigMac");
                        System.out.println("2 - Filet-o-fish");
                        System.out.println("3 - Royal Cheese\n4 - Happy Meal\n" +
                                "5 - McWrap");
                        System.out.println("6 - Royal Deluxe");
                        System.out.println(CHOIX_QUITTER + " - Quitter");

                        choixMenu = ConsoleReader.readInt("Faites votre choix");

                        if (choixMenu < 1 || choixMenu > CHOIX_QUITTER) {
                            System.out.println("Erreur, menu inconnu");
                        }
                    } while (choixMenu < 1 || choixMenu > CHOIX_QUITTER);

                    if (choixMenu != CHOIX_QUITTER) {
                        String typeMenu = "";
                        if (choixMenu == 1) {
                            typeMenu = "BigMac";
                        } else if (choixMenu == 2) {
                            typeMenu = "Filet-o-fish";
                        } else if (choixMenu == 3) {
                            typeMenu = "Royal Cheese";
                        } else if (choixMenu == 4) {
                            typeMenu = "Happy meal";
                        } else if (choixMenu == 5) {
                            typeMenu = "McWrap";
                        } else {
                            typeMenu = "Royal Deluxe";
                        }

                /*
                switch (choixMenu) {
                    case 1:
                        typeMenu = "BigMac";
                        break;
                    case 2:
                        typeMenu = "Filet-o-fish";
                        break;
                    default:
                        typeMenu = "";
                        break;
                }
                */
                        System.out.println("Vous avez choisi le " + typeMenu);
                    } else {
                        System.out.println("Au revoir");
                    }

                } while (choixMenu != CHOIX_QUITTER);

            }
        }


