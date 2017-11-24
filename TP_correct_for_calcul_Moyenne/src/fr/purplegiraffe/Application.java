package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale()
    {
        moyenneMultiNotes();
    }

    void moyenneMultiNotes()
    {
        double moyenne;
        double somme = 0;
        int nbNotes;

        //Demander à l'utilisateur le nombre de notes
        nbNotes = ConsoleReader.readInt("Combien de notes à saisir ?");

        //Demander les notes individuellement
        for (int numNote = 0; numNote < nbNotes; numNote++) {
            //Demander à la personne de saisir la note
            double note = ConsoleReader.readDouble("Saisir la note " + numNote);

            //Faire grossir la somme avec la nouvelle note
            somme = somme + note;
        }

        //Calculer la moyenne
        if (nbNotes > 0) {
            moyenne = somme / nbNotes;
            System.out.println("Voici la moyenne : " + moyenne);
        }
    }

    void moyenne3notes()
    {
        double note1 = ConsoleReader.readDouble("Note 1");
        double note2 = ConsoleReader.readDouble("Note 2");
        double note3 = ConsoleReader.readDouble("Note 3");
        double moyenne = (note1 + note2 + note3) / 3;
        System.out.println("La moyenne de ces 3 notes vaut " + moyenne);
    }
}
