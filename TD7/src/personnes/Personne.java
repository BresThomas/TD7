package personnes;

// class implementant des personnes qui peuvent etre comparer en fonction du nom
// ceci respecte l'interface Comparable de java
// c'est ce que signifie "implements Comparable<Personne>"
public abstract class Personne implements Comparable<Personne> {
    private String nom;
    private int age;


	/**
	 * The Personne function is a constructor for the Personne class.
	 * It takes two parameters, nom and age, and assigns them to the
	 * corresponding fields of the object being constructed.

	 *
	 * @param String nom Set the value of the nom variable
	 * @param int age Set the age of the person
	 *
	 * @return A personne object
	 *
	 *
	 */
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
    }


	/**
	 * The getAge function returns the age of the person.
	 *
	 *
	 *
	 * @return The age of the person
	 *
	 *
	 */
	public int getAge() {
		return age;
	}


	/**
	 * The setAge function sets the age of a person.
	 *
	 *
	 * @param int age Set the age of the object
	 *
	 * @return Nothing, so it is void
	 *
	 *
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * The setNom function sets the name of a person.
	 *
	 *
	 * @param String nom Set the value of the nom variable
	 *
	 * @return Nothing, so it should be void
	 *
	 *
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * The getNom function returns the name of the person.
	 *
	 *
	 *
	 * @return The name of the player
	 *
	 *
	 */
	public String getNom(){
    	return nom;
    }

    abstract String getInfo();


	/**
	 * The compareTo function compares two Personne objects by their names.
	 *
	 *
	 * @param Personne autre Compare the current object to another personne object
	 *
	 * @return A negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
	 *
	 *
	 */
	public int compareTo(Personne autre){
    	return this.nom.compareTo(autre.nom);
    }
}