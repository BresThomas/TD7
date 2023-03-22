package personnes;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Etudiant bart = new Etudiant("Bart",17, 15);
        Etudiant max = new Etudiant("Max",43,12);
        Enseignant tom = new Enseignant("Tao","francais",98);

		//Crée une liste w contenant bart, max et tom
        List<Personne> w = new ArrayList<Personne>();
        w.add(bart);
        w.add(max);
        w.add(tom);
       
		//Affiche les informations associées à chaque personnes de la liste
        for(Personne p : w)
        {
            System.out.println(p.getInfo());
        }
        
        tom.compareTo(max);

		//Exemple de tri de la liste w
        Collections.sort(w, new Comparateur());
        System.out.println("---------tri-----------");

		//Affiche les informations associées à chaque personne après tri de la liste
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