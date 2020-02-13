package fr.esigelec.projetSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Exemple d'autowiring par annotation Pas besoin de setter , spring gère tout
 * seul
 * 
 * @author serais
 *
 */
public class Ecole3 {

	@Autowired // va rechercher un bean du même type, s'il en trouve plusieurs ,
				// récupère celui de même nom
	private Enseignant e1;

	@Autowired
	@Qualifier("e2") // permet de spécifier l'id exact du bean à injecter
	private Enseignant e2;

	public Enseignant getE1() {
		return e1;
	}

	public Enseignant getE2() {
		return e2;
	}

	@Override
	public String toString() {
		return "Ecole3 [e1=" + e1 + ", e2=" + e2 + "]";
	}
	
	
	

}
