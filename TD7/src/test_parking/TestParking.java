package test_parking;

import autres_vehicules.Voiture;
import parking.Parking;

public class TestParking {

	public static void main(String[] args) {
		// Création de quelques voitures
		Voiture v1 = new Voiture(90.0, 2);
		Voiture v2 = new Voiture(210.0, 6);
		Voiture v3 = new Voiture(50.0, 2);
		Voiture v4 = new Voiture(200.0, 5);
		
        // Création d'un parking pouvant accueillir 4 voitures
        Parking parking = new Parking(4);

        // Garer les voitures dans le parking
        parking.garer(v1, 0);
        parking.garer(v2, 1);
        parking.garer(v3, 2);
        parking.garer(v4, 3);

        // Libérer une place dans le parking et afficher la voiture libérée
        System.out.println("La voiture libérée est : " + parking.liberer(3));

        // Chercher l'emplacement de la voiture v2 dans le parking
        System.out.println("La voiture n°2 se situe à l'emplacement : " + parking.chercher(v2) + "\n");

        // Afficher l'état du parking
        System.out.println(parking.toString());
    }
}