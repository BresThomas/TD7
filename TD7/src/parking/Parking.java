package parking;

import java.util.HashMap;
import autres_vehicules.Voiture;

public class Parking {
	private int capacite;
	private HashMap<Integer, Voiture> parking;


	/**
	 * The Parking function creates a new parking lot with the given capacity.
	 *
	 *
	 * @param int capacite Set the capacity of the parking
	 *
	 * @return A hashmap&amp;lt;integer,voiture&amp;gt;
	 *
	 *
	 */
	public Parking(int capacite) {
		this.capacite = capacite;
		this.parking = new HashMap<Integer,Voiture>();
	}


	/**
	 * The garer function takes a Voiture object and an integer as parameters.
	 * It then checks if the parking lot is full, and if it isn't, it adds the car to the parking lot.
	 * If there is no space left in the parking lot, an IllegalStateException will be thrown.

	 *
	 * @param Voiture v Know which car is leaving the parking lot
	 * @param int numPlace Determine the place where the car is parked
	 *
	 * @return A boolean
	 *
	 *
	 */
	public void garer(Voiture v, int numPlace) throws IndexOutOfBoundsException, IllegalStateException{
		if(0>numPlace || numPlace>this.capacite) {
			throw new IndexOutOfBoundsException();
		}

		if(parking.get(numPlace) == null) {
			parking.put(numPlace, v);
		}
		else {
			throw new IllegalStateException("Place non disponible");
		}
	}


	/**
	 * The liberer function removes a car from the parking lot.
	 *
	 *
	 * @param int numPlace Indicate the position of the car in the parking lot
	 *
	 * @return The car that was in the parking place
	 *
	 *
	 */
	public Voiture liberer(int numPlace) throws IndexOutOfBoundsException, IllegalStateException{

		if(0>numPlace || numPlace>this.capacite) {
			throw new IndexOutOfBoundsException();
		}
		Voiture voitRetour = parking.get(numPlace);

		if(parking.get(numPlace) != null) {
			parking.remove(numPlace);
		}
		else {
			throw new IllegalStateException("Cette place est deja vide");
		}

		return voitRetour;
	}

	/**
	 * The chercher function takes a Voiture object as an argument and returns the key of that object in the HashMap.
	 *
	 *
	 * @param Voiture v Find the key of the car in the parking
	 *
	 * @return The key of the car in the parking
	 *
	 *
	 */
	public int chercher(Voiture v) throws IllegalStateException {
		for (int key: parking.keySet()) {
			if(parking.get(key).equals(v)) {
				return key;
			}
		}
		throw new IllegalStateException("Cette voiture n'est pas dans le parking");
	}


	/**
	 * The toString function returns a string representation of the parking lot.
	 *
	 *
	 *
	 * @return A string containing all the information about the parking lot
	 *
	 *
	 */
	public String toString() {
		String resultat = new String();
		for(int i=0; i<parking.size(); i++) {
			resultat += "Place n�" + i + " " + parking.get(i).toString() + "\n";
		}
		return resultat;
	}
}
