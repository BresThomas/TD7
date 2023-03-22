package personnes;

public class Etudiant extends Personne
{
    private int numEtu;

	/**
	* Cr�e un �tudiant ayant un nom et un num�ro d'�tudiant.
	*/
    public Etudiant(String nom, int num, int age)
    {
    	super(nom, age);
    	this.numEtu = num;
    }

    /**
	* Retourne une description d'un �tudiant incluant son nom et son num�ro
	* d'�tudiant.
	*/
    public String getInfo()
    {
    	return "Nom de l'�tudiant : "+ getNom()+ " num etudiant : "+ this.numEtu +", age : " + this.getAge();
    }
}
