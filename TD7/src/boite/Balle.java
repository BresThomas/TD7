package boite;
/**
 * @(#)Balle.java
 *
 *
 * @author thomas
 * @version 1.00 2016/4/20
 */

import java.awt.Color;

public class Balle
{
	private Color couleur;
	private static int n = 0;
	private int id;


    /**
     * The Balle function creates a new Balle object with the following properties:
     *
     *
     *
     *
     * @return A balle object
     *
     *
     */
    public Balle()
    {
		this.couleur = Color.BLACK;
    	this.id = n++;
    }


    /**
     * The Balle function is a constructor for the Balle class.
     * It takes in a Color object and assigns it to the couleur field of this Balle object.
     * It also assigns an id number to this Balle object, which is equal to n, then increments n by 1.

     *
     * @param Color c Set the color of the ball
     *
     * @return A balle object
     *
     *
     */
    public Balle(Color c)
    {
    	this.couleur = c;
    	this.id = n++;
    }


    /**
     * The toString function returns a string representation of the object.
     *
     *
     *
     * @return The name of the class, the id and the color
     *
     *
     */
    public String toString()
    {
    	return getClass().getName() + id +  " " + couleur;
    }
}