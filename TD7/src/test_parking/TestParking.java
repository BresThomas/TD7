package test_parking;

import autres_vehicules.Voiture;
import parking.Parking;

public class TestParking {


    /**
     * The main function of the program.
     *
     *
     * @param String[] args Pass command line arguments to the main function
     *
     * @return Nothing
     *
     *
     */
    public static void main(String[] args) {
		// Cr�ation de quelques voitures
		Voiture v1 = new Voiture(90.0, 2);
		Voiture v2 = new Voiture(210.0, 6);
		Voiture v3 = new Voiture(50.0, 2);
		Voiture v4 = new Voiture(200.0, 5);

        // Cr�ation d'un parking pouvant accueillir 4 voitures
        Parking parking = new Parking(4);

        // Garer les voitures dans le parking
        parking.garer(v1, 0);
        parking.garer(v2, 1);
        parking.garer(v3, 2);
        parking.garer(v4, 3);

        // Lib�rer une place dans le parking et afficher la voiture lib�r�e
        System.out.println("La voiture lib�r�e est : " + parking.liberer(3));

        // Chercher l'emplacement de la voiture v2 dans le parking
        System.out.println("La voiture n�2 se situe � l'emplacement : " + parking.chercher(v2) + "\n");

        // Afficher l'�tat du parking
        System.out.println(parking.toString());
    }
}