package test_boite;

import java.awt.Color;

import boite.Boite;
import boite.Objet;

public class TestBoite {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
        Objet o1 = new Objet(Color.green);
        Objet o2 = new Objet(Color.blue);
        Objet o3 = new Objet(Color.red);
        Objet o4 = new Objet(Color.yellow);
        
        Boite b1 = new Boite(Color.green);
        Boite b2 = new Boite(Color.blue, o1);
        Boite b3 = new Boite(Color.red, b2);
        Boite b4 = new Boite(Color.yellow, o3, b3);
        b1.ajouteBoite(b4);
        
        // test d'affichage
        System.out.println(b4);
    }
}
