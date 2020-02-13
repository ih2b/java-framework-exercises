package fr.esigelec.garage;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Voiture {
	@Id
	private int id;
	private String immatriculation;
	private String modele;
	private int km;
	public Voiture(){}
	public Voiture(int id,String immatriculation,String modele,int km) {
		this.id=id;
		this.immatriculation=immatriculation;
		this.modele=modele;
		this.km=km;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	

}
