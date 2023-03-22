package personnes;

public class Etudiant extends Personne
{
    private int numEtu;

	/**
	* Crée un étudiant ayant un nom et un numéro d'étudiant.
	*/
    public Etudiant(String nom, int num, int age)
    {
    	super(nom, age);
    	this.numEtu = num;
    }

    /**
	* Retourne une description d'un étudiant incluant son nom et son numéro
	* d'étudiant.
	*/
    public String getInfo()
    {
    	return "Nom de l'étudiant : "+ getNom()+ " num etudiant : "+ this.numEtu +", age : " + this.getAge();
    }
}
