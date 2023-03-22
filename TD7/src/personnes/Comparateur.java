package personnes;

import java.util.Comparator;

public class Comparateur implements Comparator<Personne> {
	
	public int compare(Personne personne1, Personne personne2) {
    	return personne1.getAge() - personne2.getAge(); 
	    	
	}
}
