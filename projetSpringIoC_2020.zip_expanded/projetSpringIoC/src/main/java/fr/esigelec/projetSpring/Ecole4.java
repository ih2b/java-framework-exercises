package fr.esigelec.projetSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Exemple d'autowiring par annotation Pas besoin de setter , spring g�re tout
 * seul
 * 
 * @author serais
 *
 */
@Component("esigelec")
public class Ecole4 {

	@Autowired // va rechercher un bean du m�me type, s'il en trouve plusieurs ,
				// r�cup�re celui de m�me nom
	private Enseignant e1;

	@Autowired
	@Qualifier("e2") // permet de sp�cifier l'id exact du bean � injecter
	private Enseignant e2;

	public Enseignant getE1() {
		return e1;
	}

	public Enseignant getE2() {
		return e2;
	}

}
