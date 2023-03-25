package personnes;

public class Etudiant extends Personne
{
    private int numEtu;

	/**
	 * The Etudiant function is a constructor for the Etudiant class.
	 * It takes in three parameters: nom, num, and age.
	 * The function sets the name of the student to be equal to nom,
	 * their number to be equal to num, and their age to be equal
	 * to age. This function also calls on its superclass's constructor
	 * (Personne) with two parameters: nom and age. This allows us access
	 * Personne's functions such as getNom() or getAge().
	 *
	 * @param String nom Set the name of the student
	 * @param int num Set the num attribute
	 * @param int age Set the age of the etudiant object
	 *
	 * @return A string
	 *
	 *
	 */
	public Etudiant(String nom, int num, int age)
    {
    	super(nom, age);
    	this.numEtu = num;
    }


	/**
	 * The getInfo function returns a string containing the name, age and student number of the student.
	 *
	 *
	 *
	 * @return A string containing the name, age and student number of the student
	 *
	 *
	 */
	public String getInfo()
    {
    	return "Nom de l'�tudiant : "+ getNom()+ " num etudiant : "+ this.numEtu +", age : " + this.getAge();
    }
}
