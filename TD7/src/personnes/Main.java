package personnes;

import java.util.*;

public class Main
{

    /**
     * The main function creates three objects of type Personne, one of each subclass.
     * It then adds them to a list and prints out their information using the getInfo() method.
     * The main function also sorts the list by name using a comparator class and prints out
     * the sorted list's information again. Finally, it compares all three names with each other
     * in two nested for loops to demonstrate that they are indeed sorted alphabetically.

     *
     * @param String[] args Pass command line arguments to the program
     *
     * @return A value of type int
     *
     *
     */
    public static void main(String[] args)
    {
        Etudiant bart = new Etudiant("Bart",17, 15);
        Etudiant max = new Etudiant("Max",43,12);
        Enseignant tom = new Enseignant("Tao","francais",98);

		//Cr�e une liste w contenant bart, max et tom
        List<Personne> w = new ArrayList<Personne>();
        w.add(bart);
        w.add(max);
        w.add(tom);

		//Affiche les informations associ�es � chaque personnes de la liste
        for(Personne p : w)
        {
            System.out.println(p.getInfo());
        }

        tom.compareTo(max);

		//Exemple de tri de la liste w
        Collections.sort(w, new Comparateur());
        System.out.println("---------tri-----------");

		//Affiche les informations associ�es � chaque personne apr�s tri de la liste
        for(Personne p : w)
        {
            System.out.println(p.getInfo());
        }

        // Une boucle dans une boucle pour comparer les 3 personnes les uns avec les autres
        for (Personne p : w) {
        	for (Personne autrePersonne : w) {
        		System.out.println(p.getNom().compareTo(autrePersonne.getNom()));
        	}
        }

    }
}