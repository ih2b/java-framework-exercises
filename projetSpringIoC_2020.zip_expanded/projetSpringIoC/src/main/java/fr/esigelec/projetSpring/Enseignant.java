package fr.esigelec.projetSpring;

import java.util.List;

public class Enseignant {

	private String nom;
	private String prenom;
	private List<String> listeEleves;
	
	public Enseignant() {
		super();
	}

	public Enseignant(String nom, String prenom, List<String> listeEleves) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeEleves = listeEleves;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<String> getListeEleves() {
		return listeEleves;
	}

	public void setListeEleves(List<String> listeEleves) {
		this.listeEleves = listeEleves;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", listeEleves=" + listeEleves + "]";
	}
	
	
	
	

}
