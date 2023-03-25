package personnes;

public class Enseignant extends Personne
{
    private String matiere;

    /**
     * The Enseignant function is a constructor for the Enseignant class.
     * It takes in three parameters: nom, mat, and age.
     * The function sets the name of the Enseignant to be equal to nom,
     * their subject matter expertise (matiere) to be equal to mat, and their age
     * (anneeNaissance) to be equal to age.

     *
     * @param String nom Set the name of the teacher
     * @param String mat Set the matiere field
     * @param int age Set the age of the enseignant object
     *
     * @return An enseignant object with the specified parameters
     *
     *
     */
    public Enseignant(String nom, String mat, int age)
    {
        super(nom, age);
        this.matiere = mat;
    }

    /**
     * The getInfo function returns a string containing the name, age and subject of the teacher.
     *
     *
     *
     * @return A string
     *
     *
     */
    public String getInfo()
    {
    	return "Nom de l'enseignant : "+ getNom()+ " et le numero de la matiere est : "+ this.matiere +", age : " + this.getAge();
    }
}