package personnes;

// class implementant des personnes qui peuvent etre comparer en fonction du nom
// ceci respecte l'interface Comparable de java 
// c'est ce que signifie "implements Comparable<Personne>"
public abstract class Personne implements Comparable<Personne> {
    private String nom;
    private int age;

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
    }

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/** 
     * renvoie le nom
     * @return nom
     */
    public String getNom(){
    	return nom;
    }

    abstract String getInfo();

    public int compareTo(Personne autre){
    	return this.nom.compareTo(autre.nom); 
    }
}