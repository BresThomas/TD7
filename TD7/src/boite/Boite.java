package boite;

import java.awt.Color;
import java.util.ArrayList;

public class Boite<T> {
    private static final int MAX_BOITES = 5;

    private Color couleur;
    private Objet objet;
    private ArrayList<Boite<T>> boites;
    private int nbBoites;


    /**
     * The Boite function is a constructor for the Boite class.
     * It takes in a Color object and creates an empty ArrayList of Boites,
     * as well as initializing the number of boites to 0.

     *
     * @param Color couleur Set the color of the box
     *
     * @return A boite object
     *
     *
     */
    public Boite(Color couleur) {
        this.couleur = couleur;
        this.objet = null;
        this.boites = new ArrayList<Boite<T>>();
        this.nbBoites = 0;
    }


    /**
     * The Boite function is a constructor for the Boite class.
     * It takes in two parameters: a Color object and an Objet object.
     * The function sets the color of the box to be equal to couleur,
     * and it sets objet to be equal to objet.

     *
     * @param Color couleur Set the color of the box
     * @param Objet objet Create a new object in the boite class
     *
     * @return A box with a color and an object
     *
     *
     */
    public Boite(Color couleur, Objet objet) {
        this(couleur);
        this.objet = objet;
    }


    /**
     * The Boite function is a constructor for the Boite class.
     * It takes in two parameters: a Color object and another Boite object.
     * The function then creates an ArrayList of type T, which will be used to store other boxes inside this box.
     * Then, it adds the given box to that ArrayList using the add() method from Java's Collections API.

     *
     * @param Color couleur Set the color of the box
     * @param Boite&lt;T&gt; boite Add a box to the list of boxes
     *
     * @return A new boite object with a color and a list of boites
     *
     *
     */
    public Boite(Color couleur, Boite<T> boite) {
        this(couleur);
        try {
            this.boites.add(boite);
            this.nbBoites = 1;
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred while adding box.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: IllegalArgumentException occurred while adding box.");
        } catch (Exception e) {
            System.out.println("Error: Unknown exception occurred while adding box.");
        }
    }


    /**
     * The Boite function is a constructor for the Boite class.
     * It takes in two parameters: a Color object and an Objet object.
     * The function then creates a new Boite instance with the given color and object, as well as initializing its nbBoites field to 0 (since there are no boxes inside of it).

     *
     * @param Color couleur Set the color of the box
     * @param Objet objet Create an object of type objet
     * @param Boite&lt;T&gt; boite Add a box to the arraylist of boxes
     *
     * @return An object of the boite type
     *
     *
     */
    public Boite(Color couleur, Objet objet, Boite<T> boite) {
        this(couleur, objet);
        try {
            this.boites.add(boite);
            this.nbBoites = 1;
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred while adding box.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: IllegalArgumentException occurred while adding box.");
        } catch (Exception e) {
            System.out.println("Error: Unknown exception occurred while adding box.");
        }
    }


    /**
     * The getObjet function returns the objet variable.
     *
     *
     *
     * @return An object of type objet
     *
     *
     */
    public Objet getObjet() {
        return objet;
    }


    /**
     * The getCouleur function returns the color of a given object.
     *
     *
     *
     * @return A color object
     *
     *
     */
    public Color getCouleur() {
        return couleur;
    }


    /**
     * The contientObjet function checks if the current case contains an object.
     *
     *
     * @param Objet o Compare the object in the case with the one passed as parameter
     *
     * @return True if the object o is in the cell
     *
     *
     */
    public boolean contientObjet(Objet o) {
        return (objet != null && objet.equals(o));
    }


    /**
     * The estVide function checks if the current box is empty.
     *
     *
     *
     * @return True if the box is empty and false otherwise
     *
     *
     */
    public boolean estVide() {
        return (objet == null && nbBoites == 0);
    }


    /**
     * The ajouteBoite function adds a box to the ArrayList of boxes.
     *
     *
     * @param Boite&lt;T&gt; b Add a box to the arraylist of boxes
     *
     * @return Void, so it does not return anything
     *
     *
     */
    public void ajouteBoite(Boite<T> b) {
        try {
            if (nbBoites < MAX_BOITES) {
                boites.add(b);
                nbBoites++;
            }
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred while adding box.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: IllegalArgumentException occurred while adding box.");
        } catch (Exception e) {
            System.out.println("Error: Unknown exception occurred while adding box.");
        }
    }


    /**
     * The toString function returns a string representation of the object.
     *
     *
     *
     * @return A string representation of the object
     *
     *
     */
    @Override
    public String toString() {
        return "Boite [couleur= (" + couleur.getRed() + ", " + couleur.getGreen() + ", " + couleur.getBlue() +"), objet=" + objet + ", boites=" + boites + ", nbBoites="
                + nbBoites + "]";
    }
}
