package personnes;

public class Enseignant extends Personne
{
    private String matiere;

	/**
	* Crée un enseignant ayant un nom et une matière.
	*/
    public Enseignant(String nom, String mat, int age)
    {
        super(nom, age);
        this.matiere = mat;
    }

    /**
	* Retourne une description d'un enseignant incluant son nom et sa matère
	*/
    public String getInfo()
    {
    	return "Nom de l'enseignant : "+ getNom()+ " et le numero de la matiere est : "+ this.matiere +", age : " + this.getAge();
    }
}