package fr.esigelec.projetSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("esigelec1")
public class Salle {
	private String numero;
	private char batiment ;
	private List<Ordinateur> ordinateurs;
	public Salle() {
		super();
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public char getBatiment() {
		return batiment;
	}
	public void setBatiment(char batiment) {
		this.batiment = batiment;
	}
	public List<Ordinateur> getOrdinateurs() {
		return ordinateurs;
	}
	public void setOrdinateurs(List<Ordinateur> ordinateurs) {
		this.ordinateurs = ordinateurs;
	}
	public String toString() {
		return "Salle [numero=" + numero + ", batiment=" + batiment + ", Liste Ordinateur=" + ordinateurs + "]";
	}
}
