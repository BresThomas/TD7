package boite;
import java.awt.*;

public class Objet {
	Color couleur;

	/**
	 * The Objet function is a constructor for the Objet class.
	 * It sets the color of an object to white.

	 *
	 *
	 * @return A color
	 */
	public Objet() {
		couleur = Color.white;
	}


	/**
	 * The Objet function is a constructor for the Objet class.
	 * It takes two parameters: a Color object and a String.
	 * The Color object is assigned to the couleur variable, and
	 * the String is assigned to nom.

	 *
	 * @param Color c Set the color of the object
	 * @param String n Set the name of the object
	 *
	 * @return An object of type objet
	 */
	public Objet(Color c) {
		couleur = c;
	}


	/**
	 * The changeCouleur function changes the color of an object to a new color.
	 *
	 *
	 * @param Color c Change the color of the object
	 *
	 * @return Nothing
	 */
	public void changeCouleur(Color c) {
		if (!couleur.equals(c))
			couleur = c;
		else
			System.out.println("L'objet est d�j� de couleur "+c);
	}


	/**
	 * The equals function compares two objects and returns true if they are equal.
	 *
	 *
	 * @param Object o Compare the current object with another one
	 *
	 * @return A boolean
	 */
	public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}


	/**
	 * The toString function returns a string representation of the object.
	 *
	 *
	 *
	 * @return The string &quot;objet &quot;+couleur
	 */
	public String toString() {
		return "Objet "+couleur;
	}

}
