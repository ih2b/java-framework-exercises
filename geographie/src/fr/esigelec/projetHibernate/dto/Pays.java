package fr.esigelec.projetHibernate.dto;

import java.util.List;

public class Pays {
	private int id;
	private String nom;
	private int superficie;
	private List<Ville> ville;
	
	public Pays() {}
	public Pays(String nom,int superficie) {
		
		this.nom=nom;
		this.superficie=superficie;
	}
	public Pays(int id,String nom,int superficie) {
		this.id=id;
		this.nom=nom;
		this.superficie=superficie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public String toString() {
		return id+" "+nom+" "+superficie;
	}
	public void setVille(List<Ville> ville) {
		this.ville = ville;
	}
	public List<Ville> getVille() {
		return ville;
	}
	}
