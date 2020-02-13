package fr.esigelec.projetHibernate.dto;

public class Ville {

		private int id;
		private String nom;
		private int nbHabitants;
	    private Pays pays;
		public Ville() {}
		public Ville(int id,String nom,int nbHabitants) {
			this.id=id;
			this.nom=nom;
			this.nbHabitants=nbHabitants;
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
		public int getNbHabitants() {
			return nbHabitants;
		}
		public void setNbHabitants(int nbHabitants) {
			this.nbHabitants = nbHabitants;
		}
		public String toString() {
			return id+" "+nom+" "+nbHabitants;
		}
		public Pays getPays() {
		    return pays;
		}
	    public void setPays(Pays pays) {
		        this.pays = pays;
		    }

}
