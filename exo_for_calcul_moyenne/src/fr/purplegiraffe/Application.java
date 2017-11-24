package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale()
    {
        moyennenotes();
    }

    public void moyennenotes()
    {
        int somme = 0;

        int nombreNotes = ConsoleReader.readInt("Combien avez-vous de notes à rentrer?");

        for (int saisieNote = 0; saisieNote < nombreNotes ; saisieNote++)
        {
            int note = ConsoleReader.readInt("Indiquez votre note");
            somme = note + somme;
        }

        int  resultat = somme / nombreNotes;
        System.out.println("Votre moyenne est "+ resultat);


    }

}
