package boite;

public class Mail
{
	private String de;
	private String a;
	private String corps;
	private static int n = 0;
	private int id;

	
	/**
	 * The Mail function is a constructor for the Mail class.
	 * It takes in three parameters, and sets them to the 
	 * corresponding fields of the object being created.
	 
	 *
	 *
	 * @return A mail object
	 *
	 *
	 */
	public Mail()
    {
    	this.de = "INDETERMINE";
    	this.a = "INDETERMINE";
    	this.corps = "INDETERMINE";
    	this.id = n++;
	}

    
	/**
	 * The Mail function is a constructor for the Mail class.
	 * It takes three parameters: de, a, and corps.
	 * The first parameter is the sender of the email (de).
	 * The second parameter is who it's being sent to (a).
	 * And finally, the third parameter is what's in it (corps).
	 
	 *
	 * @param String de Set the sender of the email
	 * @param String a Set the value of the &quot;a&quot; field
	 * @param String corps Set the body of the email
	 *
	 * @return Nothing
	 *
	 *
	 */
	public Mail(String de, String a, String corps)
    {
    	this.de = de;
    	this.a = a;
    	this.corps = corps;
    	this.id = n++;
    }

    
	/**
	 * The toString function returns a string representation of the object.
	 * 
	 *
	 *
	 * @return The class name, the id number, the sender's email address (de), 
	 *
	 *
	 */
	public String toString()
    {
    	return getClass().getName() + id + " De : " + de + " A : " + a + " Corps : " + corps;
    }
}