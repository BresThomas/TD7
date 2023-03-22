package boite;

import java.awt.Color;
import java.util.ArrayList;

public class Boite<T> {
    private static final int MAX_BOITES = 5;
    
    private Color couleur;
    private Objet objet;
    private ArrayList<Boite<T>> boites;
    private int nbBoites;

    public Boite(Color couleur) {
        this.couleur = couleur;
        this.objet = null;
        this.boites = new ArrayList<Boite<T>>();
        this.nbBoites = 0;
    }

    public Boite(Color couleur, Objet objet) {
        this(couleur);
        this.objet = objet;
    }

    public Boite(Color couleur, Boite<T> boite) {
        this(couleur);
        this.boites.add(boite);
        this.nbBoites = 1;
    }

    public Boite(Color couleur, Objet objet, Boite<T> boite) {
        this(couleur, objet);
        this.boites.add(boite);
        this.nbBoites = 1;
    }

    public Objet getObjet() {
        return objet;
    }

    public Color getCouleur() {
        return couleur;
    }

	public boolean contientObjet(Objet o) {
        return (objet != null && objet.equals(o));
    }

    public boolean estVide() {
        return (objet == null && nbBoites == 0);
    }

    public void ajouteBoite(Boite<T> b) {
        if (nbBoites < MAX_BOITES) {
            boites.add(b);
            nbBoites++;
        }
    }
    @Override
	public String toString() {
		return "Boite [couleur= (" + couleur.getRed() + ", " + couleur.getGreen() + ", " + couleur.getBlue() +"), objet=" + objet + ", boites=" + boites + ", nbBoites="
				+ nbBoites + "]";
	}
}
