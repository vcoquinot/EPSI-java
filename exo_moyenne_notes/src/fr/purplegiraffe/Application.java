package fr.purplegiraffe;

import com.sun.org.apache.xpath.internal.SourceTree;
import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {
        //Exemple d'utilisation
        int note1;
        int note2;
        int note3;


        note1 = ConsoleReader.readInt("Indiquez la note 1");
        note2 = ConsoleReader.readInt("Indiquez la note 2");
        note3 = ConsoleReader.readInt("Indiquez la note 3");
        int moyenne = (note1 + note2 + note3) /3;
        System.out.println("La moyenne est " +moyenne);
    }
}
