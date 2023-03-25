package personnes;

import java.util.Comparator;

public class Comparateur implements Comparator<Personne> {

	/**
	 * The compare function compares the ages of two Personne objects.
	 *
	 *
	 * @param Personne personne1 Compare the age of personne2 to it
	 * @param Personne personne2 Compare it with the personne personne2 parameter
	 *
	 * @return The difference between the ages of personne 1 and personne 2
	 *
	 *
	 */
	public int compare(Personne personne1, Personne personne2) {
    	return personne1.getAge() - personne2.getAge();

	}
}
