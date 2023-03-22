package personnes;

public class Enseignant extends Personne
{
    private String matiere;

	/**
	* Cr�e un enseignant ayant un nom et une mati�re.
	*/
    public Enseignant(String nom, String mat, int age)
    {
        super(nom, age);
        this.matiere = mat;
    }

    /**
	* Retourne une description d'un enseignant incluant son nom et sa mat�re
	*/
    public String getInfo()
    {
    	return "Nom de l'enseignant : "+ getNom()+ " et le numero de la matiere est : "+ this.matiere +", age : " + this.getAge();
    }
}