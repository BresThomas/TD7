package test_boite;

import java.awt.Color;

import boite.Boite;
import boite.Objet;

public class TestBoite {


    /**
     * The main function of the program.
     *
     *
     * @param String[] args Pass command line arguments to the main function
     *
     * @return The string:
     *
     *
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Create a box with a green color
        Boite<String> b1 = new Boite<String>(Color.green);

        // Create a box with a blue color and an object
        Objet o1 = new Objet(Color.green);
        Boite<String> b2 = new Boite<String>(Color.blue, o1);

        // Create a box with a red color and add the previous box as a sub-box
        Boite<String> b3 = new Boite<String>(Color.red, b2);

        // Create a box with a yellow color, an object, and add the previous box as a sub-box
        Objet o3 = new Objet(Color.yellow);
        Boite<String> b4 = new Boite<String>(Color.yellow, o3, b3);

        // Print the number of sub-boxes for each box
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}