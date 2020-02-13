package fr.esigelec.projetSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Directeur {
	private String nom;
	private String prenom;
	@Autowired
	@Qualifier("Entreprise1")
	private Entreprise entreprise;
	public Directeur() {
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Directeur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Directeur [nom=" + nom + ", prenom=" + prenom +entreprise+"]";
	}
	
}
