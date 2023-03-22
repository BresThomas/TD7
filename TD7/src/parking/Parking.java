package parking;

import java.util.HashMap;
import autres_vehicules.Voiture;

public class Parking {
	private int capacite;
	private HashMap<Integer, Voiture> parking; 
	
	public Parking(int capacite) {
		this.capacite = capacite;
		this.parking = new HashMap<Integer,Voiture>();
	}
	
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
	
	// renvoie la clé de la voiture si elle est dans le parking
	public int chercher(Voiture v) throws IllegalStateException {
		for (int key: parking.keySet()) {
			if(parking.get(key).equals(v)) {
				return key;
			}
		}
		throw new IllegalStateException("Cette voiture n'est pas dans le parking");
	}
	
	public String toString() {
		String resultat = new String();
		for(int i=0; i<parking.size(); i++) {
			resultat += "Place n°" + i + " " + parking.get(i).toString() + "\n";
		}
		return resultat;
	}
}
